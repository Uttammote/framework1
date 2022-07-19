package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPagePage_Objects {
	
	/*in this page object all xpath are kept saperately bcoz if script goes fail due to xpth then we can easily correct it quickly.
	 *  our normal xpath
	 * driver.findElement(by.xpath("//input[@id='username']");
	 * bt in this page we are going to devide it in parts 
	 * store the part which is in round brcket in a veriable with using By 
	 */
	public WebDriver driver;                                     // declare a driver for return method. this driver dont have scope.
	By username=By.xpath("//input[@id='username']");
	By password=By.xpath("//input[@id='password']");
	By login=By.xpath("//input[@id='Login']");
	
	public LoginPagePage_Objects(WebDriver driver2) {           // constructor created from verificationlogin page, object of this page. this driver has a scope
		this.driver=driver2;                                    // give scope to the driver from driver2
	}

	//take a method which return the total xpath
	public WebElement EnterUsername() {
		return driver.findElement(username);                     // this will returns our total normal xpath
	}
	
	public WebElement EnterPassword() {
		return driver.findElement(password);
	}
	
	public WebElement ClickOnLogin() {
		return driver.findElement(login);
	}

}
