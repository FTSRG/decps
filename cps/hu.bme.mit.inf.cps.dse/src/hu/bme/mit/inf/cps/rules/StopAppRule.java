package hu.bme.mit.inf.cps.rules;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.State;
import hu.bme.mit.inf.cps.patterns.StopInstanceMatch;
import hu.bme.mit.inf.cps.patterns.util.StopInstanceProcessor;
import hu.bme.mit.inf.cps.rdf.RdfConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class StopAppRule extends StopInstanceProcessor implements ICyberPhysicalSystemRule {

	@Override
	public void process(ApplicationInstance pAppInstance) {
		pAppInstance.setState(State.STOPPED);
	}

	@Override
	public Document[] getXmlOperation(IPatternMatch match) throws ParserConfigurationException {
		
		if (!(match instanceof StopInstanceMatch)) {
			throw new IllegalArgumentException();
		}

		StopInstanceMatch m = (StopInstanceMatch) match;

		try {
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();

			Element installCommand = doc.createElement("StartCommand");
			Element commandType = doc.createElement("commandType");
			Element nodeIp = doc.createElement("nodeIp");
			Element sshPort = doc.createElement("sshPort");
			Element appName = doc.createElement("appName");
			Element args = doc.createElement("cmdArgs");
			Element exeFileUrl = doc.createElement("exeFileUrl");
			Element exeType = doc.createElement("exeType");
			Element dbUrl = doc.createElement("dbUrl");
			Element dbUser = doc.createElement("dbUser");
			Element dbPwd = doc.createElement("dbPwd");

			doc.appendChild(installCommand);
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
			nodeIp.setTextContent(m.getAppInstance().getAllocatedTo().get(0).getNodeIp());
			sshPort.setTextContent(m.getAppInstance().getAllocatedTo().get(0).getNodeIp().split(":")[1]);
			appName.setTextContent(m.getAppInstance().getType().getId());
			args.setTextContent(m.getAppInstance().getArgs());
			exeFileUrl.setTextContent(m.getAppInstance().getType().getExeFileUrl());
			exeType.setTextContent(m.getAppInstance().getType().getExeType());
			dbUrl.setTextContent(m.getAppInstance().getType().getCps().getDbUrl());
			dbUser.setTextContent(m.getAppInstance().getDbUser());
			dbPwd.setTextContent(m.getAppInstance().getDbPassword());

			return new Document[] {doc};
			
		} catch (ParserConfigurationException e) {
		}
		
		return null;
	}

	@Override
	public void executeRdf(IPatternMatch match) throws Exception {
		RdfConnection connection = new RdfConnection();
		StopInstanceMatch m = (StopInstanceMatch) match;
		
		connection.stopAppOnDevice(m.getAppInstance().getId());
	}

}
