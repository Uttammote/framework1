package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPagePage_objects {

	public WebDriver driver;
	
	
	By FristName=By.xpath("//input[@name='UserFirstName']");
	By LastName=By.xpath("//input[@name='UserLastName']");
	By Jobtitle=By.xpath("//input[@name='UserTitle']");
	By Email=By.xpath("//input[@name='UserEmail']");
	By Phone=By.xpath("//input[@name='UserPhone']");
	
	

	public SignupPagePage_objects(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement Enterfristname() {
		return driver.findElement(FristName);
	}
	
	public WebElement Enterlastname() {
		return driver.findElement(LastName);
	}
	public WebElement Enterjobtitle() {
		return driver.findElement(Jobtitle);
	}
	
	public WebElement EnterEmail() {
		return driver.findElement(Email);
	}
	
	public WebElement Enterphone() {
		return driver.findElement(Phone);
	}
	
	
	
	
	
}
