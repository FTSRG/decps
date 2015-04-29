package hu.bme.mit.inf.cps.rules;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.ResourceRequirement;
import hu.bme.mit.inf.cps.patterns.MoveMatch;
import hu.bme.mit.inf.cps.patterns.StopInstanceMatch;
import hu.bme.mit.inf.cps.patterns.util.MoveProcessor;
import hu.bme.mit.inf.cps.rdf.RdfConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class MoveAllocationRule extends MoveProcessor implements ICyberPhysicalSystemRule {

	private enum State{ stop, delete, install, start}
	private State state = State.stop;
	
	@Override
	public void process(ApplicationInstance pAppInstance, HostInstance pFrom,
			HostInstance pTo, ResourceRequirement pReq) {
		
		pAppInstance.getAllocatedTo().remove(pFrom);
		pAppInstance.getAllocatedTo().add(pTo);
		
		pTo.setAvailableMemory(pTo.getAvailableMemory() - pReq.getRequiredMemory());
		pTo.setAvailableHdd(pTo.getAvailableHdd() - pReq.getRequiredHdd());
		pTo.setAvailableCpu(pTo.getAvailableCpu() - pReq.getRequiredCpu());
		
		pFrom.setAvailableMemory(pFrom.getAvailableMemory() + pReq.getRequiredMemory());
		pFrom.setAvailableHdd(pFrom.getAvailableHdd() + pReq.getRequiredHdd());
		pFrom.setAvailableCpu(pFrom.getAvailableCpu() + pReq.getRequiredCpu());
	}

	@Override
	public Document[] getXmlOperation(IPatternMatch match) throws ParserConfigurationException {
		if (!(match instanceof MoveMatch)) {
			throw new IllegalArgumentException();
		}

		MoveMatch m = (MoveMatch) match;

		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc_stop = dBuilder.newDocument();
			Document doc_unallocate = dBuilder.newDocument();
			Document doc_allocate = dBuilder.newDocument();
			Document doc_start = dBuilder.newDocument();

			//Stop xml
			{
				Element installCommand = doc_stop.createElement("StartCommand");
				Element commandType = doc_stop.createElement("commandType");
				Element nodeIp = doc_stop.createElement("nodeIp");
				Element exeFileUrl = doc_stop.createElement("exeFileUrl");
				Element exeType = doc_stop.createElement("exeType");
				Element dbUrl = doc_stop.createElement("dbUrl");
				Element dbUser = doc_stop.createElement("dbUser");
				Element dbPwd = doc_stop.createElement("dbPwd");
	
				doc_stop.appendChild(installCommand);
				installCommand.appendChild(commandType);
				installCommand.appendChild(nodeIp);
				installCommand.appendChild(exeFileUrl);
				installCommand.appendChild(exeType);
				installCommand.appendChild(dbUrl);
				installCommand.appendChild(dbUser);
				installCommand.appendChild(dbPwd);
	
				commandType.setTextContent("false");
				nodeIp.setTextContent(m.getAppInstance().getAllocatedTo().get(0).getNodeIp());
				exeFileUrl.setTextContent(m.getAppInstance().getType().getExeFileUrl());
				exeType.setTextContent(m.getAppInstance().getType().getExeType());
				dbUrl.setTextContent(m.getAppInstance().getType().getCps().getDbUrl());
				dbUser.setTextContent(m.getAppInstance().getDbUser());
				dbPwd.setTextContent(m.getAppInstance().getDbPassword());
			}
			
			//unallocate
			{
				Element installCommand = doc_unallocate.createElement("InstallCommand");
				Element commandType = doc_unallocate.createElement("commandType");
				Element nodeIp = doc_unallocate.createElement("nodeIp");
				Element appName = doc_unallocate.createElement("appName");
				Element zipUrl = doc_unallocate.createElement("zipUrl");

				doc_unallocate.appendChild(installCommand);
				installCommand.appendChild(commandType);
				installCommand.appendChild(nodeIp);
				installCommand.appendChild(appName);
				installCommand.appendChild(zipUrl);

				commandType.setTextContent("false");
				nodeIp.setTextContent(m.getFrom().getNodeIp());
				appName.setTextContent(m.getAppInstance().getType().getId());
				zipUrl.setTextContent(m.getAppInstance().getType().getZipFile());
			}
			
			//allocate
			{
				Element installCommand = doc_unallocate.createElement("InstallCommand");
				Element commandType = doc_unallocate.createElement("commandType");
				Element nodeIp = doc_unallocate.createElement("nodeIp");
				Element appName = doc_unallocate.createElement("appName");
				Element zipUrl = doc_unallocate.createElement("zipUrl");

				doc_unallocate.appendChild(installCommand);
				installCommand.appendChild(commandType);
				installCommand.appendChild(nodeIp);
				installCommand.appendChild(appName);
				installCommand.appendChild(zipUrl);

				commandType.setTextContent("true");
				nodeIp.setTextContent(m.getTo().getNodeIp());
				appName.setTextContent(m.getAppInstance().getType().getId());
				zipUrl.setTextContent(m.getAppInstance().getType().getZipFile());
			}
			
			//Start xml
			{
				Element installCommand = doc_stop.createElement("StartCommand");
				Element commandType = doc_stop.createElement("commandType");
				Element nodeIp = doc_stop.createElement("nodeIp");
				Element exeFileUrl = doc_stop.createElement("exeFileUrl");
				Element exeType = doc_stop.createElement("exeType");
				Element dbUrl = doc_stop.createElement("dbUrl");
				Element dbUser = doc_stop.createElement("dbUser");
				Element dbPwd = doc_stop.createElement("dbPwd");
	
				doc_stop.appendChild(installCommand);
				installCommand.appendChild(commandType);
				installCommand.appendChild(nodeIp);
				installCommand.appendChild(exeFileUrl);
				installCommand.appendChild(exeType);
				installCommand.appendChild(dbUrl);
				installCommand.appendChild(dbUser);
				installCommand.appendChild(dbPwd);
	
				commandType.setTextContent("true");
				nodeIp.setTextContent(m.getAppInstance().getAllocatedTo().get(0).getNodeIp());
				exeFileUrl.setTextContent(m.getAppInstance().getType().getExeFileUrl());
				exeType.setTextContent(m.getAppInstance().getType().getExeType());
				dbUrl.setTextContent(m.getAppInstance().getType().getCps().getDbUrl());
				dbUser.setTextContent(m.getAppInstance().getDbUser());
				dbPwd.setTextContent(m.getAppInstance().getDbPassword());
			}
			return new Document[] { doc_stop, doc_unallocate, doc_allocate, doc_start };

		} catch (ParserConfigurationException e) {
		}

		return null;
	}

	@Override
	public void executeRdf(IPatternMatch match) throws Exception {
		RdfConnection connection = new RdfConnection();
		MoveMatch m = (MoveMatch) match;
		ApplicationInstance appInstance = m.getAppInstance();
		HostInstance hostInstance = m.getTo();
		
		switch (state) {
		case stop:
			state = State.delete;
			connection.stopAppOnDevice(appInstance.getId());
			break;
		case delete:
			state = State.install;
			//Nothing to do with RDF
			break;
		case install:
			state = State.start;
			connection.insertApp(appInstance);
			break;
		case start:
			state = State.stop;
			connection.startAppOnDevice(appInstance.getId(), hostInstance.getId());
			break;

		default:
			break;
		}
		
	}
}
