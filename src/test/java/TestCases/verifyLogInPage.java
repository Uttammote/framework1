package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Resorces.Base_Class;

public class verifyLogInPage extends Base_Class {
	
     @Test
	public void logInVerification() throws IOException {
		/* steps:
		 * launch browser
		 * username and password
		 * click on login
		 */
		
		driver= DriverInitialization();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		
		
		
		
		
		
		
	}

}
