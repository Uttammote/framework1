package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TryFreePagePage_Object {
WebDriver driver;


By country=By.xpath("//select[@name='CompanyCountry']");


public TryFreePagePage_Object(WebDriver driver2) {
	// TODO Auto-generated constructor stub
	this.driver=driver2;
}


public WebElement selectcountry() {
	return driver.findElement(country);
}
}
