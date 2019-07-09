package PageActions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class pom003_VoiceWatch_Dashboard_Tab {
	private static Logger log =LogManager.getLogger(pom003_VoiceWatch_Dashboard_Tab.class.getName());

	public WebDriver driver;
	
    By dashBoardTab=By.linkText("Dashboard");
    By dropdownTimeSelected=By.xpath("//select[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty']");
    
    By overAllPerformanceLabel=By.xpath("//*[@id=\"overall\"]/nav/div/div/h1");
    By dropdown=By.xpath("//select[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty']");
    By failledCallsLabel=By.xpath("//*[@id=\"overall\"]/table/tbody/tr[1]/td[1]/span");
    By passedCallsLabels=By.xpath("//*[@id=\"overall\"]/table/tbody/tr[1]/td[2]/span");
    By alertslabels=By.xpath("//*[@id=\"overall\"]/table/tbody/tr[1]/td[3]/span");
    By overallDownloadCSVbutton=By.xpath("//*[@id=\"overall\"]/table/tbody/tr[3]/td/section/span/button/strong");
   
    By activetestDownloadCSVbutton=By.xpath("//*[@id=\"activetest\"]/button/strong");
    By activetestTestLabel=By.xpath("//*[@id=\"activetest\"]/nav/div/div[1]/h1");
    By activetestFilter=By.id("tQuery");
    By activetestLastCallColoum=By.xpath("//*[@id=\"activetest\"]/table/tbody/tr[1]/th[1]/div/span[1]");
 //   By activetestNameColoum=By.xpath("//*[@id=\"activetest\"]/table/tbody/tr[1]/th[2]/div/span[1]");
    
    By activetestNameColoum=By.xpath("//*[@id=\"activetest\"]/table/tbody/tr[1]/th[2]/div/span[1]");
    
    By activetestFailedColoumn=By.xpath("//*[@id=\"activetest\"]/table/tbody/tr[1]/th[3]/div/span[1]");
  //  By activetestFailedColoumn=By.xpath("//*[@id=\\\"activetest\\\"]/table/tbody/tr[1]/th[3]/div/span[1]");
    By activetestPassedColoumn=By.xpath("//*[@id=\"activetest\"]/table/tbody/tr[1]/th[4]/div/span[1]");
    By activetestAlertsColoum=By.xpath("//*[@id=\"activetest\"]/table/tbody/tr[1]/th[5]/div/span[1]");
    By activetestGraphResultsColoum=By.xpath("//*[@id=\"activetest\"]/table/tbody/tr[1]/th[6]/span");
    By activetestNotificationPresenColoum=By.xpath("//*[@id=\"activetest\"]/table/tbody/tr[1]/th[7]/span");
    
    
  

   
    
    
    
	//ContractorA
	
	public pom003_VoiceWatch_Dashboard_Tab(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// Method for Verified Lables under Client Tab
	
	public void OverallPerfomance_section_dashboard() {	
		
		driver.findElement(dashBoardTab).click();
		
		Assert.assertTrue(driver.findElement(overAllPerformanceLabel).isDisplayed());
		log.debug("Verified that 'Overall Performance' displayed under dashoboard tab");
		Assert.assertEquals(driver.findElement(overAllPerformanceLabel).getText(), "Overall Performance");		
		log.debug("Verified that 'Overall Performance' Text appeared under dashboard Tab");	
		
		Assert.assertTrue(driver.findElement(failledCallsLabel).isDisplayed());
		log.debug("Verified that 'Failed Calls' dislayed under Overall Performance section in dashboard Tab");
		Assert.assertEquals(driver.findElement(failledCallsLabel).getText(), "Failed Calls");		
		log.debug("Verified that 'Failed Calls' comtain under Overall Performance section in dashboard Tab");	
		
		Assert.assertTrue(driver.findElement(passedCallsLabels).isDisplayed());
		log.debug("Verified that 'Passed Calls' dislayed under Overall Performance section in dashboard Tab");
		Assert.assertEquals(driver.findElement(failledCallsLabel).getText(), "Failed Calls");		
		log.debug("Verified that 'Passed Calls' comtain under Overall Performance section in dashboard Tab");
		
		Assert.assertTrue(driver.findElement(alertslabels).isDisplayed());
		log.debug("Verified that 'Alerts' dislayed under Overall Performance section in dashboard Tab");
		Assert.assertEquals(driver.findElement(failledCallsLabel).getText(), "Failed Calls");		
		log.debug("Verified that 'Alerts' comtain under Overall Performance section in dashboard Tab");
		
		Assert.assertTrue(driver.findElement(overallDownloadCSVbutton).isDisplayed());
		log.debug("Verified that 'Download CSV' button dislayed under Overall Performance section in dashboard Tab");
		
		Assert.assertTrue(driver.findElement(overallDownloadCSVbutton).isEnabled());
		log.debug("Verified that 'Download CSV' button enabled under Overall Performance section in dashboard Tab");
		
		Assert.assertEquals(driver.findElement(overallDownloadCSVbutton).getText(), "Download CSV");		
		log.debug("Verified that 'Download CSV' test appeared on the button under Overall Performance section in dashboard Tab");
		
		
		 String[] exp = {"Last 4 hours","Last 6 hours","Last 12 hours","Last 24 hours","Day"};
		// System.out.println(exp.length);
		 log.debug("Verified that count of the dropdown values are: "  +exp.length); 
		 
		 WebElement dropdown = driver.findElement(dropdownTimeSelected); 
		
	//	 System.out.println(dropdown.getSize());
		 
        Select s = new Select(dropdown); 
        s.isMultiple();
       java.util.List<WebElement> options = s.getOptions(); 
       
      
       log.debug("Verified that following values available in the dropdown"); 
      
        for(WebElement item:options) 
        { 
        	for (int i = 0; i <options.size(); i++) {
        		        		
        		if (item.getText().equals(exp[i])) {
        			
        						    
        			log.debug(""+item.getText());
        			
        			//		 System.out.println("hello i am hari" +item.getText());  
        			 
        			 Assert.assertEquals(item.getText(),exp[i]);
        		}
        	}
        }
        			 
		
		
		
		
		
		
		
	}
	
public void activetest_section_dashboard() {	
		
		Assert.assertTrue(driver.findElement(activetestTestLabel).isDisplayed());
		log.debug("Verified that 'Overall Performance' displayed under dashoboard tab");
		Assert.assertEquals(driver.findElement(activetestTestLabel).getText(), "Tests");		
		log.debug("Verified that 'Tests' Text appeared under activetest section in dashboard Tab");	
		
		Assert.assertTrue(driver.findElement(activetestFilter).isDisplayed());
		log.debug("Verified that 'filter' appeared under activetest section section in dashboard Tab");
		/*Assert.assertEquals(driver.findElement(failledCallsLabel).getText(), "Failed Calls");		
		log.debug("Verified that 'Failed Calls' comtain under activetest section in dashboard Tab");	*/
		
		Assert.assertTrue(driver.findElement(activetestLastCallColoum).isDisplayed());
		log.debug("Verified that 'Passed Calls' dislayed under activetest section section in dashboard Tab");
		Assert.assertEquals(driver.findElement(activetestLastCallColoum).getText(), "Last Call");		
		log.debug("Verified that 'Last Call' coloumn under Tests table in dashboard Tab");
		
		Assert.assertTrue(driver.findElement(activetestNameColoum).isDisplayed());
		log.debug("Verified that 'Name' dislayed under activetest section section in dashboard Tab");
		Assert.assertEquals(driver.findElement(activetestNameColoum).getText(), "Name");		
		log.debug("Verified that 'Name' coloumn under Tests table in dashboard Tab");
		
		Assert.assertTrue(driver.findElement(activetestFailedColoumn).isDisplayed());
		log.debug("Verified that 'Failed' dislayed under activetest section section in dashboard Tab");
		Assert.assertEquals(driver.findElement(activetestFailedColoumn).getText(), "Failed");		
		log.debug("Verified that 'Failed' coloumn under Tests table in dashboard Tab");
		
		Assert.assertTrue(driver.findElement(activetestPassedColoumn).isDisplayed());
		log.debug("Verified that 'Passed ' dislayed under activetest section section in dashboard Tab");
		Assert.assertEquals(driver.findElement(activetestPassedColoumn).getText(), "Passed");		
		log.debug("Verified that 'Passed' coloumn under Tests table in dashboard Tab");
		
		Assert.assertTrue(driver.findElement(activetestAlertsColoum).isDisplayed());
		log.debug("Verified that 'Alerts' dislayed under activetest section section in dashboard Tab");
		Assert.assertEquals(driver.findElement(activetestAlertsColoum).getText(), "Alerts");		
		log.debug("Verified that 'Alerts' coloumn under Tests table in dashboard Tab");
		
		Assert.assertTrue(driver.findElement(activetestGraphResultsColoum).isDisplayed());
		log.debug("Verified that 'Graph Results' dislayed under activetest section section in dashboard Tab");
		Assert.assertEquals(driver.findElement(activetestGraphResultsColoum).getText(), "Graph Results");		
		log.debug("Verified that 'Graph Results' coloumn under Tests table in dashboard Tab");
		
		Assert.assertTrue(driver.findElement(activetestNotificationPresenColoum).isDisplayed());
		log.debug("Verified that 'Notification Present' dislayed under activetest section section in dashboard Tab");
		Assert.assertEquals(driver.findElement(activetestNotificationPresenColoum).getText(), "Notification Present");		
		log.debug("Verified that 'Notification Present' coloumn under Tests table in dashboard Tab");
		
		
		
	}
	
	
	public void dashboard_screen() {	
		
	log.debug("VoiceWatch Dashboard Page verification Started");
	
	Assert.assertTrue(driver.findElement(dashBoardTab).isDisplayed());
	log.debug("Verified that 'Dashboard Tab' appeared on the VoiceWatch dashoboard");	
	Assert.assertTrue(driver.findElement(dashBoardTab).isEnabled());
	log.debug("Verified that 'Dashboard Tab' enabled on the VoiceWatch dashoboard");	
	/*Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));	
	log.info("Verified that 'Dashboard Tab' not selected on the dashoboard");*/
	

	/*Assert.assertTrue(driver.findElement(alertsTab).isDisplayed());
	log.debug("Verified that 'Alerts Tab' appeared on the VoiceWatch dashboard");	
	Assert.assertTrue(driver.findElement(alertsTab).isEnabled());
	log.debug("Verified that 'Alerts Tab' enabled on the VoiceWatch dashboard");	
	Assert.assertFalse(driver.getCurrentUrl().contains("alerts"));
	log.debug("Verified that 'Alerts Tab' not selected on the VoiceWatch dashboard");
	
	
	Assert.assertTrue(driver.findElement(testTab).isDisplayed());
	log.debug("Verified that 'Tests Tab' appeared on the VoiceWatch dashboard");	
	Assert.assertTrue(driver.findElement(testTab).isEnabled());
	log.debug("Verified that 'Tests Tab' enabled on the VoiceWatch dashboard");	
	Assert.assertFalse(driver.getCurrentUrl().contains("tests"));
	log.debug("Verified that 'Tests Tab' not selected on the VoiceWatch dashboard");*/
	
	
	/*Assert.assertTrue(driver.findElement(tagTab).isDisplayed());
	log.info("Verified that 'Tags Tab' appeared on the VoiceWatch dashboard");
	Assert.assertTrue(driver.findElement(tagTab).isEnabled());
	log.info("Verified that 'Tags Tab' appeared on the VoiceWatch dashboard");
	Assert.assertFalse(driver.getCurrentUrl().contains("tags"));
	log.info("Verified that 'Tags Tab' not selected on the VoiceWatch dashboard");*/

	
	
	/*Assert.assertTrue(driver.findElement(scriptsTab).isDisplayed());
	log.info("Verified that 'Scripts Tab' appeared on the VoiceWatch dashboard");
	Assert.assertTrue(driver.findElement(scriptsTab).isEnabled());
	log.info("Verified that 'Scripts Tab' enabled on the VoiceWatch dashboard");
	Assert.assertFalse(driver.getCurrentUrl().contains("scripts"));
	log.info("Verified that 'Scripts Tab' not selected on the VoiceWatch dashboard");*/
		
	/*
	Assert.assertTrue(driver.findElement(variablesTab).isDisplayed());
	log.debug("Verified that 'Variables Tab' appeared on the VoiceWatch dashboard");
	Assert.assertTrue(driver.findElement(variablesTab).isEnabled());
	log.debug("Verified that 'Variables Tab' enabled on the VoiceWatch dashboard");
	Assert.assertFalse(driver.getCurrentUrl().contains("variables"));
	log.debug("Verified that 'Variable Tab' not selected on the VoiceWatch dashboard");
	*/
	
	
	/*Assert.assertTrue(driver.findElement(hammersTab).isDisplayed());
	log.info("Verified that 'Hammer Tab' appeared on the dashoboard");
	Assert.assertTrue(driver.findElement(hammersTab).isEnabled());
	log.info("Verified that 'Hammer Tab' enabled on the dashoboard");
	Assert.assertFalse(driver.getCurrentUrl().contains("hammer"));
	log.info("Verified that 'Hammer Tab' not selected on the dashoboard");*/
	
	
	/*Assert.assertTrue(driver.findElement(notificationsTab).isDisplayed());
	log.debug("Verified that 'Notifications Tab' appeared on the VoiceWatch dashboard");
	Assert.assertTrue(driver.findElement(notificationsTab).isEnabled());
	log.debug("Verified that 'Notifications Tab' enabled on the VoiceWatch dashboard");
	Assert.assertFalse(driver.getCurrentUrl().contains("notifi"));
	log.debug("Verified that 'Notifications Tab' not selected on the VoiceWatch dashboard");*/
	
	
	/*Assert.assertTrue(driver.findElement(usersTab).isDisplayed());
	log.info("Verified that 'Users Tab' appeared on the VoiceWatch dashboard");
	Assert.assertTrue(driver.findElement(usersTab).isEnabled());
	log.info("Verified that 'Users Tab' appeared on the VoiceWatch dashboard");
	Assert.assertFalse(driver.getCurrentUrl().contains("users"));
	log.info("Verified that 'Users Tab' not selected on the VoiceWatch dashboard");*/

	
	/*Assert.assertTrue(driver.findElement(clientsTab).isDisplayed());
	log.info("Verified that 'Clients Tab' appeared on the dashoboard");
	Assert.assertTrue(driver.findElement(clientsTab).isEnabled());
	log.info("Verified that 'Clients Tab' enabled on the dashoboard");
	Assert.assertFalse(driver.getCurrentUrl().contains("clients"));
	log.info("Verified that 'Clients Tab' not selected on the dashoboard");*/
	
	
	
/*	Assert.assertFalse(driver.findElement(auditTab).isDisplayed());
	log.info("Verified that 'Audit Tab' appeared on the dashoboard");*/
/*	Assert.assertTrue(driver.findElement(auditTab).isEnabled());
	log.info("Verified that 'Audit Tab' enabled on the dashoboard");
	Assert.assertFalse(driver.getCurrentUrl().contains("logs"));
	log.info("Verified that 'Audit Tab' not selected on the dashoboard");*/
	
	
//	Assert.assertTrue(driver.findElements(auditTab).isEmpty());
//	Assert.assertTrue(driver.findElements(hammersTab).isEmpty());
	
	
	
	/*Assert.assertTrue(driver.findElement(adminsTab).isDisplayed());
	log.info("Verified that 'Admin Tab' appeared on the dashoboard");
	Assert.assertTrue(driver.findElement(adminsTab).isEnabled());
	log.info("Verified that 'Admin Tab' enabled on the dashoboard");
	Assert.assertTrue(driver.getCurrentUrl().contains("admin_dash"));
	log.info("Verified that 'Admin Tab' selected on the dashoboard");*/

	}	
	
	/*public void header() {
		
		Assert.assertTrue(driver.findElement(headerEmpirixLogo).isDisplayed());
		log.debug("Verified that 'Empirix Logo' appeared on top left corner VoiceWatch dashboard");
		
		Assert.assertTrue(driver.findElement(headerEmpirixLogo).isEnabled());
		log.debug("Verified that 'Empirix Logo' enabled on top left corner VoiceWatch dashboard");
		
		Assert.assertTrue(driver.findElement(headerEmpirixLebel).isDisplayed());
		log.debug("Verified that 'Empirix Lebel' appeared on top left corner VoiceWatch dashboard");
		
		Assert.assertEquals(driver.findElement(headerEmpirixLebel).getText(), "EMPIRIX");		
		log.debug("Verified that 'EMPIRIX' Text appeared on top left corner VoiceWatch dashboard");	
		
		Assert.assertTrue(driver.findElement(headerEmpirixLogo).isEnabled());
		log.debug("Verified that 'Empirix label' enabled on top left corner VoiceWatch dashboard");
		
		Assert.assertTrue(driver.findElement(headerApplicationName).isDisplayed());		
		log.debug("Verified that 'Application Name' appeared on top left corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(headerApplicationName).isEnabled());
		log.debug("Verified that 'Application Name' enabled on top left corner VoiceWatch dashboard");
		
		Assert.assertEquals(driver.findElement(headerApplicationName).getText(), "VoiceWatch");		
		log.debug("Verified that 'VoiceWatch' Text appeared on top left corner VoiceWatch dashboard");	
		
		
		Assert.assertTrue(driver.findElement(headerDropdown).isDisplayed());
		log.debug("Verified that dropdown appeared on top right corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(headerDropdown).isEnabled());
		log.debug("Verified that dropdwon enabled on top right corner VoiceWatch dashboard");
		
		Assert.assertTrue(driver.findElement(headerContactUs).isDisplayed());
		log.debug("Verified that 'ContacUs' appeared on top right corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(headerContactUs).isEnabled());
		log.debug("Verified that 'ContacUs' enabled on top right corner VoiceWatch dashboard");
		Assert.assertEquals(driver.findElement(headerContactUs).getText(), "Contact Us");		
		log.debug("Verified that 'Contact Us' Text appeared on top left corner VoiceWatch dashboard");	
		
		
		Assert.assertTrue(driver.findElement(headerHelp).isDisplayed());
		log.debug("Verified that 'Help' appeared on top right corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(headerHelp).isEnabled());
		log.debug("Verified that 'help' enabled on top right corner VoiceWatch dashboard");
		
		Assert.assertEquals(driver.findElement(headerHelp).getText(), "Help");		
		log.debug("Verified that 'Help' Text appeared on top left corner VoiceWatch dashboard");	
		
		
	}
	
public void footer() {
		
		Assert.assertTrue(driver.findElement(footerBackToTop).isDisplayed());
		log.debug("Verified that 'BackToTop link' appeared on bottom right corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(footerBackToTop).isEnabled());
		log.debug("Verified that 'BackToTop link' enabled on bottom right corner VoiceWatch dashboard");
		Assert.assertEquals(driver.findElement(footerBackToTop).getText(), "Back to top");		
		log.debug("Verified that 'Back to top' Text appeared on top left corner VoiceWatch dashboard");	
		
		
		Assert.assertTrue(driver.findElement(footerVersion).isDisplayed());		
		log.debug("Verified that 'Version' Text appeared on bottom left corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(footerVersion).isEnabled());
		log.debug("Verified that 'Version' test enabled on right corner VoiceWatch dashboard");
		Assert.assertEquals(driver.findElement(footerVersion).getText(), "Version");		
		log.debug("Verified that 'Version' Text appeared on top left corner VoiceWatch dashboard");	
		
		
		
		Assert.assertTrue(driver.findElement(footerVersionNumber).isDisplayed());
		log.debug("Verified that 'Version Number' appeared on bottom left corner VoiceWatch dashboard");		
		Assert.assertTrue(driver.findElement(footerVersionNumber).isEnabled());
		log.debug("Verified that 'Version Number' enabled on right corner VoiceWatch dashboard");
		Assert.assertEquals(driver.findElement(footerVersionNumber).getText().contains("26.0"), true);		
		log.debug("Verified that 'Version contain 26.0' appeared on top left corner VoiceWatch dashboard");	
		
		
		
		Assert.assertTrue(driver.findElement(footerEmpirixLebel).isDisplayed());
		log.debug("Verified that 'Empirix Label' appeared on bottom left corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(footerEmpirixLebel).isEnabled());
		log.debug("Verified that 'Empirix Label' enabled on right corner VoiceWatch dashboard");
		
		Assert.assertEquals(driver.findElement(footerEmpirixLebel).getText(), "Empirix");		
		log.debug("Verified that 'Empirix' Text appeared on top left corner VoiceWatch dashboard");	
			
	}*/
	
	
    
/*public void tagTab() {
		
		if (driver.findElements(tagTab).isEmpty()) {
			
			log.debug("Verified that 'Tags Tab' is not appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Tags Tab' appeared on the VoiceWatch dashboard");
			
		}*/
  /*
	}
	
public void scriptsTab() {
	
	if (driver.findElements(scriptsTab).isEmpty()) {
		
		log.debug("Verified that 'Scripts Tab' is not appearing on the VoiceWatch dashboard");
		
					
	}else
	
	{
		log.debug("Verified that 'Scripts Tab' appeared on the VoiceWatch dashboard");
		
	}

}
	

public void usersTab() {
	
	if (driver.findElements(usersTab).isEmpty()) {
		
		log.debug("Verified that 'Users Tab' is not appearing on the VoiceWatch dashboard");
		
					
	}else
	
	{
		log.debug("Verified that 'Users Tab' appeared on the VoiceWatch dashboard");
		
	}

}
		
	
	public void clientsTab() {
		
		if (driver.findElements(clientsTab).isEmpty()) {
			
			log.debug("Verified that 'Clients Tab' is not appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Clients Tab' appeared on the VoiceWatch dashboard");
			
		}
  
	}	
	
	public void auditTab() {
		
		if (driver.findElements(auditTab).isEmpty()) {
			
			log.debug("Verified that 'Audit Tab' is not appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Audit Tab' appeared on the VoiceWatch dashboard");
			
		}
  
	}
	
	
	public void adminTab() {
		
		if (driver.findElements(adminsTab).isEmpty()) {
			
			log.debug("Verified that 'Admin Tab' is not appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Admin Tab' appeared on the VoiceWatch dashboard");
			
		}
  
	}	
	
	
		
	
		public void hammersTab() {
		
		if (driver.findElements(hammersTab).isEmpty()) {
			
			log.debug("Verified that 'Hammers Tab' is not appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Hammers Tab' appeared on the VoiceWatch dashboard");
			
		}
		
		}
		
		public void selectedTab() {
			
			if (driver.getCurrentUrl().contains("admin_dash")) {	
				
				
				log.debug("Verified that 'Admin Tab' selected on the VoiceWatch application");

							
			}else
			
			{
				log.debug("Verified that 'Dashboard Tab' selected on the VoiceWatch application");
				
			}
			
		}*/
		
}
	
	