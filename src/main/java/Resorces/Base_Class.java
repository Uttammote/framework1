package Resorces;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {

	public WebDriver driver;
	
	public WebDriver DriverInitialization() throws IOException {
		// to read the file 
		FileInputStream fis= new FileInputStream("C:\\Users\\shree\\eclipse-workspace\\framework1\\src\\main\\java\\Resorces\\data_properties");// location of data properties file
		
		// to access the file data properties
		Properties prop=new Properties(); // proerties is class
		
		
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");  // it will give value of browser which is stored in data properties file i.e chrome
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Desktop\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		     driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("Firebox"))
		{ //System.out.println("Enter firebox in data properties");
		}
		else if (browserName.equalsIgnoreCase("edge")){
			//System.out.println("code of edge");
			}
		
		else {
			
			System.out.println("enter valid browser");
		}
		
		       return driver;
		
		
		
		
		
		
	}
}
