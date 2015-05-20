package hu.bme.mit.inf.cps.rules;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.ResourceRequirement;
import hu.bme.mit.inf.cps.patterns.AllocateMatch;
import hu.bme.mit.inf.cps.patterns.util.AllocateProcessor;
import hu.bme.mit.inf.cps.rdf.RdfConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class AllocateRule extends AllocateProcessor implements ICyberPhysicalSystemRule {

	@Override
	public void process(ApplicationInstance pAppInstance,
			HostInstance pHostInstance, ResourceRequirement pReq) {

		pAppInstance.getAllocatedTo().add(pHostInstance);
		pHostInstance.setAvailableMemory(pHostInstance.getAvailableMemory()	- pReq.getRequiredMemory());
		pHostInstance.setAvailableHdd(pHostInstance.getAvailableHdd() - pReq.getRequiredHdd());
		pHostInstance.setAvailableCpu(pHostInstance.getAvailableCpu() - pReq.getRequiredCpu());
	}

	@Override
	public Document[] getXmlOperation(IPatternMatch match) {

		return new Document[] { null };
		
//		if (!(match instanceof AllocateMatch)) {
//			throw new IllegalArgumentException();
//		}
//
//		AllocateMatch m = (AllocateMatch) match;
//
//		try {
//			
//			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder dBuilder;
//			dBuilder = dbFactory.newDocumentBuilder();
//			Document doc = dBuilder.newDocument();
//
//			Element installCommand = doc.createElement("InstallCommand");
//			Element commandType = doc.createElement("commandType");
//			Element nodeIp = doc.createElement("nodeIp");
//			Element sshPort = doc.createElement("sshPort");
//			Element appName = doc.createElement("appName");
//			Element zipUrl = doc.createElement("zipUrl");
//
//			doc.appendChild(installCommand);
//			installCommand.appendChild(commandType);
//			installCommand.appendChild(nodeIp);
//			installCommand.appendChild(sshPort);
//			installCommand.appendChild(appName);
//			installCommand.appendChild(zipUrl);
//
//			commandType.setTextContent("true");
//			nodeIp.setTextContent(m.getHostInstance().getNodeIp().split(":")[0]);
//			sshPort.setTextContent(m.getHostInstance().getNodeIp().split(":")[1]);
//			appName.setTextContent(m.getAppInstance().getType().getId());
//			zipUrl.setTextContent(m.getAppInstance().getType().getZipFile());
//
//			return new Document[] {doc};
//			
//		} catch (ParserConfigurationException e) {
//		}
//
//		return null;
	}

	@Override
	public void executeRdf(IPatternMatch match) throws Exception {
		RdfConnection connection = new RdfConnection();
		AllocateMatch m = (AllocateMatch) match;
		connection.insertApp(m.getAppInstance());		
	}
}
