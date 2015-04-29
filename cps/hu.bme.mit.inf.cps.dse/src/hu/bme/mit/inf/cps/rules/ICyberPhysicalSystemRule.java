package hu.bme.mit.inf.cps.rules;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.w3c.dom.Document;

public interface ICyberPhysicalSystemRule {

	Document[] getXmlOperation(IPatternMatch match) throws ParserConfigurationException;
	
	void executeRdf(IPatternMatch match) throws Exception;
}
