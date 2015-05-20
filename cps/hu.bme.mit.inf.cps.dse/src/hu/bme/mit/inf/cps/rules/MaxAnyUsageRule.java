package hu.bme.mit.inf.cps.rules;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.HostType;
import hu.bme.mit.inf.cps.ResourceRequirement;
import hu.bme.mit.inf.cps.State;
import hu.bme.mit.inf.cps.patterns.MaxAnyUsageMatch;
import hu.bme.mit.inf.cps.patterns.MoveMatch;
import hu.bme.mit.inf.cps.patterns.StopInstanceMatch;
import hu.bme.mit.inf.cps.patterns.util.MaxAnyUsageProcessor;
import hu.bme.mit.inf.cps.rdf.RdfConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class MaxAnyUsageRule extends MaxAnyUsageProcessor implements ICyberPhysicalSystemRule {

	@Override
	public Document[] getXmlOperation(IPatternMatch match) throws ParserConfigurationException {
		if (!(match instanceof MaxAnyUsageMatch)) {
			throw new IllegalArgumentException();
		}

		MaxAnyUsageMatch m = (MaxAnyUsageMatch) match;

		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc_stop = dBuilder.newDocument();
			Document doc_unallocate = dBuilder.newDocument();

			//Stop xml
			{
				Element installCommand = doc_stop.createElement("StartCommand");
				Element commandType = doc_stop.createElement("commandType");
				Element nodeIp = doc_stop.createElement("nodeIp");
				Element sshPort = doc_stop.createElement("sshPort");
				Element appName = doc_stop.createElement("appName");
				Element args = doc_stop.createElement("cmdArgs");
				Element exeFileUrl = doc_stop.createElement("exeFileUrl");
				Element exeType = doc_stop.createElement("exeType");
				Element dbUrl = doc_stop.createElement("dbUrl");
				Element dbUser = doc_stop.createElement("dbUser");
				Element dbPwd = doc_stop.createElement("dbPwd");

				doc_stop.appendChild(installCommand);
				installCommand.appendChild(commandType);
				installCommand.appendChild(nodeIp);
				installCommand.appendChild(sshPort);
				installCommand.appendChild(appName);
				installCommand.appendChild(args);
				installCommand.appendChild(exeFileUrl);
				installCommand.appendChild(exeType);
				installCommand.appendChild(dbUrl);
				installCommand.appendChild(dbUser);
				installCommand.appendChild(dbPwd);

				commandType.setTextContent("false");
				nodeIp.setTextContent(m.getApp().getAllocatedTo().get(0).getNodeIp().split(":")[0]);
				sshPort.setTextContent(m.getApp().getAllocatedTo().get(0).getNodeIp().split(":")[1]);
				appName.setTextContent(m.getApp().getType().getId());
				args.setTextContent(m.getApp().getArgs());
				exeFileUrl.setTextContent(m.getApp().getType().getExeFileUrl());
				exeType.setTextContent(m.getApp().getType().getExeType());
				dbUrl.setTextContent(m.getApp().getType().getCps().getDbUrl());
				dbUser.setTextContent(m.getApp().getDbUser());
				dbPwd.setTextContent(m.getApp().getDbPassword());

			}
			
			{
				Element installCommand = doc_unallocate.createElement("InstallCommand");
				Element commandType = doc_unallocate.createElement("commandType");
				Element nodeIp = doc_unallocate.createElement("nodeIp");
				Element sshPort = doc_unallocate.createElement("sshPort");
				Element appName = doc_unallocate.createElement("appName");
				Element zipUrl = doc_unallocate.createElement("zipUrl");

				doc_unallocate.appendChild(installCommand);
				installCommand.appendChild(commandType);
				installCommand.appendChild(nodeIp);
				installCommand.appendChild(sshPort);
				installCommand.appendChild(appName);
				installCommand.appendChild(zipUrl);

				commandType.setTextContent("true");
				nodeIp.setTextContent(m.getHost().getNodeIp().split(":")[0]);
				sshPort.setTextContent(m.getHost().getNodeIp().split(":")[1]);
				appName.setTextContent(m.getApp().getType().getId());
				zipUrl.setTextContent(m.getApp().getType().getZipFile());
			}
			return new Document[] { doc_stop, doc_unallocate };

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void process(String pId, HostInstance pHost, ApplicationInstance pApp) {
		HostType hostType = pHost.getType();

		EList<ResourceRequirement> requirements = pApp.getType().getRequirements();
		ResourceRequirement req = null;
		for (ResourceRequirement requirement : requirements) {
			if (hostType == requirement.getHostType()) {
				req = requirement;
				break;
			}
		}
		if (req != null) {
			pHost.setAvailableCpu(pHost.getAvailableCpu() + req.getRequiredCpu());
			pHost.setAvailableHdd(pHost.getAvailableHdd() + req.getRequiredHdd());
			pHost.setAvailableMemory(pHost.getAvailableMemory() + req.getRequiredMemory());
		}
		
		pApp.setState(State.STOPPED);
		pHost.getApplications().remove(pApp);

	}

	@Override
	public void executeRdf(IPatternMatch match) throws Exception {
		RdfConnection connection = new RdfConnection();
		MaxAnyUsageMatch m = (MaxAnyUsageMatch) match;
		connection.stopAppOnDevice(m.getApp().getId());
	
	}
}
