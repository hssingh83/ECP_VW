package PageActions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class pom008_VoiceWatch_Variable_Tab {
	private static Logger log =LogManager.getLogger(pom008_VoiceWatch_Variable_Tab.class.getName());

	public WebDriver driver;
	
	By tagTab=By.linkText("Tags");
	By variablesTab=By.linkText("Variables");
	By variableslabel=By.xpath("//div[@class='panel-heading']");
	By filterByVariableName=By.xpath("//input[@placeholder='Filter by variable name']");
	By variablelabel=By.xpath("//div[@class='ng-scope']//h4[contains(text(),'Variable')]");
	By bulkUploadButton=By.xpath("//span[@class='glyphicon glyphicon-upload']");
	By createVariableByButton=By.xpath(" //span[@class='glyphicon glyphicon-plus-sign']");
	By pleaseSelectlabel=By.xpath("//div[@id='loading']");
	By createaNewVariableLink=By.linkText("Create a new variable");
	By uploadVariableLink=By.linkText("Upload variables via csv");
	By namelabel=By.xpath("//div[@class='input-group-addon']");
	By namefiled=By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required ng-valid-pattern ng-valid-maxlength']  ");
	By valuelabel=By.xpath("//h4[contains(text(),'Value')]");
	By valueFiled=By.xpath("//textarea[@placeholder='Enter content of the variable here.']");
	By saveButton=By.xpath("//span[@class='pull-right']//button[contains(@class,'btn btn-primary btn-sm')]");
	By deleteButton=By.xpath("//span[@class='pull-right']//button[@class='btn btn-danger btn-sm']");
	 
	 
	 
	 
	 
	 
	 
	
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
	
	By scriptBuilderlabel=By.xpath("//a[contains(text(),'Script Builder')]");
	By resultslabel=By.xpath("//a[contains(text(),'Results')]");
	By callLogsNamelabel=By.xpath("//a[contains(text(),'Call Logs')]");
	By associatedTestslabel=By.xpath("//a[contains(text(),'Associated Tests')]");
//	By uploadScriptXMLFile=By.className("files_upload ng-pristine ng-untouched ng-valid ng-empty");
	
	By uploadScriptFile=By.xpath("//div[@class='files_upload ng-pristine ng-untouched ng-valid ng-empty']");
		
	
	
    
	//ContractorA
	
	public pom008_VoiceWatch_Variable_Tab(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// Method for Verified Lables under Client Tab

//==================================================================================	
	public void variableTabValidation() throws InterruptedException {	

		driver.findElement(variablesTab).click();		
		Thread.sleep(10000);
		
		Assert.assertTrue(driver.findElement(variableslabel).isDisplayed());
		log.debug("Verified that 'Variables' label appeared on left side of under Variable tab");	
		Assert.assertTrue(driver.findElement(variableslabel).isEnabled());
		log.debug("Verified that 'Variables' label enabled on left side of under Variable tab");
		Assert.assertEquals(driver.findElement(variableslabel).getText(), "Variables");
		log.debug("Verified that 'Variables' text appearedd on left side of under Variable tab");
		
		Assert.assertTrue(driver.findElement(filterByVariableName).isDisplayed());
		log.debug("Verified that 'Filter by variable name' filed appeared on left side of under Variable tab");	
		Assert.assertTrue(driver.findElement(filterByVariableName).isEnabled());
		log.debug("Verified that 'Filter by variable name' filed enabled on left side of under Variable tab");
		
		Assert.assertTrue(driver.findElement(variablelabel).isDisplayed());
		log.debug("Verified that 'Variable' label appeared under Variable tab");	
		Assert.assertTrue(driver.findElement(variablelabel).isEnabled());
		log.debug("Verified that 'Variable' label enabled on under Variable tab");
		Assert.assertEquals(driver.findElement(variablelabel).getText(), "Variable");
		log.debug("Verified that 'Variables' text appearedd on left side of under Variable tab");
		
		
		if (driver.findElements(bulkUploadButton).isEmpty()) {
			
			log.debug("Verified that 'Bulk Upload Variable via CSV' button is not displaying under Variable tab");
			log.debug("Verified that 'Bulk Upload Variable via CSV' button is not enabled under Variable tab");	
			
						
		}else
		
		{
			log.debug("Verified that 'Bulk Upload Variable via CSV' button displayed under Variable tab");
			log.debug("Verified that 'Bulk Upload Variable via CSV' button enabled under Variable tab");	
		
		}
		
		/*Assert.assertTrue(driver.findElement(bulkUploadButton).isDisplayed());
		log.debug("Verified that 'Bulk Upload Variable via CSV' button displayed under Variable tab");	
		Assert.assertTrue(driver.findElement(bulkUploadButton).isEnabled());
		log.debug("Verified that 'Bulk Upload Variable via CSV' button enabled under Variable tab");		*/
		
       if (driver.findElements(createVariableByButton).isEmpty()) {
			
			log.debug("Verified that 'Add Variable' button is not displaying under Variable tab");
			log.debug("Verified that 'Add Variable' button is enabled under Variable tab");
			
						
		}else
		
		{
			log.debug("Verified that 'Add Variable' button displayed under Variable tab");
			log.debug("Verified that 'Add Variable' button enabled under Variable tab");	
		
		}
		
		
/*		Assert.assertTrue(driver.findElement(createVariableByButton).isDisplayed());
		log.debug("Verified that 'Add Variable' button displayed under Variable tab");	
		Assert.assertTrue(driver.findElement(createVariableByButton).isEnabled());
		log.debug("Verified that 'Add Variable' button enabled under Variable tab");*/	
		
		Assert.assertTrue(driver.findElement(pleaseSelectlabel).isDisplayed());
		log.debug("Verified that 'Please select a variable, or the following:' label appeared on under Variable tab");	
		Assert.assertTrue(driver.findElement(pleaseSelectlabel).isEnabled());
		log.debug("Verified that 'Please select a variable, or the following:' label enabled on under Variable tab");	
		Assert.assertEquals(driver.findElement(pleaseSelectlabel).getText(), "Please select a variable, or the following:");
		log.debug("Verified that 'Please select a variable, or the following:' text appearedd on left side of under Variable tab");
		
        if (driver.findElements(createaNewVariableLink).isEmpty()) {
			
        	log.debug("Verified that 'Create a new variable' link is not appearing under Variable tab");
			log.debug("Verified that 'Create a new variable' link is not enabled under Variable tab");		
			
						
		}else
		
		{
			log.debug("Verified that 'Create a new variable' link appeared on under Variable tab");
			log.debug("Verified that 'Create a new variable' link enabled on under Variable tab");		
		
		}
		
		
		/*Assert.assertTrue(driver.findElement(createaNewVariableLink).isDisplayed());
		log.debug("Verified that 'Create a new variable' link appeared on under Variable tab");	
		Assert.assertTrue(driver.findElement(createaNewVariableLink).isEnabled());
		log.debug("Verified that 'Create a new variable' link enabled on under Variable tab");	
		Assert.assertEquals(driver.findElement(createaNewVariableLink).getText(), "Create a new variable");
		log.debug("Verified that 'Create a new variable' text appearedd on left side of under Variable tab");*/
        
       if (driver.findElements(uploadVariableLink).isEmpty()) {
			
    	   log.debug("Verified that 'Upload variables via csv' link is not appearing under Variable tab");
			log.debug("Verified that 'Upload variables via csv' link is not enabled under Variable tab");	
			
						
		}else
		
		{
			log.debug("Verified that 'Upload variables via csv' link appeared on under Variable tab");
			log.debug("Verified that 'Upload variables via csv' link enabled on under Variable tab");	
		
		}
        
		
		/*Assert.assertTrue(driver.findElement(uploadVariableLink).isDisplayed());
		log.debug("Verified that 'Upload variables via csv' link appeared on under Variable tab");	
		Assert.assertTrue(driver.findElement(uploadVariableLink).isEnabled());
		log.debug("Verified that 'Upload variables via csv' link enabled on under Variable tab");	
		Assert.assertEquals(driver.findElement(uploadVariableLink).getText(), "Upload variables via csv");
		log.debug("Verified that 'Upload variables via csv' text appearedd on left side of under Variable tab");*/
					
	}

//=================================================================================================	
	
	public void createVariableByButton() throws InterruptedException {
		
		driver.findElement(variablesTab).click();			
		
		
          if (driver.findElements(createVariableByButton).isEmpty()) {
			
			log.debug("Verified that add Variable plus (+) icon not appeared on top left side under Variable tab");	
			
						
		}else
		
		{
			log.debug("Verified that add Variable plus (+) icon not appeared on top left side under Variable tab");	
		
		Thread.sleep(10000);
			
			driver.findElement(createVariableByButton).click();
		log.debug("Validated the element while click Add Variable using button (+)");
		
				
		Assert.assertTrue(driver.findElement(namelabel).isDisplayed());
		log.debug("Verified that 'Name' label appeared while add variable under Variable tab");	
		Assert.assertTrue(driver.findElement(namelabel).isEnabled());
		log.debug("Verified that 'Name' label enabled while add variable under Variable tab");	
		Assert.assertEquals(driver.findElement(namelabel).getText().contains("Name"), true);	
		log.debug("Verified that 'Name' Text appeared while add variable under Variable tab");
		
		Assert.assertTrue(driver.findElement(namefiled).isDisplayed());
		log.debug("Verified that 'Name' filed appeared while add variable under Variable tab");	
		Assert.assertTrue(driver.findElement(namefiled).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Variable tab");	
		
		Assert.assertTrue(driver.findElement(valuelabel).isDisplayed());
		log.debug("Verified that 'Value' label appeared while add variable under Variable tab");	
		Assert.assertTrue(driver.findElement(valuelabel).isEnabled());
		log.debug("Verified that 'Value' label enabled while add variable under Variable tab");	
		Assert.assertEquals(driver.findElement(valuelabel).getText().contains("Value"), true);	
		log.debug("Verified that 'Value' Text appeared while add variable under Variable tab");
		
		Assert.assertTrue(driver.findElement(valueFiled).isDisplayed());
		log.debug("Verified that 'Value' filed appeared while add variable under Variable tab");	
		Assert.assertTrue(driver.findElement(valueFiled).isEnabled());
		log.debug("Verified that 'Value by name' filed enabled on left side of under Variable tab");	
		
		
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'Save button' displayed while add variable under Variable tab");	
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'Save button' is disbaled while add variable under Variable tab");	
		Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
		log.debug("Verified that 'Save' Text appeared on save button while add variable under Variable tab");
		
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'Delete button' displayed while add variable under Variable tab");	
		Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
		log.debug("Verified that 'Delete button' is disbaled while add variable under Variable tab");	
		Assert.assertEquals(driver.findElement(deleteButton).getText(), "Delete");		
		log.debug("Verified that 'Delete' Text appeared on Delete button while add variable under Variable tab");
		
		}
	}

	//=================================================================================================		
	
public void createVariableByLink() throws InterruptedException {
		
	driver.findElement(variablesTab).click();			
	
	
    if (driver.findElements(createaNewVariableLink).isEmpty()) {
		
		log.debug("Verified that add Variable plus (+) icon not appeared on top left side under Variable tab");	
		
					
	}else
	
	{
		log.debug("Verified that add Variable plus (+) icon not appeared on top left side under Variable tab");	
	
//		Thread.sleep(10000);
		
		driver.findElement(createaNewVariableLink).click();
	log.debug("Validated the element while click Add Variable using Link");
	
			
	Assert.assertTrue(driver.findElement(namelabel).isDisplayed());
	log.debug("Verified that 'Name' label appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(namelabel).isEnabled());
	log.debug("Verified that 'Name' label enabled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(namelabel).getText().contains("Name"), true);	
	log.debug("Verified that 'Name' Text appeared while add variable under Variable tab");
	
	Assert.assertTrue(driver.findElement(namefiled).isDisplayed());
	log.debug("Verified that 'Name' filed appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(namefiled).isEnabled());
	log.debug("Verified that 'Filter by name' filed enabled on left side of under Variable tab");	
	
	Assert.assertTrue(driver.findElement(valuelabel).isDisplayed());
	log.debug("Verified that 'Value' label appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(valuelabel).isEnabled());
	log.debug("Verified that 'Value' label enabled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(valuelabel).getText().contains("Value"), true);	
	log.debug("Verified that 'Value' Text appeared while add variable under Variable tab");
	
	Assert.assertTrue(driver.findElement(valueFiled).isDisplayed());
	log.debug("Verified that 'Value' filed appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(valueFiled).isEnabled());
	log.debug("Verified that 'Value by name' filed enabled on left side of under Variable tab");	
	
	
	Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
	log.debug("Verified that 'Save button' displayed while add variable under Variable tab");	
	Assert.assertFalse(driver.findElement(saveButton).isEnabled());
	log.debug("Verified that 'Save button' is disbaled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
	log.debug("Verified that 'Save' Text appeared on save button while add variable under Variable tab");
	
	Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
	log.debug("Verified that 'Delete button' displayed while add variable under Variable tab");	
	Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
	log.debug("Verified that 'Delete button' is disbaled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(deleteButton).getText(), "Delete");		
	log.debug("Verified that 'Delete' Text appeared on Delete button while add variable under Variable tab");

		}
	}	

//==============================================================================

public void createSUbyLink() throws InterruptedException {
	
	driver.findElement(tagTab).click();
//	driver.findElement(scriptsTab).click();
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
//	driver.findElement(scriptsTab).click();
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
	
	
	
    if (driver.findElements(transformedCSVlabel).isEmpty()) {
		
    	log.debug("Verified that 'Transformed CSV(s)' label is not appearing on left side of under CSV Upload tab");	
    	log.debug("Verified that 'Transformed CSV(s)' label not enabled on left side of under CSV Upload tab");	
		
					
	}else
	
	{
		log.debug("Verified that 'Transformed CSV(s)' label appeared on left side of under CSV Upload tab");	
    	log.debug("Verified that 'Transformed CSV(s)' label enabled on left side of under CSV Upload tab");	
	
	}
    
    
   if (driver.findElements(filterByCSV).isEmpty()) {
		
	   log.debug("Verified that 'Filter by csv file name' filed is not appearing under CSV Upload tab");	
		log.debug("Verified that 'Filter by csv file name' filed is not enabled under CSV Upload tab");
		
					
	}else
	
	{
		log.debug("Verified that 'Filter by csv file name' filed appeared under CSV Upload tab");	
		log.debug("Verified that 'Filter by csv file name' filed enabled under CSV Upload tab");
	
	}
    
	/*Assert.assertTrue(driver.findElement(transformedCSVlabel).isDisplayed());
	log.debug("Verified that 'Transformed CSV(s)' label appeared on left side of under CSV Upload tab");	
	Assert.assertTrue(driver.findElement(transformedCSVlabel).isEnabled());
	log.debug("Verified that 'Transformed CSV(s)' label enabled on left side of under CSV Upload tab");	*/
	
/*	Assert.assertTrue(driver.findElement(filterByCSV).isDisplayed());
	log.debug("Verified that 'Filter by csv file name' filed appeared under CSV Upload tab");	
	Assert.assertTrue(driver.findElement(filterByCSV).isEnabled());
	log.debug("Verified that 'Filter by csv file name' filed enabled under CSV Upload tab");*/		
	
	
}
}