package Resorces;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public WebDriver driver;
	public Properties prop;
	public WebDriver DriverInitialization() throws IOException {
		// to read the file 
                                              //(    this much path is diff for every1           )(     this is commen for every1             )		
	//	FileInputStream fis= new FileInputStream("C:\\Users\\shree\\eclipse-workspace\\framework1\\src\\main\\java\\Resorces\\data_properties");// location of data properties file
	
		
		// this will autometic get the diff part of path for every1 so it can be used commenly	
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resorces\\data_properties"); 
		                                       
		
		
		// to access the file data properties
		//Properties prop=new Properties(); // proerties is class
	    prop=new Properties();              // remove properties after declairing prop globally for url
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");  // it will give value of browser which is stored in data properties file i.e chrome
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Desktop\\chrome driver\\chromedriver_win32\\chromedriver.exe");
			
			//WebDriverManager.chromedriver().version(100.1.2).setup();  // this will run in specific version of browser
			
			WebDriverManager.chromedriver().setup();   // this will automatically take  your current updated browser path accoerding to your system 
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
	@BeforeMethod
	public void browserLaunch() throws IOException {     //this code of browser launch is commenly used for every test case so keep it in base class and declaire it @before method so that it will cl before each method. 
		DriverInitialization();
		driver.get(prop.getProperty("url"));       // to hide url store it in dat properties and use like this 
		                                           // declair prop globally to access it otherwise it show error and remove properties form obj made in 
	}
		@AfterMethod
		public void CloseBrowser() {
			driver.quit();
		}
		
		
		
		
	
}
