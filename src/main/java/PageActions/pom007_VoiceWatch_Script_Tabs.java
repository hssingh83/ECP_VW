package PageActions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class pom007_VoiceWatch_Script_Tabs {
	private static Logger log =LogManager.getLogger(pom007_VoiceWatch_Script_Tabs.class.getName());

	public WebDriver driver;
	
	By tagTab=By.linkText("Tags");
	By scriptsTab=By.linkText("Scripts");
	
	By goScriptBuilderTab=By.xpath("//span[contains(text(),'Go Script Builder')]");
	
	By goScriptBuilderTab1=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/div/div[2]/ul/li[1]/a");
	
	
	
	By goScriptBuilderScriptslabel=By.xpath("//div[@class='panel-heading ng-binding']");
	By goScriptBuilderScriptsCount=By.xpath("//span[@class='badge pull-right ng-binding']");
	
//	By goScriptBuilderScriptsCount1=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[1]/div/div[3]/div/div[1]/span");
	
	By filterByNameGSB=By.xpath("//input[@placeholder='Filter by name']");
	By createNewScriptPlusButton=By.xpath("//div[@class='panel-body']//span[@class='glyphicon glyphicon-plus-sign pull-right']");
	By pleaseSelectlabelGSB=By.xpath("//span[contains(text(),'Please select a script or')]");
	By createNewScriptlinkGSB=By.xpath("//u[contains(text(),'create a new script')]");
	By scriptUploadTab=By.xpath("//span[contains(text(),'Script Upload')]");
	By callMasterScriptslabel=By.xpath("//div[@class='panel-heading ng-binding']");
	By callMasterScriptscount=By.xpath("//span[@class='badge pull-right ng-binding']");
	By filterByNameSU=By.xpath("//input[@placeholder='Filter by name']");
	By pleaseSelectlabelSU=By.xpath("//span[contains(text(),'Please select a script or')]");
	By createNewScriptlinkSU=By.xpath("//u[contains(text(),'create a new script')]");
	By csvTranformerTab=By.xpath("//span[contains(text(),'CSV Transformer')]");
	By csvUploadLabel=By.xpath("By csvTranformerTab=By.xpath(\"//span[contains(text(),'CSV Transformer')]\");");
	By transformedCSVlabel=By.xpath("//span[contains(text(),'Transformed CSV(s)')]");
	By filterByCSV=By.xpath("//div[@class='row margin-left-right-0px']//h4//i//input[@placeholder='Filter by csv file name']");
	By samplecsvDownoad=By.xpath("//span[contains(text(),'Sample CSV download')]");
	
	
	
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
	
	public pom007_VoiceWatch_Script_Tabs(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// Method for Verified Lables under Client Tab
	
	public void goScriptBuilderTabValidation() throws InterruptedException {	

		driver.findElement(scriptsTab).click();		
		Thread.sleep(10000);
		
	//	Assert.assertTrue(driver.findElement(goScriptBuilderTab1).isSelected());		
	//	log.debug("Verified that 'Go Script Builder' is selected while click script tab");
		
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
		log.debug("Verified that 'Go Script Builder Scripts' label appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isEnabled());
		log.debug("Verified that 'Go Script Builder Scripts' label enabled on left side of under Script tab");	
	//	Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText(), "Go Script Builder Scripts 	25");	
	//	Assert.assertEquals(driver.findElements(goScriptBuilderScriptslabel).contains(goScriptBuilderScriptslabel), true );
		log.debug("Verified that 'Go Script Builder Scripts' Text validated on left side under Script Tab");		
		
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isDisplayed());
		log.debug("Verified that 'Script count' dispalyed left side under Script tab");
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isEnabled());		
		log.debug("Verified that 'Script count' enabled left side under Script tab");
		
		Assert.assertTrue(driver.findElement(filterByNameGSB).isDisplayed());
		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(filterByNameGSB).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");	
		
		
         if (driver.findElements(pleaseSelectlabelGSB).isEmpty()) {
			
        	 log.debug("Verified that 'Please select a Call Master Script from the left. ' label appeared on  under Go Script builder tab");
 			log.debug("Verified that 'Please select a Call Master Script from the left. ' label enabled under Go Script builder tab");	
 			log.debug("Verified that 'Please select a Call Master Script from the left.' Text validated under Go Script Builder");
			
						
		}else
		
		{
			log.debug("Verified that 'Please select a script ' label appeared on  under Go Script builder tab");
			log.debug("Verified that 'Please select a script ' label enabled under Go Script builder tab");	
			log.debug("Verified that 'Please select a script or' Text validated under Go Script Builder");
			
		}  
		
		
		/*
		Assert.assertTrue(driver.findElement(pleaseSelectlabelGSB).isDisplayed());
		log.debug("Verified that 'Please select a script ' label appeared on  under Go Script builder tab");	
		Assert.assertTrue(driver.findElement(pleaseSelectlabelGSB).isEnabled());
		log.debug("Verified that 'Please select a script ' label enabled under Go Script builder tab");	
		Assert.assertEquals(driver.findElement(pleaseSelectlabelGSB).getText(), "Please select a script or");		
		log.debug("Verified that 'Please select a script or' Text validated under Go Script Builder");*/
		
				
	/*driver.findElement(scriptUploadTab).click();
		Thread.sleep(1000);
		System.out.println("Script Upload");
		Thread.sleep(1000);
		driver.findElement(csvTranformerTab).click();
		System.out.println("CSV UPLOAD");
		Thread.sleep(1000);
		driver.findElement(goScriptBuilderTab).click();
		System.out.println("Go scipt");*/
	
				
	}
	
	public void scriptUploadTabValidation() throws InterruptedException {	

			
		
		driver.findElement(scriptUploadTab).click();
		Thread.sleep(1000);
		
	//	Assert.assertTrue(driver.findElement(goScriptBuilderTab1).isSelected());		
	//	log.debug("Verified that 'Go Script Builder' is selected while click script tab");
		
		Assert.assertTrue(driver.findElement(callMasterScriptslabel).isDisplayed());
		log.debug("Verified that 'Call Master Scripts' label appeared on left side of Script Upload tab under Script tab");	
		Assert.assertTrue(driver.findElement(callMasterScriptslabel).isEnabled());
		log.debug("Verified that 'Call Master Scripts' label enabled on left side of Script Upload tab under Script tab");	
	//	Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText(), "Go Script Builder Scripts 	25");	
	//	Assert.assertEquals(driver.findElements(goScriptBuilderScriptslabel).contains(goScriptBuilderScriptslabel), true );
	//	log.debug("Verified that 'Go Script Builder Scripts' Text validated on left side under Script Tab");		
		
		Assert.assertTrue(driver.findElement(callMasterScriptscount).isDisplayed());
		log.debug("Verified that 'Call master Script count' dispalyed on left side of Script Upload tab under Script tab");	
		Assert.assertTrue(driver.findElement(callMasterScriptscount).isEnabled());		
		log.debug("Verified that 'Call master Script count' enabled on left side of Script Upload tab under Script tab");	
		
		Assert.assertTrue(driver.findElement(filterByNameSU).isDisplayed());
		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(filterByNameSU).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");	
		
		/*Assert.assertTrue(driver.findElement(pleaseSelectlabelGSB).isDisplayed());
		log.debug("Verified that 'Please select a script ' label appeared on  under Go Script builder tab");	
		Assert.assertTrue(driver.findElement(pleaseSelectlabelGSB).isEnabled());
		log.debug("Verified that 'Please select a script ' label enabled under Go Script builder tab");	
		Assert.assertEquals(driver.findElement(pleaseSelectlabelGSB).getText(), "Please select a script or");		
		log.debug("Verified that 'Please select a script or' Text validated under Go Script Builder");*/
		
			
		  if (driver.findElements(pleaseSelectlabelGSB).isEmpty()) {
				
	        	 log.debug("Verified that 'Please select a Go Script from the left. ' label appeared on  under Script Upload tab");
	 			log.debug("Verified that 'Please select a Go Script from the left. ' label enabled under Script Upload tab");	
	 			log.debug("Verified that 'Please select a Go Script from the left.' Text validated under Script Upload tab");
				
							
			}else
			
			{
				log.debug("Verified that 'Please select a script ' label appeared on  under Script Upload tab");
				log.debug("Verified that 'Please select a script ' label enabled under Script Upload tab");	
				log.debug("Verified that 'Please select a script or' Text validated under Script Upload tab");
				
			}  
		
		
		/*driver.findElement(scriptUploadTab).click();
		Thread.sleep(1000);
		System.out.println("Script Upload");
		Thread.sleep(1000);
		driver.findElement(csvTranformerTab).click();
		System.out.println("CSV UPLOAD");
		Thread.sleep(1000);
		driver.findElement(goScriptBuilderTab).click();
		System.out.println("Go scipt");*/
	
				
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
	
	/*
	   log.debug("Navigate to Alerts Tab");
	   driver.findElement(alertsTab);*/
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
	