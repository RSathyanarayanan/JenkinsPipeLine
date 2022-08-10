package scenarios;

import automationFramework.APIKeywords;
import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;


public class ApiSample extends ApplicationKeywords {
	BaseClass obj;
	private Boolean status = false;
	
	
	public ApiSample(BaseClass obj){
		super(obj);
		this.obj=obj;
	}
		
public void apiTesting() {
	try {
	APIKeywords apiKey = new APIKeywords(obj);
	
	apiKey.initiateCommand();
	apiKey.setMethod("Post");
	apiKey.setURI("https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=AIzaSyBOWwl9Fa-XkEN-EPZziqpDx3DhfvZyW2c");
	apiKey.setPayLoadData("{\"email\": \"bp2@pro.com\", \"password\": \"P@ssw0rd\", \"returnSecureToken\": true }");
	apiKey.setOutputFileName("authToken");
	apiKey.setHeader("Content-Type: application/json");
	//apiKey.executeCommand();
	
	
	}
	
	catch(Exception e) {
		e.printStackTrace();
		
		
	}
	
}
	

}
