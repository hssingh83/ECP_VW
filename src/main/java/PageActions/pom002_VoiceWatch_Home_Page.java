package PageActions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class pom002_VoiceWatch_Home_Page {
	private static Logger log =LogManager.getLogger(pom002_VoiceWatch_Home_Page.class.getName());

	public WebDriver driver;
	
    By dashBoardTab=By.linkText("Dashboard");
    By alertsTab=By.linkText("Alerts");
    By testTab=By.linkText("Tests");
    By tagTab=By.linkText("Tags");
    By scriptsTab=By.linkText("Scripts");
    By variablesTab=By.linkText("Variables");
    By hammersTab=By.linkText("Hammers");
    By notificationsTab=By.linkText("Notifications");
    By usersTab=By.linkText("Users");
    By clientsTab=By.linkText("Clients");
    By auditTab=By.linkText("Audit");
    By adminsTab=By.linkText("Admin");
    By headerDropdown=By.xpath("//*[@id=\"wrapper\"]/header/section[1]/div/div/div/ul/li[1]/a");
    By headerContactUs=By.xpath("//*[@id=\"wrapper\"]/header/section[1]/div/div/div/ul/li[2]/a");
    By headerHelp=By.xpath("//*[@id=\"wrapper\"]/header/section[1]/div/div/div/ul/li[3]/a");
    By headerTime=By.xpath("//*[@id=\"wrapper\"]/header/section[2]/div/span");
    By headerEmpirixLogo=By.xpath("//*[@id=\"logo\"]/img");
    By headerEmpirixLebel=By.xpath("//*[@id=\"logo\"]/span[1]/span");
    By headerApplicationName=By.xpath("//*[@id=\"logo\"]/span[2]");
    By footerBackToTop=By.xpath("//*[@id=\"wrapper\"]/footer/div/a");
    By footerVersion=By.xpath("//*[@id=\"wrapper\"]/footer/div/span[2]/span");
    By footerVersionNumber=By.xpath("//*[@id=\"wrapper\"]/footer/div/span[2]/a");
    By footerEmpirixLebel=By.xpath("//*[@id=\"wrapper\"]/footer/div/span[1]");
    
    
    
	//ContractorA
	
	public pom002_VoiceWatch_Home_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// Method for Verified Lables under Client Tab
	
	public void home_screen() {	
		
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
	
	
		if (driver.findElements(tagTab).isEmpty()) {
			
			log.debug("Verified that 'Tags Tab' is not appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Tags Tab' appeared on the VoiceWatch dashboard");
			
		}  
	
	

	if (driver.findElements(scriptsTab).isEmpty()) {
		
		log.debug("Verified that 'Scripts Tab' is not appearing on the VoiceWatch dashboard");
		
					
	}else
	
	{
		log.debug("Verified that 'Scripts Tab' appeared on the VoiceWatch dashboard");
		
	}


	
	
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
	
	
	if (driver.findElements(hammersTab).isEmpty()) {
		
		log.debug("Verified that 'Hammers Tab' is not appearing on the VoiceWatch dashboard");
		
					
	}else
	
	{
		log.debug("Verified that 'Hammers Tab' appeared on the VoiceWatch dashboard");
		
	}
	
	if (driver.getCurrentUrl().contains("admin_dash")) {	
			
			
			log.debug("Verified that 'Admin Tab' selected on the VoiceWatch application");

						
		}else
		
		{
			log.debug("Verified that 'Dashboard Tab' selected on the VoiceWatch application");
			
		}

	
	
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
	
	
if (driver.findElements(usersTab).isEmpty()) {
		
		log.debug("Verified that 'Users Tab' is not appearing on the VoiceWatch dashboard");
		
					
	}else
	
	{
		log.debug("Verified that 'Users Tab' appeared on the VoiceWatch dashboard");
		
	}


		
	
		
		if (driver.findElements(clientsTab).isEmpty()) {
			
			log.debug("Verified that 'Clients Tab' is not appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Clients Tab' appeared on the VoiceWatch dashboard");
			
		}
  
	
	

		
		if (driver.findElements(auditTab).isEmpty()) {
			
			log.debug("Verified that 'Audit Tab' is not appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Audit Tab' appeared on the VoiceWatch dashboard");
			
		}
  
	
	
	
			
		if (driver.findElements(adminsTab).isEmpty()) {
			
			log.debug("Verified that 'Admin Tab' is not appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Admin Tab' appeared on the VoiceWatch dashboard");
			
		}
  

		if (driver.getCurrentUrl().contains("admin_dash")) {	
			
			
			log.debug("Verified that 'Admin Tab' selected on the VoiceWatch application");

						
		}else
		
		{
			log.debug("Verified that 'Dashboard Tab' selected on the VoiceWatch application");
			
		}	
		
	}
	
	
	
	
	
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


	
	public void header() {
		
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
			
	}
	
	
    
public void tagTab() {
		
		if (driver.findElements(tagTab).isEmpty()) {
			
			log.debug("Verified that 'Tags Tab' is not appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Tags Tab' appeared on the VoiceWatch dashboard");
			
		}
  
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
			
		}
		
}
	
	