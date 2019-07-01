package PageActions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class unused_Hidden {
	private static Logger log =LogManager.getLogger(unused_Hidden.class.getName());

	public static WebDriver driver;
	
    By dashBoardTab=By.linkText("Dashboard");
    By alertsTab=By.linkText("Alerts");
    By testTab=By.linkText("Tests");
    By tagTab=By.linkText("Tags");
    static By scriptsTab=By.linkText("Scripts");
    By variablesTab=By.linkText("Variables");
    By hammersTab=By.linkText("Hammers");
    By notificationsTab=By.linkText("Notifications");
    By usersTab=By.linkText("Users");
    By clientsTab=By.linkText("Clients");
    By auditTab=By.linkText("Audit");
    By adminsTab=By.linkText("Admin");
	
    
    

	//ContractorA
	
	public unused_Hidden(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// Method for Verified Lables under Client Tab
	
	public void dashboard_screen() {	
		
	log.debug("VoiceWatch Dashboard Page verification Started");
	
	Assert.assertTrue(driver.findElement(dashBoardTab).isDisplayed());
	log.debug("Verified that 'Dashboard Tab' appeared on the VoiceWatch dashoboard");	
	Assert.assertTrue(driver.findElement(dashBoardTab).isEnabled());
	log.debug("Verified that 'Dashboard Tab' enabled on the VoiceWatch dashoboard");	
	/*Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));	
	log.info("Verified that 'Dashboard Tab' not selected on the dashoboard");*/
	

	Assert.assertTrue(driver.findElement(alertsTab).isDisplayed());
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
	log.debug("Verified that 'Tests Tab' not selected on the VoiceWatch dashboard");
	
	
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
		
	
	Assert.assertTrue(driver.findElement(variablesTab).isDisplayed());
	log.debug("Verified that 'Variables Tab' appeared on the VoiceWatch dashboard");
	Assert.assertTrue(driver.findElement(variablesTab).isEnabled());
	log.debug("Verified that 'Variables Tab' enabled on the VoiceWatch dashboard");
	Assert.assertFalse(driver.getCurrentUrl().contains("variables"));
	log.debug("Verified that 'Variable Tab' not selected on the VoiceWatch dashboard");
	
	
	
	/*Assert.assertTrue(driver.findElement(hammersTab).isDisplayed());
	log.info("Verified that 'Hammer Tab' appeared on the dashoboard");
	Assert.assertTrue(driver.findElement(hammersTab).isEnabled());
	log.info("Verified that 'Hammer Tab' enabled on the dashoboard");
	Assert.assertFalse(driver.getCurrentUrl().contains("hammer"));
	log.info("Verified that 'Hammer Tab' not selected on the dashoboard");*/
	
	
	Assert.assertTrue(driver.findElement(notificationsTab).isDisplayed());
	log.debug("Verified that 'Notifications Tab' appeared on the VoiceWatch dashboard");
	Assert.assertTrue(driver.findElement(notificationsTab).isEnabled());
	log.debug("Verified that 'Notifications Tab' enabled on the VoiceWatch dashboard");
	Assert.assertFalse(driver.getCurrentUrl().contains("notifi"));
	log.debug("Verified that 'Notifications Tab' not selected on the VoiceWatch dashboard");
	
	
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
	
    
public void tagTab() {
		
		if (driver.findElement(tagTab).isDisplayed()) {
			
			log.debug("Verified that 'Tags Tab' is appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Tags Tab' is not appeared on the VoiceWatch dashboard");
			
		}
  
}
	
		public static void scriptsTab() {
	
//	if (Assert.assertEquals(true, driver.findElement(scriptsTab).isDisplayed())) {
			if ((driver.findElement(scriptsTab).isDisplayed())) {
			
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
			
		}
		
}
	
	