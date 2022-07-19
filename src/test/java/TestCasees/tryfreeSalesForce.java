package TestCasees;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.TryFreePagePage_Object;
import Resorces.Base_Class;

public class tryfreeSalesForce extends Base_Class {
	@Test
	public void verifyTryFree() throws IOException, InterruptedException {
		
		DriverInitialization();
		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
		
		
		TryFreePagePage_Object tf=new TryFreePagePage_Object(driver);
		
		tf.selectcountry().click();
		Thread.sleep(5000);
		Select s=new Select(tf.selectcountry());
		s.selectByIndex(5);
		
		
		
		
		
		
		
		
		
		
	}

}
