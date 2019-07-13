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
import PageActions.pom005_VoiceWatch_Tests_Tab;
import PageActions.pom006_VoiceWatch_Tags_Tab;
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
		 d.home_screen();
	//	    d.tagTab();
	//	    d.scriptsTab();
	//	    d.hammersTab();
	//	    d.usersTab();
	//	    d.clientsTab();	    
	//	    d.auditTab();
	//	    d.adminTab();
	//	    d.selectedTab();
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
	@Test(priority=7)
	public void testTabValidation () throws IOException, InterruptedException {
		
		pom005_VoiceWatch_Tests_Tab ts=new pom005_VoiceWatch_Tests_Tab(driver);
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
		d.header();
		d.footer();
		ts.testsValidations();
		ts.createTestbybutton();
		d.header();
		d.footer();
		ts.createTestbyLink();
		d.header();
		d.footer();
		
	}
	
	
	@Test(priority=8)
	public void tagTabValidation () throws IOException, InterruptedException {
		
		pom006_VoiceWatch_Tags_Tab tg=new pom006_VoiceWatch_Tags_Tab(driver);
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
	
		tg.tagsValidations();
		d.header();
		d.footer();
		tg.createTagbybutton();
		d.header();
		d.footer();
		tg.createNewTag();
		d.header();
		d.footer();
		
	}
	
	
	
	
	@AfterTest
	public void applicationClose() {
	
		driver.close();
		log.info("Application closed successfully");
		
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
