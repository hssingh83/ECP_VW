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
	

	
	By filterByNameGSB=By.xpath("//input[@placeholder='Filter by name']");
	
	By createNewScriptByButton=By.xpath("//div[@class='panel-body']//span[@class='glyphicon glyphicon-plus-sign pull-right']");
	
	By pleaseSelectlabelGSB=By.xpath("//span[contains(text(),'Please select a script or')]");
	By createNewScriptBylink=By.linkText("create a new script"); 
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
	By scriptNamelabel=By.xpath("//div[contains(text(),'Script name')]");
	By scriptNamefield=By.xpath("//input[@placeholder='Enter script name']");
	By scriptDescGSBlabel=By.xpath("//form[@name='wbs_form']//div[@class='small-width'][contains(text(),'Description')]");	
	By scriptDescSUlabel=By.xpath("//form[@name='cms_form']//div[@class='small-width'][contains(text(),'Description')]");	
	By scriptDescGSBfield=By.xpath("//form[@name='wbs_form']//input[@placeholder='Enter description']");
	By scriptDescSUfield=By.xpath("//form[@name='cms_form']//input[@placeholder='Enter description']");
	By saveButton=By.xpath("//button[@class='btn btn-info btn-sm btn-float-right']");
	By scriptBuilderlabel=By.xpath("//a[contains(text(),'Script Builder')]");
	By resultslabel=By.xpath("//a[contains(text(),'Results')]");
	By callLogsNamelabel=By.xpath("//a[contains(text(),'Call Logs')]");
	By associatedTestslabel=By.xpath("//a[contains(text(),'Associated Tests')]");
//	By uploadScriptXMLFile=By.className("files_upload ng-pristine ng-untouched ng-valid ng-empty");
	
	By uploadScriptFile=By.xpath("//div[@class='files_upload ng-pristine ng-untouched ng-valid ng-empty']");
		
	
	
    
	//ContractorA
	
	public pom007_VoiceWatch_Script_Tabs(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// Method for Verified Lables under Client Tab

//==================================================================================	
	public void goScriptBuilderTabValidation() throws InterruptedException {	

		driver.findElement(scriptsTab).click();		
		Thread.sleep(10000);
		
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
		log.debug("Verified that 'Go Script Builder Scripts' label appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isEnabled());
		log.debug("Verified that 'Go Script Builder Scripts' label enabled on left side of under Script tab");	
		
		Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText().contains("Go Script Builder Scripts"), true);	
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
		
		
				
	}

//=====================================================================================	
	public void scriptUploadTabValidation() throws InterruptedException {	

			
		
		driver.findElement(scriptUploadTab).click();
		Thread.sleep(10000);
		
			
		Assert.assertTrue(driver.findElement(callMasterScriptslabel).isDisplayed());
		log.debug("Verified that 'Call Master Scripts' label appeared on left side of Script Upload tab under Script tab");	
		Assert.assertTrue(driver.findElement(callMasterScriptslabel).isEnabled());
		log.debug("Verified that 'Call Master Scripts' label enabled on left side of Script Upload tab under Script tab");	
		Assert.assertEquals(driver.findElement(callMasterScriptslabel).getText().contains("Call Master Scripts"), true);	
		log.debug("Verified that 'Call Master Scripts' Text validated on left side under Script Upload Tab");		
		
		Assert.assertTrue(driver.findElement(callMasterScriptscount).isDisplayed());
		log.debug("Verified that 'Call master Script count' dispalyed on left side of Script Upload tab under Script tab");	
		Assert.assertTrue(driver.findElement(callMasterScriptscount).isEnabled());		
		log.debug("Verified that 'Call master Script count' enabled on left side of Script Upload tab under Script tab");	
		
		Assert.assertTrue(driver.findElement(filterByNameSU).isDisplayed());
		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(filterByNameSU).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");	
					
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
		
		  if (driver.findElements(createNewScriptBylink).isEmpty()) {
				
				log.debug("Verified that create a new script by link is not appeared under Script Upload");	
				
							
			}else
			
			{
				log.debug("Verified that create a new script by link is appeared under under Script Upload");			
	}
	
	}
	
//=================================================================================================	
	
	public void createGSBbybutton() throws InterruptedException {
		
		driver.findElement(scriptsTab).click();
		
		
		
		
          if (driver.findElements(createNewScriptByButton).isEmpty()) {
			
			log.debug("Verified that create a new script plus (+) icon not appeared on top left side under Script tab");	
			
						
		}else
		
		{
			log.debug("Verified that create a new script plus (+) icon appeared on top left side under Script tab");	
		
			Thread.sleep(10000);
			
			driver.findElement(createNewScriptByButton).click();
		log.debug("Validated the element while click Script Creation using button (+)");
		
				
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
		log.debug("Verified that 'Go Script Builder Scripts' label appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isEnabled());
		log.debug("Verified that 'Go Script Builder Scripts' label enabled on left side of under Script tab");	
		Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText().contains("Go Script Builder Scripts"), true);	
		log.debug("Verified that 'Go Script Builder Scripts' Text validated on left side under Script Tab");		
		
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isDisplayed());
		log.debug("Verified that 'Script count' dispalyed left side under Script tab");
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isEnabled());		
		log.debug("Verified that 'Script count' enabled left side under Script tab");
		
		Assert.assertTrue(driver.findElement(filterByNameGSB).isDisplayed());
		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(filterByNameGSB).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");			
		
		Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
		log.debug("Verified that 'Script name' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
		log.debug("Verified that 'Script name' Text validated on under Go Script Builder");		
		
		Assert.assertTrue(driver.findElement(scriptNamefield).isDisplayed());
		log.debug("Verified that 'Script name' filed appeared on under Go Script Builder");		
		Assert.assertTrue(driver.findElement(scriptNamefield).isEnabled());		
		log.debug("Verified that 'Script name' field enabled on under Go Script Builder");	

		Assert.assertTrue(driver.findElement(scriptDescGSBlabel).isDisplayed());
		log.debug("Verified that 'Description' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptDescGSBlabel).getText(), "Description");		
		log.debug("Verified that 'Description' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(scriptDescGSBfield).isDisplayed());
		log.debug("Verified that 'Description' label appeared on under Go Script Builder");		
		Assert.assertTrue(driver.findElement(scriptDescGSBfield).isEnabled());		
		log.debug("Verified that 'Description' field enabled on under Go Script Builder");	
		
				
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'Save button' displayed under Go Script Upload tab");	
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'Save button' is disbaled under Go Script Upload tab");	
		Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
		log.debug("Verified that 'Save' Text appeared on save button under Go Script Upload tab");	
		
		Assert.assertTrue(driver.findElement(scriptBuilderlabel).isDisplayed());
		log.debug("Verified that 'Script Builder' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptBuilderlabel).getText(), "Script Builder");		
		log.debug("Verified that 'Script Builder' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(resultslabel).isDisplayed());
		log.debug("Verified that 'Results' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(resultslabel).getText(), "Results");		
		log.debug("Verified that 'Results' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(callLogsNamelabel).isDisplayed());
		log.debug("Verified that 'Call Logs' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(callLogsNamelabel).getText(), "Call Logs");		
		log.debug("Verified that 'Call Logs' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(associatedTestslabel).isDisplayed());
		log.debug("Verified that 'Associted Test' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(associatedTestslabel).getText(), "Associated Tests");		
		log.debug("Verified that 'Associted Test' Text validated on under Go Script Builder");	
		

		}
	}

	//=================================================================================================		
	
public void createGSBbyLink() throws InterruptedException {
		
	driver.findElement(tagTab).click();
	driver.findElement(scriptsTab).click();
	

		
		
          if (driver.findElements(createNewScriptBylink).isEmpty()) {
			
			log.debug("Verified that create a new script by link is not appeared under Go Script Builder tab");	
			
						
		}else
		
		{
			log.debug("Verified that create a new script by link is appeared under Go Script Builder tab");	
			
			Thread.sleep(10000);
			driver.findElement(createNewScriptBylink).click();
	
	
 		log.debug("Validated the element while click create a new script by link");
		
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
		log.debug("Verified that 'Go Script Builder Scripts' label appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isEnabled());
		log.debug("Verified that 'Go Script Builder Scripts' label enabled on left side of under Script tab");	
		Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText().contains("Go Script Builder Scripts"), true);	
		log.debug("Verified that 'Go Script Builder Scripts' Text validated on left side under Script Tab");		
		
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isDisplayed());
		log.debug("Verified that 'Script count' dispalyed left side under Script tab");
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isEnabled());		
		log.debug("Verified that 'Script count' enabled left side under Script tab");
		
		Assert.assertTrue(driver.findElement(filterByNameGSB).isDisplayed());
		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(filterByNameGSB).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");			
		
		Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
		log.debug("Verified that 'Script name' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
		log.debug("Verified that 'Script name' Text validated on under Go Script Builder");		
		
		Assert.assertTrue(driver.findElement(scriptNamefield).isDisplayed());
		log.debug("Verified that 'Script name' filed appeared on under Go Script Builder");		
		Assert.assertTrue(driver.findElement(scriptNamefield).isEnabled());		
		log.debug("Verified that 'Script name' field enabled on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(scriptDescGSBlabel).isDisplayed());
		log.debug("Verified that 'Description' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptDescGSBlabel).getText(), "Description");		
		log.debug("Verified that 'Description' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(scriptDescGSBfield).isDisplayed());
		log.debug("Verified that 'Description' label appeared on under Go Script Builder");		
		Assert.assertTrue(driver.findElement(scriptDescGSBfield).isEnabled());		
		log.debug("Verified that 'Description' field enabled on under Go Script Builder");	
		
				
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'Save button' displayed under Go Script Upload tab");	
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'Save button' is disbaled under Go Script Upload tab");	
		Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
		log.debug("Verified that 'Save' Text appeared on save button under Go Script Upload tab");	
		
		Assert.assertTrue(driver.findElement(scriptBuilderlabel).isDisplayed());
		log.debug("Verified that 'Script Builder' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptBuilderlabel).getText(), "Script Builder");		
		log.debug("Verified that 'Script Builder' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(resultslabel).isDisplayed());
		log.debug("Verified that 'Results' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(resultslabel).getText(), "Results");		
		log.debug("Verified that 'Results' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(callLogsNamelabel).isDisplayed());
		log.debug("Verified that 'Call Logs' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(callLogsNamelabel).getText(), "Call Logs");		
		log.debug("Verified that 'Call Logs' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(associatedTestslabel).isDisplayed());
		log.debug("Verified that 'Associted Test' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(associatedTestslabel).getText(), "Associated Tests");		
		log.debug("Verified that 'Associted Test' Text validated on under Go Script Builder");	
		

		}
	}	

//==============================================================================

public void createSUbyLink() throws InterruptedException {
	
	driver.findElement(tagTab).click();
	driver.findElement(scriptsTab).click();
	Thread.sleep(10000);
	driver.findElement(scriptUploadTab).click();
		
      if (driver.findElements(createNewScriptBylink).isEmpty()) {
		
		log.debug("Verified that create a new script plus (+) icon not appeared on top left side under Script Upload tab");	
		
					
	}else
	
	{
		log.debug("Verified that create a new script plus (+) icon appeared on top left side under Script Upload tab");	
		
		driver.findElement(createNewScriptByButton).click();
	log.debug("Validated the element while click Script Creation using button (+)");
	
			
	Assert.assertTrue(driver.findElement(callMasterScriptslabel).isDisplayed());
	log.debug("Verified that 'Call Master Scripts' label appeared on left side of Script Upload tab under Script tab");	
	Assert.assertTrue(driver.findElement(callMasterScriptslabel).isEnabled());
	log.debug("Verified that 'Call Master Scripts' label enabled on left side of Script Upload tab under Script tab");	
	Assert.assertEquals(driver.findElement(callMasterScriptslabel).getText().contains("Call Master Scripts"), true);	
	log.debug("Verified that 'Call Master Scripts' Text validated on left side under Script Upload Tab");		
	
	Assert.assertTrue(driver.findElement(callMasterScriptscount).isDisplayed());
	log.debug("Verified that 'Call master Script count' dispalyed on left side of Script Upload tab under Script tab");	
	Assert.assertTrue(driver.findElement(callMasterScriptscount).isEnabled());		
	log.debug("Verified that 'Call master Script count' enabled on left side of Script Upload tab under Script tab");	
	
	Assert.assertTrue(driver.findElement(filterByNameSU).isDisplayed());
	log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
	Assert.assertTrue(driver.findElement(filterByNameSU).isEnabled());
	log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");		
	Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
	log.debug("Verified that 'Script name' label appeared on under Script Upload");		
	Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
	log.debug("Verified that 'Script name' Text validated on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptNamefield).isDisplayed());
	log.debug("Verified that 'Script name' filed appeared on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptNamefield).isEnabled());		
	log.debug("Verified that 'Script name' field enabled on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptDescSUlabel).isDisplayed());
	log.debug("Verified that 'Description' label appeared on under Script Upload");		
	Assert.assertEquals(driver.findElement(scriptDescSUlabel).getText(), "Description");		
	log.debug("Verified that 'Description' Text validated on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptDescSUfield).isDisplayed());
	log.debug("Verified that 'Description' label appeared on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptDescSUfield).isEnabled());		
	log.debug("Verified that 'Description' field enabled on under Script Upload");				
	Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
	log.debug("Verified that 'Save button' displayed under Go Script Upload tab");	
	Assert.assertFalse(driver.findElement(saveButton).isEnabled());
	log.debug("Verified that 'Save button' is disbaled under Go Script Upload tab");	
	Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
	log.debug("Verified that 'Save' Text appeared on save button under Go Script Upload tab");	
	
	Assert.assertTrue(driver.findElement(uploadScriptFile).isDisplayed());
	log.debug("Verified that 'Click to select a script, or drop file below (.xml)' button appeared under Script Upload tab");	
	Assert.assertTrue(driver.findElement(uploadScriptFile).isEnabled());
	log.debug("Verified that 'Click to select a script, or drop file below (.xml)' button enabled under Script Upload tab");
	
	

	}
}
//========================================================================================================================
public void createSUbybutton() throws InterruptedException {
	
	driver.findElement(tagTab).click();
	driver.findElement(scriptsTab).click();
	Thread.sleep(10000);
	driver.findElement(scriptUploadTab).click();
		
      if (driver.findElements(createNewScriptBylink).isEmpty()) {
		
    	  log.debug("Verified that create a new script by link is not appeared under Script Upload tab");	
		
					
	}else
	
	{
		log.debug("Verified that create a new script by link is appeared under Script Upload tab");	
		
		driver.findElement(createNewScriptBylink).click();
	log.debug("Validated the element while click Script Creation using Link");
	
			
	Assert.assertTrue(driver.findElement(callMasterScriptslabel).isDisplayed());
	log.debug("Verified that 'Call Master Scripts' label appeared on left side of Script Upload tab under Script tab");	
	Assert.assertTrue(driver.findElement(callMasterScriptslabel).isEnabled());
	log.debug("Verified that 'Call Master Scripts' label enabled on left side of Script Upload tab under Script tab");	
	Assert.assertEquals(driver.findElement(callMasterScriptslabel).getText().contains("Call Master Scripts"), true);	
	log.debug("Verified that 'Call Master Scripts' Text validated on left side under Script Upload Tab");		
	
	Assert.assertTrue(driver.findElement(callMasterScriptscount).isDisplayed());
	log.debug("Verified that 'Call master Script count' dispalyed on left side of Script Upload tab under Script tab");	
	Assert.assertTrue(driver.findElement(callMasterScriptscount).isEnabled());		
	log.debug("Verified that 'Call master Script count' enabled on left side of Script Upload tab under Script tab");	
	
	Assert.assertTrue(driver.findElement(filterByNameSU).isDisplayed());
	log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
	Assert.assertTrue(driver.findElement(filterByNameSU).isEnabled());
	log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");		
	Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
	log.debug("Verified that 'Script name' label appeared on under Script Upload");		
	Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
	log.debug("Verified that 'Script name' Text validated on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptNamefield).isDisplayed());
	log.debug("Verified that 'Script name' filed appeared on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptNamefield).isEnabled());		
	log.debug("Verified that 'Script name' field enabled on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptDescSUlabel).isDisplayed());
	log.debug("Verified that 'Description' label appeared on under Script Upload");		
	Assert.assertEquals(driver.findElement(scriptDescSUlabel).getText(), "Description");		
	log.debug("Verified that 'Description' Text validated on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptDescSUfield).isDisplayed());
	log.debug("Verified that 'Description' label appeared on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptDescSUfield).isEnabled());		
	log.debug("Verified that 'Description' field enabled on under Script Upload");				
	Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
	log.debug("Verified that 'Save button' displayed under Script Upload tab");	
	Assert.assertFalse(driver.findElement(saveButton).isEnabled());
	log.debug("Verified that 'Save button' is disbaled under Script Upload tab");	
	Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
	log.debug("Verified that 'Save' Text appeared on save button under Script Upload tab");		
	
	Assert.assertTrue(driver.findElement(uploadScriptFile).isDisplayed());
	log.debug("Verified that 'Click to select a script, or drop file below (.xml)' button appeared under Script Upload tab");	
	Assert.assertTrue(driver.findElement(uploadScriptFile).isEnabled());
	log.debug("Verified that 'Click to select a script, or drop file below (.xml)' button enabled under Script Upload tab");	
	
	}
}
//===================================================================================================
public void csvTabValidation() throws InterruptedException {	

	driver.findElement(csvTranformerTab).click();
	Thread.sleep(10000);
	
	
	Assert.assertTrue(driver.findElement(uploadScriptFile).isDisplayed());
	log.debug("Verified that 'Click to select CSV files, or drop them below (.csv,.zip)' button appeared under CSV Upload tab");	
	Assert.assertTrue(driver.findElement(uploadScriptFile).isEnabled());
	log.debug("Verified that 'Click to select CSV files, or drop them below (.csv,.zip)' button enabled under CSV Upload tab");	
	
	Assert.assertTrue(driver.findElement(samplecsvDownoad).isDisplayed());
	log.debug("Verified that 'Sample CSV download' label appeared on left side of under CSV Upload tab");	
	Assert.assertTrue(driver.findElement(transformedCSVlabel).isEnabled());
	log.debug("Verified that 'Sample CSV download' label enabled on left side of under CSV Upload tab");		
	
	Assert.assertTrue(driver.findElement(transformedCSVlabel).isDisplayed());
	log.debug("Verified that 'Transformed CSV(s)' label appeared on left side of under CSV Upload tab");	
	Assert.assertTrue(driver.findElement(transformedCSVlabel).isEnabled());
	log.debug("Verified that 'Transformed CSV(s)' label enabled on left side of under CSV Upload tab");	
	
	Assert.assertTrue(driver.findElement(filterByCSV).isDisplayed());
	log.debug("Verified that 'Filter by csv file name' filed appeared under CSV Upload tab");	
	Assert.assertTrue(driver.findElement(filterByCSV).isEnabled());
	log.debug("Verified that 'Filter by csv file name' filed enabled under CSV Upload tab");		
	
	
}
}