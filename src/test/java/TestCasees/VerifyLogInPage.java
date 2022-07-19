package TestCasees;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPagePage_Objects;
import Resorces.Base_Class;
import Resorces.constants;

public class VerifyLogInPage extends Base_Class {
	
	@Test(dataProvider="testdata1")
	public void logInVerifiction(String uname,String pass) throws IOException {
		
		
		  
/*All req xpath are stored in page object saperatly
 * to access those create an object of that object page
 */
		
		LoginPagePage_Objects Lp=new LoginPagePage_Objects(driver);            // this is the object of LoginPagePage_Objects 
		
		//now call the methods of page objects with above object
		Lp.EnterUsername().sendKeys("uname");
		Lp.EnterPassword().sendKeys("pass");
		Lp.ClickOnLogin().click();
	}
	/*	@DataProvider
		public Object[][] testdata1(){
			Object[][]data=new Object[3][2];
			data[0][0]="amin1";
			data[0][1]="Pass1";
			data[1][0]="amin2";
			data[1][1]="Pass2";
			data[2][0]="amin3";
			data[2][1]="Pass3";
			return data;
			*/
	/*to hide above data create a class in resources name it constants
	 * then store the data in the form of  public static String 
	 */
	
	// to access data from constants
	
	@DataProvider
	public Object[][] testdata1(){
		Object[][]data=new Object[3][2];
		data[0][0]=constants.username1;
		data[0][1]=constants.password1;
		data[1][0]=constants.username2;
		data[1][1]=constants.password2;
	    data[2][0]=constants.username3;
		data[2][1]=constants.password3;
		return data;
	
	
	
	
	
	
	
	
		}		
}
	

	