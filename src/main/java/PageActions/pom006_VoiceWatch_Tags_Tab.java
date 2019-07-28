package PageActions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class pom006_VoiceWatch_Tags_Tab {
	private static Logger log =LogManager.getLogger(pom006_VoiceWatch_Tags_Tab.class.getName());

	public WebDriver driver;
	
	By tagTab=By.linkText("Tags");
	By alertsTab=By.linkText("Alerts");	
	By tagslabel=By.xpath("//*[@id=\"LAB-R\"]/div/div[1]/div/div/div[1]");
	By tagfilterBox=By.xpath("//input[@placeholder='Filter by tag name']");
	By tagCreateplusbutton=By.xpath("//span[@class='glyphicon glyphicon-plus-sign']");	
	By taglabel=By.xpath("//h4[contains(text(),'Tag')]");
	By pleaseselecttaglabel=By.xpath("//span[@id='loading']");
	By createNewTagLink=By.xpath("//u[contains(text(),'or create a new tag')]");
	By tagNamelabel=By.xpath("//div[@class='input-group-addon']");	
	By tagNamefield=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/div[1]/form/section/div/div/input");
	By saveButton=By.xpath("//span[@class='pull-right']//button[contains(@class,'btn btn-primary btn-sm')]");
	By deleteButton=By.xpath("//span[@class='pull-right']//button[@class='btn btn-danger btn-sm']");
		
	
	
    
	//ContractorA
	
	public pom006_VoiceWatch_Tags_Tab(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// Method for Verified Lables under Client Tab
	
	public void tagsValidations() throws InterruptedException {	

		driver.findElement(tagTab).click();		
		Thread.sleep(10000);
		
		
		
		
		Assert.assertTrue(driver.findElement(tagslabel).isDisplayed());
		log.debug("Verified that 'Tags' label appeared on left side under Tag tab");		
		Assert.assertEquals(driver.findElement(tagslabel).getText(), "Tags");		
		log.debug("Verified that 'Tags' Text validated on left side under Tag Tab");		
		
		Assert.assertTrue(driver.findElement(tagfilterBox).isDisplayed());
		log.debug("Verified that 'Filter by tag name' box appeared on n left side under Tag tab");
		Assert.assertTrue(driver.findElement(tagfilterBox).isEnabled());		
		log.debug("Verified that 'Filter by tag name or tag filter'enabled under Tag tab");
		Assert.assertFalse(driver.findElement(tagfilterBox).isSelected());		
		log.debug("Verified that 'Filter by tag name' is blank while access tag tab");
				
		Assert.assertTrue(driver.findElement(taglabel).isDisplayed());
		log.debug("Verified that 'Tag' label appeared on under Tags tab");		
		Assert.assertEquals(driver.findElement(taglabel).getText(), "Tag");		
		log.debug("Verified that 'Tag' Text validated under Tag Tab");	
		
		Assert.assertTrue(driver.findElement(pleaseselecttaglabel).isDisplayed());
		log.debug("Verified that 'Please select a tag' label appeared on under Tag tab");		
		Assert.assertEquals(driver.findElement(pleaseselecttaglabel).getText(), "Please select a tag");		
		log.debug("Verified that 'Please select a tag ' Text validated under Test tag");
		
	}

	  
	public void createTagbybutton() {
		
          if (driver.findElements(tagCreateplusbutton).isEmpty()) {
			
			log.debug("Verified that new tag creation plus (+) icon not appeared on top left side under tags tab");	
			
						
		}else
		
		{
			log.debug("Verified that new tag creation plus (+) icon appeared on top left side under tags tab");	
			
			
		
		log.debug("Validated the element please set while click Tag Creation using button (+)");
		driver.findElement(tagCreateplusbutton).click();
		
		Assert.assertTrue(driver.findElement(tagNamelabel).isDisplayed());
		log.debug("Verified that 'Tags' label appeared on left side under Tag tab");		
		Assert.assertEquals(driver.findElement(tagNamelabel).getText(), "Tag Name");		
		log.debug("Verified that 'Tag Name' Text validated on left side under Tag Tab");		
		
		
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'Save button' displayed under Tag tab");	
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'Save button' is disbaled under Tag tab");	
		Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
		log.debug("Verified that 'Save' Text appeared on save button under Tag Tab");	
		
		
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'Delete button' displayed under tags tab");	
		Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
		log.debug("Verified that 'Delete button' is disbaled under tags tab");	
		Assert.assertEquals(driver.findElement(deleteButton).getText(), "Delete");		
		
		}
	}
		
	public void createNewTag() {
	
	
	   log.debug("Navigate to Alerts Tab");
	   driver.findElement(alertsTab);
	   driver.findElement(tagTab).click();
	   log.debug("Again Navigate Back to Tags Tab");
	   
	
	
	if (driver.findElements(createNewTagLink).isEmpty()) {
		
		log.debug("Verified that new tag created link is not appearing under Tags tab");		
		
					
	}else
	
	{
		
		log.debug("Verified that new test created link appeared under Tags tab");	    		
	
	}

	log.debug("Validated the element please set while click Tag Creation using button (+)");
	driver.findElement(tagCreateplusbutton).click();
	
	Assert.assertTrue(driver.findElement(tagNamelabel).isDisplayed());
	log.debug("Verified that 'Tags' label appeared on left side under Tag tab");		
	Assert.assertEquals(driver.findElement(tagNamelabel).getText(), "Tag Name");		
	log.debug("Verified that 'Tag Name' Text validated on left side under Tag Tab");		
	
	
	Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
	log.debug("Verified that 'Save button' displayed under Tag tab");	
	Assert.assertFalse(driver.findElement(saveButton).isEnabled());
	log.debug("Verified that 'Save button' is disbaled under Tag tab");	
	Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
	log.debug("Verified that 'Save' Text appeared on save button under Tag Tab");	
	
	
	Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
	log.debug("Verified that 'Delete button' displayed under tags tab");	
	Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
	log.debug("Verified that 'Delete button' is disbaled under tags tab");	
	Assert.assertEquals(driver.findElement(deleteButton).getText(), "Delete");		
	
	}
		}
	