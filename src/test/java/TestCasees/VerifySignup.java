package TestCasees;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.SignupPagePage_objects;
import Resorces.Base_Class;

public class VerifySignup extends Base_Class{
@Test
	public void SignupVerification() throws IOException {
		
	
	driver=DriverInitialization();
	driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
	
	
	SignupPagePage_objects Sp=new SignupPagePage_objects(driver);
	
	Sp.Enterfristname().sendKeys("Raj");
	Sp.Enterlastname().sendKeys("kapoor");
	Sp.Enterjobtitle().sendKeys("Actor");
	Sp.EnterEmail().sendKeys("Raj.act@gmail.com");
	Sp.Enterphone().sendKeys("8456789621");
}
}