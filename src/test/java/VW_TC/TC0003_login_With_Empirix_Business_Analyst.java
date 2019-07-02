package VW_TC;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageActions.pom001_VoiceWatch_logIn_Page;
import PageActions.pom002_VoiceWatch_Home_Page;
import PageActions.pom003_VoiceWatch_Dashboard_Tab;
import PageActions.pom004_VoiceWatch_Alerts_Tab;
import resources.baseProperties;
import resources.dataDriven;

public class TC0003_login_With_Empirix_Business_Analyst extends baseProperties{
	
//public class TC0001_login extends TC0000_reusable{
	
	
	
	private static Logger log =LogManager.getLogger(TC0003_login_With_Empirix_Business_Analyst.class.getName());
	
//	 private class TC0001_login extends TC0000_reusable {
	
	@BeforeTest
	
	public void applicationLaunch() throws IOException, InterruptedException {
		
		driver=intializeDriver();
	}

	@Test(priority=1)
	public void logInWithExpirixBusinessAnalyst () throws IOException, InterruptedException {
		
		pom001_VoiceWatch_logIn_Page l=new pom001_VoiceWatch_logIn_Page(driver);
		dataDriven d1=new dataDriven();
		  ArrayList<String> data=d1.getData("login","Empirix/Empirix Admin");
			
		l.getUsername().sendKeys(data.get(1));
	    l.getPassword().sendKeys(data.get(2));
	    l.getSignButton().click();
	    Thread.sleep(1000);
	    log.debug("Waiting for launch VoiceWatch application using above creadetails");
	    Assert.assertTrue(driver.findElement(By.linkText("Back to top")).isDisplayed());
	    log.info("Verified that VoiceWatch Application login successfully with Empirix Business Analyst creadetial");
	    log.debug("Validate the requiment as Aceess Level= Empirix & Role=Business Analyst");

	}	
	

	@Test(priority=2)
	public void headerMandatoryDetails () throws IOException, InterruptedException {
		
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
	    d.header();
	
	}
	
	@Test(priority=3)
	public void footerMandatoryDetails () throws IOException, InterruptedException {
		
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
	    d.footer();
	
	}
	
	
	@Test(priority=4)
	public void TabValidation() {
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);
		 d.dashboard_screen();
		    d.tagTab();
		    d.scriptsTab();
		    d.hammersTab();
		    d.usersTab();
		    d.clientsTab();	    
		    d.auditTab();
		    d.adminTab();
		    d.selectedTab();
	}
	

	@Test(priority=5)
	public void dashBoardTabValidation () throws IOException, InterruptedException {
		
		pom003_VoiceWatch_Dashboard_Tab db=new pom003_VoiceWatch_Dashboard_Tab(driver);
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
				
		db.OverallPerfomance_section_dashboard();
		db.activetest_section_dashboard();
		d.header();
		d.footer();
	}
	
	@Test(priority=6)
	public void alertTabValidation () throws IOException, InterruptedException {
		
		pom004_VoiceWatch_Alerts_Tab at=new pom004_VoiceWatch_Alerts_Tab (driver);
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
		at.alertsValidations();		
		d.header();
		d.footer();
		
	}
	
	@AfterTest
	public void applicationClose() {
	
		driver.close();
		log.info("Application closed successfully");
		
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	
	@Test
	public void loginToApplication () throws InterruptedException, IOException 
	
	{
		 p00_reuseable_case r=new p00_reuseable_case(driver);
		 pom001_logInPage l=new pom001_logInPage(driver);
		 
		 
		 r.BrowserInitializer();
		 
//		 l.logPageLabelVerification();
		 r.applicationVoiceWatchLaunch();
		 r.loginCredetials();
		
	}
	
}
*/
	/*@BeforeTest
	public void initializer() throws IOException
	{
		log.info("VoiceWatch loginPageAccess TestCase Validation Started");
		
		driver=intializeDriver();
		log.info("Driver intilized successfully");
	}
	
	
	//@Test(dataProvider="getData")
	
	//public void basePageNavigtion (String Username, String Password) throws InterruptedException
	
	@Test
	public void basePageLoginValidation () throws InterruptedException, IOException 
	
	{
	
		
	//	dataDriven d=new dataDriven();
	//	ArrayList<String> data=d.getData("login","Admin_login");
		
	//	driver.get(data.get(1));
				
		driver.get(prop.getProperty("url"));
		
		
		Thread.sleep(10000);
		  
		driver.manage().window().maximize();
		 
		
		log.info("VoiceWatch Application Launched successfully");
		
		
		pom001_logInPage l=new pom001_logInPage(driver);
		
		
		
		
	//**LogIn Page Label verification Started//
		l.logPageLabelVerification();
	
	//Additional Copyright Information
		
	//	l.getCopyRightLink().click();
	//	l.additional_copy();
	//Data Driven		
		
		
	  dataDriven d=new dataDriven();
	  ArrayList<String> data=d.getData("login","Admin_login");
	  
	  l.getUsername().sendKeys(data.get(1));
	  
	  l.getPassword().sendKeys(data.get(2));
		
	  l.getSignButton().click();	
		
	  Thread.sleep(10000);	
		
	  driver.close();	
	}*/
/*}*/
	    
	/*//	l.getUsername().sendKeys(prop.getProperty("AdminUsername"));
	    
	 //   dataDriven d=new dataDriven();
	 //   ArrayList<String> data=d.getData("login","login2");

//	    ArrayList<String> data=d.getData("login","Admin_login2");
       l.getUsername().sendKeys(data.get(1));
	    
		
		log.info("UserName inserting Successfully");
	//	l.getPassword().sendKeys(prop.getProperty("AdminPwd"));
		
		l.getPassword().sendKeys(data.get(2));
		
		log.info("Password inserting Successfully");
		
		l.getSignButton().click();
		
		log.info("Sigin button Clicked Successfully");
		
		Thread.sleep(10000);
		
		log.info("Trying to access application");
		
	//	Assert.assertEquals(driver.getTitle(), "OpenAM - Login");
		
			
		log.info("Validation Result");
	}	
					
	}
	
	///Parameter
			@DataProvider
	     public Object[][] getData()
	     {
	        Object[][] data=new Object[2][2];
	       // data[0][0]="https://vwqang2.empirix.com/";
	        data[0][0]="testHari1";
	        data[0][1]="Test@1234";
	        
	        log.info("User testHari1 trying to access");
	        
	        ///Second Data Type
	       // data[1][0]="https://abcd/";
	       // data[1][0]="Hari1";
	      //  data[1][1]="Hello1";
	        data[0][0]="testHari";
	        data[0][1]="Test@1234";
	        log.info("User testHari trying to access");
	        
	        return data;
	     }
		
			@AfterTest
			public void teardown()
			{
				driver.close();
				log.info("VoiceWatch Application closed successfully");
			}*/
		

