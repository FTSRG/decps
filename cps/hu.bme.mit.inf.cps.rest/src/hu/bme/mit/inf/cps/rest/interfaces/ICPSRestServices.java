package hu.bme.mit.inf.cps.rest.interfaces;


public interface ICPSRestServices {

	String doNextTransformation(String callback) throws Exception;
	
	String initTransformation(String callback);

	String getHostTypes(String callback);

	String getFullDataModel(String callback) throws Exception;

	String getHostTypesTest(String callback);
}
