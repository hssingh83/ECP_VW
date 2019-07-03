package PageActions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class pom005_VoiceWatch_Tests_Tab {
	private static Logger log =LogManager.getLogger(pom005_VoiceWatch_Tests_Tab.class.getName());

	public WebDriver driver;
	
	By testTab=By.linkText("Tests");
	
	By testslabel=By.className("panel-heading");
	
    By filterBox=By.xpath("//input[@placeholder='Filter by test name']");
	
	By testCreateplusbutton=By.xpath("//span[@class='glyphicon glyphicon-plus-sign']");
	
	By testlabel=By.xpath("//h4[contains(text(),'Test')]");
	
	By pleaseSelectlabel=By.xpath("//span[@id='loading']");
	
//	By testCreateLink=By.xpath("//u[contains(text(),'or create a new test')]']");
	
	By testCreateLink=By.linkText("or create a new test");
	

	
	
	
	By testTimeColumn=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/table/thead/tr/th[1]/span[1]");
	
	By hammerColumn=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/table/thead/tr/th[2]/div/span[1]");
	
	By testColumn=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/table/thead/tr/th[3]/span[1]");
	
	By errorStepColumn=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/table/thead/tr/th[4]");
	
	By errorMessageColumn=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/table/thead/tr/th[5]");
	
	By ThresholdColumn=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/table/thead/tr/th[6]");
	
	By SeverityColumn=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/table/thead/tr/th[7]");
	
	By alertStatusColumn=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/table/thead/tr/th[8]");
	
	By totallabel=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[3]/span[1]/span");
	
	By criticallabel=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[3]/span[2]/span");
	
	By warninglabel=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[3]/span[3]/span");
	
	
	
	
	   
    
	//ContractorA
	
	public pom005_VoiceWatch_Tests_Tab(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// Method for Verified Lables under Client Tab
	
	public void testsValidations() {	
		
		driver.findElement(testTab).click();
		
		Assert.assertTrue(driver.findElement(testslabel).isDisplayed());
		log.debug("Verified that 'Tests' label appeared on left side under Tests tab");		
		Assert.assertEquals(driver.findElement(testslabel).getText(), "Tests");		
		log.debug("Verified that 'Tests' Text validated on left side under Test Tab");		
		
		Assert.assertTrue(driver.findElement(filterBox).isDisplayed());
		log.debug("Verified that 'Filter by test name' box appeared on n left side under Tests tab");
		Assert.assertTrue(driver.findElement(filterBox).isEnabled());		
		log.debug("Verified that 'Filter by test name or tag filter'enabled under Alert tab");
		Assert.assertFalse(driver.findElement(filterBox).isSelected());		
		log.debug("Verified that 'Filter by test name' is blank while access test tab");
		
		Assert.assertTrue(driver.findElement(testCreateplusbutton).isDisplayed());
		log.debug("Verified that new test creation plus (+) icon appeared on top left side under Tests tab");		
		Assert.assertTrue(driver.findElement(testCreateplusbutton).isEnabled());
		log.debug("Verified that new test creation plus (+) icon enabled on top left side under Tests tab");		
		Assert.assertFalse(driver.findElement(testCreateplusbutton).isSelected());
		log.debug("Verified that new test creation plus (+) icon not selected while access the Tests tab");
		
		Assert.assertTrue(driver.findElement(testlabel).isDisplayed());
		log.debug("Verified that 'Test' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(testlabel).getText(), "Test");		
		log.debug("Verified that 'Test' Text validated under Test Tab");	
		
		Assert.assertTrue(driver.findElement(pleaseSelectlabel).isDisplayed());
		log.debug("Verified that 'Please select a test' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(pleaseSelectlabel).getText(), "Please select a test");		
		log.debug("Verified that 'Please select a test ' Text validated under Test Tab");
		
		Assert.assertTrue(driver.findElement(testCreateLink).isDisplayed());
		log.debug("Verified that new create a new test link appeared under Tests tab");		
		Assert.assertTrue(driver.findElement(testCreateLink).isEnabled());
		log.debug("Verified that new create a new test link enabled under Tests tab");	
		
	}
}
	/*	Assert.assertTrue(driver.findElement(filterBox).isDisplayed());
		log.debug("Verified that 'Filter by test name or tag filter'appeared under Alert tab");
		Assert.assertTrue(driver.findElement(filterBox).isEnabled());		
		log.debug("Verified that 'Filter by test name or tag filter'enabled under Alert tab");
		Assert.assertFalse(driver.findElement(filterBox).isSelected());		
		log.debug("Verified that 'Filter by test name or tag filter'selectable under Alert tab");
		
		
		Assert.assertTrue(driver.findElement(testTimeColumn).isDisplayed());
		log.debug("Verified that 'Test Time' dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(testTimeColumn).getText(), "Test Time");		
		log.debug("Verified that 'Test Time' coloumn under Alerts Tab");
		
		Assert.assertTrue(driver.findElement(hammerColumn).isDisplayed());
		log.debug("Verified that 'Hammer' dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(hammerColumn).getText(), "Hammer");		
		log.debug("Verified that 'Hammer' coloumn under Alerts Tab");
		
		Assert.assertTrue(driver.findElement(testColumn).isDisplayed());
		log.debug("Verified that 'Test' dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(testColumn).getText(), "Test");		
		log.debug("Verified that 'Test' coloumn under Alerts Tab");
		
		Assert.assertTrue(driver.findElement(errorStepColumn).isDisplayed());
		log.debug("Verified that 'Error Step' dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(errorStepColumn).getText(), "Error Step");		
		log.debug("Verified that 'Error Step' coloumn under Alerts Tab");
		
		Assert.assertTrue(driver.findElement(errorMessageColumn).isDisplayed());
		log.debug("Verified that 'Error Message' dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(errorMessageColumn).getText(), "Error Message");		
		log.debug("Verified that 'Error Message' coloumn under Alerts Tab");
		
		Assert.assertTrue(driver.findElement(ThresholdColumn).isDisplayed());
		log.debug("Verified that 'Threshold' dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(ThresholdColumn).getText(), "Threshold");		
		log.debug("Verified that 'Threshold' coloumn under Alerts Tab");
		
		Assert.assertTrue(driver.findElement(SeverityColumn).isDisplayed());
		log.debug("Verified that 'Severity' dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(SeverityColumn).getText(), "Severity");		
		log.debug("Verified that 'Severity' coloumn under Alerts Tab");
		

		Assert.assertTrue(driver.findElement(alertStatusColumn).isDisplayed());
		log.debug("Verified that 'Alert Status' dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(alertStatusColumn).getText(), "Alert Status");		
		log.debug("Verified that 'Alert Status' coloumn under Alerts Tab");
		
		Assert.assertTrue(driver.findElement(totallabel).isDisplayed());
		log.debug("Verified that count of total alert dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(totallabel).getText(), "Total");		
		log.debug("Verified that 'Toal' text contain under Alerts Tab");
		
		Assert.assertTrue(driver.findElement(criticallabel).isDisplayed());
		log.debug("Verified that count of critical alert dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(criticallabel).getText(), "Critical");		
		log.debug("Verified that 'critical' text contain under Alerts Tab");
		
		Assert.assertTrue(driver.findElement(warninglabel).isDisplayed());
		log.debug("Verified that count of Warning alerts dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(warninglabel).getText(), "Warning");		
		log.debug("Verified that 'Warning' text contain under Alerts Tab");*/
	


	
	
/*public void hammerColumn() {
	
	if (driver.findElements(hammerColumn).isEmpty()) {
		
		log.debug("Verified that 'Hammer' coloum is not displaying under Alerts Tab");
		
					
	}else
	
	{
		log.debug("Verified that 'Hammer' coloum dislayed under Alerts Tab");
		
	}*/


	