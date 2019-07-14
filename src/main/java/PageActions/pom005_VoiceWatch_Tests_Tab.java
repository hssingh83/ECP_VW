package PageActions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class pom005_VoiceWatch_Tests_Tab {
	private static Logger log =LogManager.getLogger(pom005_VoiceWatch_Tests_Tab.class.getName());

	public WebDriver driver;
	
	By testTab=By.linkText("Tests");
	By alertsTab=By.linkText("Alerts");	
	By dropdownTimeZone=By.xpath("//div[@class='input-group']//select[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty']");
	By testslabel=By.className("panel-heading");	
    By filterBox=By.xpath("//input[@placeholder='Filter by test name']");	
	By testCreateplusbutton=By.xpath("//span[@class='glyphicon glyphicon-plus-sign']");		
	By testlabel=By.xpath("//h4[contains(text(),'Test')]");	
	By pleaseSelectlabel=By.xpath("//span[@id='loading']");	
	By testCreateLink=By.linkText("or create a new test");	
	By saveButton=By.xpath("//div[@class='row']//button[@class='btn btn-primary btn-sm']");	
	By discardButton=By.xpath("//div[@class='row']//button[@class='btn btn-warning btn-sm']");
	By deleteButton=By.xpath("//div[@class='row']//button[@class='btn btn-danger btn-sm']");
	By checkboxEnabled=By.xpath("//input[@class='ng-valid ng-dirty ng-valid-parse ng-not-empty ng-touched']");
	By testNamelabel=By.xpath("//div[contains(text(),'Test Name')]");
	By descriptionlabel=By.xpath("//div[contains(text(),'Description')]");
	By hammerlabel=By.xpath("//div[contains(text(),'Hammer Group')]");
	By hammerGroupDefaultValue=By.xpath("//table[@class='test ng-scope']//select[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty ng-valid-required']");
	By taglabel=By.xpath("//span[contains(text(),'Tags')]");
	By retriesonFailureLabel=By.xpath("//div[contains(text(),'Retries on Failure')]");
	By hammerdropdown=By.className("form-control ng-pristine ng-valid ng-not-empty ng-valid-required ng-touched");
	By modifybutton=By.xpath("//span[contains(text(),'Modify')]");
	By secheduleLabel=By.xpath("//h4[contains(text(),'Schedules')]");	
	By timeZoneLabel=By.xpath("//div[contains(text(),'Time-zone')]");
	By startDateLabel=By.xpath("//div[contains(text(),'Start Date')]");
	By defaultStartDate=By.xpath("//input[@name='sDate']");
	By EndDateLabel=By.xpath("//div[contains(text(),'End Date')]");
	By defaultEndDate=By.xpath("//input[@name='eDate']");	
	By tieToScbscriptionCheckBox=By.xpath("//table[@class='ng-scope']//input[@class='ng-pristine ng-untouched ng-valid ng-not-empty']");
	By enabledlabel=By.xpath("//table[@class='schedule ng-scope']//th[contains(text(),'Enabled')]");	
	By descriptionBoxlabel=By.xpath("//th[contains(text(),'Description')]");	
	By periodlabel=By.xpath("//th[contains(text(),'Period')]");	
	By dayslabel=By.xpath("//th[contains(text(),'Days')]");	
	By startTimelabel=By.xpath("//th[contains(text(),'Start Time')]");	
	By EndTimelabel=By.xpath("//th[contains(text(),'End Time')]");		
	By reduceSechedule=By.xpath("//table[@class='schedule ng-scope']//tr[@class='ng-scope']//td[1]");
	By addSechedule=By.xpath("//table[@class='schedule ng-scope']//span[@class='glyphicon glyphicon-plus-sign plusicon']");
	By addDescription=By.xpath("//tr[@class='ng-scope']//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']");
	By periodValue=By.xpath("//input[@class='ng-pristine ng-untouched ng-valid ng-not-empty ng-valid-min ng-valid-max ng-valid-required ng-valid-maxlength']");
	By minutelabel=By.xpath("//td[contains(text(),'mins')]");	
	By sunButton=By.xpath("//span[contains(text(),'Sun')]");
	By monButton=By.xpath("//span[contains(text(),'Mon')]");
	By tueButton=By.xpath("//span[contains(text(),'Tue')]");
	By wedButton=By.xpath("//span[contains(text(),'Wed')]");
	By thuButton=By.xpath("//span[contains(text(),'Thu')]");
	By friButton=By.xpath("//span[contains(text(),'Fri')]");
	By satButton=By.xpath("//span[contains(text(),'Sat')]");	
	By startTimeValue=By.xpath("//table[@class='schedule ng-scope']//td[6]//input[1]");
	By endTimeValue=By.xpath("//td[7]//input[1]");	
	By scriptlabel=By.xpath("//h4[contains(text(),'Script')]");
	By scriptNamelabel=By.xpath("//div[@class='input-group-addon']");
	By selectaScriptDropdown=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/div[2]/form/section[3]/div/div[1]/div/div/select");
	By inputParameterlabel=By.xpath("//label[contains(text(),'Input Parameters')]");
	By namelabel=By.xpath("//th[contains(text(),'Name')]");
	By valuelabel=By.xpath("//th[contains(text(),'Value')]");
	By maskedlabel=By.xpath("//th[contains(text(),'Masked')]");	
	By notificationslabel=By.xpath("//h4[contains(text(),'Notifications')]");
	By notifiCheckbox=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/div[2]/form/section[4]/div/div[2]/table/tbody/tr[3]/td[3]/select");
	By notifiEnabledlabel=By.xpath("//label[contains(text(),'Notifications Enabled')]");
	By enabledBoxlabel=By.xpath("//table[@class='schedule']//th[contains(text(),'Enabled')]");
	By notifilabel=By.xpath("//th[contains(text(),'Notification')]");
	By patternlabel=By.xpath("//th[contains(text(),'Pattern')]");
	By severitylabel=By.xpath("//th[contains(text(),'Severity')]");
	By notifionrettogoodlabel=By.xpath("//th[contains(text(),'Notify on return to good')]");	
	By reduceNotifiButton=By.xpath("//span[@class='glyphicon glyphicon-minus-sign minusicon']");
	By addNotifiButton=By.xpath("//table[@class='schedule']//span[@class='glyphicon glyphicon-plus-sign plusicon']");
	By notifiDropdown=By.xpath("//td[3]//select[1]");
	By patternDropdown=By.xpath("//td[4]//select[1]");
	By patternValue=By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid ng-scope ng-not-empty ng-valid-min']");
	By serverityDropdown=By.xpath("//td[5]//select[1]");
	By notifionCheckbox=By.xpath("//input[@class='ng-pristine ng-untouched ng-valid ng-empty']");	
	By failThreSoldlabel=By.xpath("//h4[contains(text(),'Failure Thresholds')]");
	By primaryMetlabel=By.xpath("//a[contains(text(),'Primary Metrics')]");
	By addMetLabel=By.xpath("//a[contains(text(),'Additional Metrics')]");
	By failureEnabledlabel=By.xpath("//table[@class='table-bordered metrics ng-scope']//th[contains(text(),'Enabled')]");
	By failMetriclabel=By.xpath("//th[contains(text(),'Metric')]");
	By failCriterilabel=By.xpath("//th[contains(text(),'Criteria')]");
	By failWarrninglabel=By.xpath("//th[contains(text(),'Warning')]");
	By failCrticallabel=By.xpath("//th[contains(text(),'Critical')]");
	By saveButtonTestTab=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/div[2]/form/section[6]/div/span/button[1]");
	By discardButtonTestTab=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/div[2]/form/section[6]/div/span/button[2]");
	By deleteButtonTestTab=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/div[2]/form/section[6]/div/span/button[3]");
	
	
	
	   
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
				
		Assert.assertTrue(driver.findElement(testlabel).isDisplayed());
		log.debug("Verified that 'Test' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(testlabel).getText(), "Test");		
		log.debug("Verified that 'Test' Text validated under Test Tab");	
		
		Assert.assertTrue(driver.findElement(pleaseSelectlabel).isDisplayed());
		log.debug("Verified that 'Please select a test' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(pleaseSelectlabel).getText(), "Please select a test");		
		log.debug("Verified that 'Please select a test ' Text validated under Test Tab");
		
	}
	
	public void createTestbybutton() {
		   
		driver.findElement(testTab).click();
		
          if (driver.findElements(testCreateplusbutton).isEmpty()) {
			
			log.debug("Verified that new test creation plus (+) icon not appeared on top left side under Tests tab");	
			
						
		}else
		
		{
			log.debug("Verified that new test creation plus (+) icon appeared on top left side under Tests tab");	
			
		}
	  
	
		log.debug("Validated the different elements while click Test Creation using button (+)");
		
		
	//	driver.findElement(testCreateplusbutton).click();
		
		driver.findElement(testCreateplusbutton).click();
		
/*		WebElement element = driver.findElement(testCreateplusbutton);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();*/
		
		
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'Save button' displayed under Tests tab");	
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'Save button' is disbaled under Tests tab");	
		Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
		log.debug("Verified that 'Save' Text appeared on save button under Test Tab");	
		
		Assert.assertTrue(driver.findElement(discardButton).isDisplayed());
		log.debug("Verified that 'Discard button' displayed under Tests tab");	
		Assert.assertFalse(driver.findElement(discardButton).isEnabled());
		log.debug("Verified that 'Discard button' is disbaled under Tests tab");	
		Assert.assertEquals(driver.findElement(discardButton).getText(), "Discard");		
		log.debug("Verified that 'Discard' Text appeared on save button under Test Tab");
		
		

		
        if (driver.findElements(deleteButton).isEmpty()) {
			
			log.debug("Verified that 'Delete button' is not displayed under Tests tab");		
			
						
		}else
		
		{
			log.debug("Verified that 'Delete button' displayed under Tests tab");	
			
		}
		
		
		/*Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'Delete button' displayed under Tests tab");	
		Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
		log.debug("Verified that 'Delete button' is disbaled under Tests tab");	
		Assert.assertEquals(driver.findElement(deleteButton).getText(), "Delete");		
		log.debug("Verified that 'Delete' Text appeared on save button under Test Tab");*/
		
		Assert.assertTrue(driver.findElement(testNamelabel).isDisplayed());
		log.debug("Verified that 'Test Name' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(testNamelabel).getText(), "Test Name");		
		log.debug("Verified that 'Test Name' Text validated under Test Tab");
		
		Assert.assertTrue(driver.findElement(descriptionlabel).isDisplayed());
		log.debug("Verified that 'Description' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(descriptionlabel).getText(), "Description");		
		log.debug("Verified that 'Description' Text validated under Test Tab");
		
		Assert.assertTrue(driver.findElement(hammerlabel).isDisplayed());
		log.debug("Verified that 'Hammer Group Name' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(hammerlabel).getText(), "Hammer Group");		
		log.debug("Verified that 'Hammer Group' Text validated under Test Tab");
		
	
		Assert.assertEquals(driver.findElement(hammerGroupDefaultValue).getText(), "us_hammers");
		log.debug("Verified that 'us_hammers' default value as Hammer Group under Test Tab");
		
		

        
        
		 String[] exp = {"(GMT -12:00) Eniwetok, Kwajalein","(GMT -11:00) Midway Island, Samoa","(GMT -10:00) Hawaii","(GMT -9:00) Alaska","(GMT -8:00) Pacific Time (US & Canada)","(GMT -7:00) Mountain Time (US & Canada)","(GMT -7:00) Arizona Time (US & Canada)","(GMT -6:00) Central Time (US & Canada), Mexico City","(GMT -5:00) Eastern Time (US & Canada)","(GMT -5:00) Bogota, Lima","(GMT -4:30) Caracas","(GMT -4:00) Atlantic Time (Canada)","(GMT -4:00) Santiago","(GMT -4:00) Georgetown, La Paz","(GMT -3:30) Newfoundland","(GMT -3:00) Buenos Aires","(GMT -3:00) Sao Paulo", "(GMT -2:00) Mid-Atlantic","(GMT -1:00 hour) Azores, Cape Verde Islands","(GMT) Western Europe Time, London, Lisbon, Casablanca, Greenwich","(GMT +1:00 hour) Brussels, Copenhagen, Madrid, Paris","(GMT +2:00) Kaliningrad, South Africa, Cairo","(GMT +3:00) Baghdad, Riyadh, Moscow, St. Petersburg","(GMT +3:30) Tehran","(GMT +4:00) Abu Dhabi, Muscat, Yerevan, Baku, Tbilisi","(GMT +4:30) Kabul","(GMT +5:00) Ekaterinburg, Islamabad, Karachi, Tashkent","(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo","(GMT +5:45) Kathmandu","(GMT +6:00) Almaty, Dhaka","(GMT +6:30) Yangon, Cocos Islands","(GMT +7:00) Bangkok, Hanoi, Jakarta","(GMT +8:00) Beijing, Perth, Singapore, Hong Kong","(GMT +9:00) Tokyo, Seoul, Osaka, Sapporo, Yakutsk","(GMT +9:30) Adelaide, Darwin","(GMT +10:00) Eastern Australia, Guam, Vladivostok, Magadan","(GMT +11:00) Solomon Islands, New Caledonia","(GMT +12:00) Auckland, Wellington"};
		// System.out.println(exp.length);
		 log.debug("Verified that count of the dropdown values are: "  +exp.length); 
		 
		 WebElement dropdown = driver.findElement(dropdownTimeZone); 
		
	//	 System.out.println(dropdown.getSize());
		 
        Select s = new Select(dropdown); 
        Assert.assertFalse(s.isMultiple());
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
       
        Assert.assertTrue(driver.findElement(secheduleLabel).isDisplayed());
		log.debug("Verified that 'Schedules' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(secheduleLabel).getText(), "Schedules");		
		log.debug("Verified that 'Schedules' Text validated under Test Tab");
        
		 Assert.assertTrue(driver.findElement(timeZoneLabel).isDisplayed());
		log.debug("Verified that 'Start Date' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(timeZoneLabel).getText(), "Time-zone");		
		log.debug("Verified that 'Time-Zone' Text validated under Test Tab");
			
	    Assert.assertTrue(driver.findElement(startDateLabel).isDisplayed());
		log.debug("Verified that 'Start Date' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(startDateLabel).getText(), "Start Date");		
		log.debug("Verified that 'Start Date' Text validated under Test Tab");
	        
        
        
		Assert.assertTrue(driver.findElement(defaultStartDate).isDisplayed());
		log.debug("Verified that 'Start Date' displayed on under Tests tab");			
		Assert.assertTrue(driver.findElement(defaultStartDate).isEnabled());
		log.debug("Verified that 'Start Date' enabled on under Tests tab");	
		
        Assert.assertTrue(driver.findElement(EndDateLabel).isDisplayed());
		log.debug("Verified that 'End Date' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(EndDateLabel).getText(), "End Date");		
		log.debug("Verified that 'End Date' Text validated under Test Tab");
		
		Assert.assertTrue(driver.findElement(defaultEndDate).isDisplayed());
		log.debug("Verified that 'Start Date' displayed on under Tests tab");			
		Assert.assertFalse(driver.findElement(defaultEndDate).isEnabled());
		log.debug("Verified that 'Start Date' enabled on under Tests tab");	
		
		Assert.assertTrue(driver.findElement(tieToScbscriptionCheckBox).isDisplayed());
		log.debug("Verified that 'Tie To Scbscription' CheckBox appeared in Test tab");			
		Assert.assertTrue(driver.findElement(tieToScbscriptionCheckBox).isEnabled());
		log.debug("Verified that 'Tie To Scbscription' CheckBox enabled in Test tab");	
		Assert.assertTrue(driver.findElement(tieToScbscriptionCheckBox).isSelected());
		log.debug("Verified that 'Tie To Scbscription' CheckBox selected in Test tab");	
		
		Assert.assertTrue(driver.findElement(enabledlabel).isDisplayed());
		log.debug("Verified that 'Enabled' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(enabledlabel).getText(), "Enabled");		
		log.debug("Verified that 'Enabled' Text validated under Test Tab");
		
		 Assert.assertTrue(driver.findElement(descriptionBoxlabel).isDisplayed());
		log.debug("Verified that 'Description' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(descriptionBoxlabel).getText(), "Description");		
		log.debug("Verified that 'Description' Text validated under Test Tab");
			
		Assert.assertTrue(driver.findElement(periodlabel).isDisplayed());
		log.debug("Verified that 'Period' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(periodlabel).getText(), "Period");		
		log.debug("Verified that 'Period' Text validated under Test Tab");
		
		Assert.assertTrue(driver.findElement(dayslabel).isDisplayed());
		log.debug("Verified that 'Day' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(dayslabel).getText(), "Days");		
		log.debug("Verified that 'Days' Text validated under Test Tab");
					
		Assert.assertTrue(driver.findElement(startTimelabel).isDisplayed());
		log.debug("Verified that 'Start Time' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(startTimelabel).getText(), "Start Time");		
		log.debug("Verified that 'Start Time' Text validated under Test Tab");
		
		Assert.assertTrue(driver.findElement(EndTimelabel).isDisplayed());
		log.debug("Verified that 'End Time' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(EndTimelabel).getText(), "End Time");		
		log.debug("Verified that 'End Time' Text validated under Test Tab");		
		
		
		
		Assert.assertTrue(driver.findElement(reduceSechedule).isDisplayed());
		log.debug("Verified that '(-)' button appeared to remove configured sechedule");			
		Assert.assertTrue(driver.findElement(reduceSechedule).isEnabled());
		log.debug("Verified that '(-)' button enabled under sechedule section");	
		
		Assert.assertTrue(driver.findElement(addSechedule).isDisplayed());
		log.debug("Verified that '(+)' button appeared to add new configured sechedule");			
		Assert.assertTrue(driver.findElement(addSechedule).isEnabled());
		log.debug("Verified that '(+)' button enabled under sechedule section");	
		
		 Assert.assertTrue(driver.findElement(addDescription).isDisplayed());
		log.debug("Verified that 'Description' field appered under Sechedule section in test tab");		
		Assert.assertTrue(driver.findElement(addDescription).isEnabled());		
		log.debug("Verified that 'Description' field is enabled under Sechedule section in test tab");
	        
		 Assert.assertTrue(driver.findElement(periodValue).isDisplayed());
		log.debug("Verified that 'period' field appeared under Sechedule section in test tab");		
		Assert.assertTrue(driver.findElement(periodValue).isEnabled());		
		log.debug("Verified that 'period' value field is enabled under Sechedule section in test tab");	
		
		 Assert.assertTrue(driver.findElement(minutelabel).isDisplayed());
		log.debug("Verified that 'Minute' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(minutelabel).getText(), "mins");		
		log.debug("Verified that 'Mins' Text validated under Test Tab");
		
		 Assert.assertTrue(driver.findElement(sunButton).isDisplayed());
		log.debug("Verified that 'Sunday' button appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(sunButton).getText(), "Sun");		
		log.debug("Verified that 'sun' Text appeared on the button under Test Tab");
		Assert.assertTrue(driver.findElement(sunButton).isEnabled());
		log.debug("Verified that 'Sun' button enabled under sechedule section");
		
		Assert.assertTrue(driver.findElement(monButton).isDisplayed());
		log.debug("Verified that 'Monday' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(monButton).getText(), "Mon");		
		log.debug("Verified that 'mon' Text appeared on the button under Test Tab");
		Assert.assertTrue(driver.findElement(monButton).isEnabled());
		log.debug("Verified that 'Mon' button enabled under sechedule section");
		
		Assert.assertTrue(driver.findElement(tueButton).isDisplayed());
		log.debug("Verified that 'Tuesday' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(tueButton).getText(), "Tue");		
		log.debug("Verified that 'Tue' Text appeared on the button under Test Tab");
		Assert.assertTrue(driver.findElement(tueButton).isEnabled());
		log.debug("Verified that 'Tue' button enabled under sechedule section");
					
		Assert.assertTrue(driver.findElement(wedButton).isDisplayed());
		log.debug("Verified that 'Wednessday' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(wedButton).getText(), "Wed");		
		log.debug("Verified that 'Wed' Text validated under Test Tab");
		Assert.assertTrue(driver.findElement(wedButton).isEnabled());
		log.debug("Verified that 'Wed' button enabled under sechedule section");
		
						
		Assert.assertTrue(driver.findElement(thuButton).isDisplayed());
		log.debug("Verified that 'Thrusday' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(thuButton).getText(), "Thu");		
		log.debug("Verified that 'Thu' Text validated under Test Tab");
		Assert.assertTrue(driver.findElement(thuButton).isEnabled());
		log.debug("Verified that 'Thu' button enabled under sechedule section");
		
		Assert.assertTrue(driver.findElement(friButton).isDisplayed());
		log.debug("Verified that 'Friday' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(friButton).getText(), "Fri");		
		log.debug("Verified that 'Fri' Text validated under Test Tab");
		Assert.assertTrue(driver.findElement(friButton).isEnabled());
		log.debug("Verified that 'Fri' button enabled under sechedule section");
		
		
		Assert.assertTrue(driver.findElement(satButton).isDisplayed());
		log.debug("Verified that 'Satarday' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(satButton).getText(), "Sat");		
		log.debug("Verified that 'Sat' Text validated under Test Tab");
		Assert.assertTrue(driver.findElement(satButton).isEnabled());
		log.debug("Verified that 'Sat' button enabled under sechedule section");
		
		Assert.assertTrue(driver.findElement(startTimeValue).isDisplayed());
		log.debug("Verified that 'Start Time' filled appeared under Sechedule section in test tab");		
		Assert.assertTrue(driver.findElement(startTimeValue).isEnabled());
		log.debug("Verified that 'Start Time' filled enabled under sechedule section");
		
		Assert.assertTrue(driver.findElement(endTimeValue).isDisplayed());
		log.debug("Verified that 'End Time Value' filled appeared under Sechedule section in test tab");		
		Assert.assertTrue(driver.findElement(endTimeValue).isEnabled());
		log.debug("Verified that 'End Time Value filled enabled under sechedule section");
		
		//-------------------------------------------------------------------------------------------------------------------
		
		Assert.assertTrue(driver.findElement(scriptlabel).isDisplayed());
		log.debug("Verified that 'Script' label appeared under test tab");		
		Assert.assertEquals(driver.findElement(scriptlabel).getText(), "Script");		
		log.debug("Verified that 'Script' Text validated under Test Tab");
		
		Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
		log.debug("Verified that 'Script name' label appeared under script section in test tab");		
		Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
		log.debug("Verified that 'Script Name' Text validated under Test Tab");
		
	// Script Drop Down	
	
			 log.debug("Verified that script dropdown"); 			 
			 WebElement scriptdropdown = driver.findElement(selectaScriptDropdown); 			
		//	 System.out.println(dropdown.getSize());			 
	        Select scripts1 = new Select(scriptdropdown); 	        
	        Assert.assertFalse(scripts1.isMultiple());	        
	       java.util.List<WebElement> options1 = scripts1.getOptions();    
	      log.debug("Verified that following values available in the dropdown"); 
	          for(WebElement item1:options1) 
	        { 
	        	for (int i = 0; i <options1.size(); i++) {          		
	        		log.debug(""+item1.getText());      			   			
	     
	                   	}
	        		}
	
		
        Assert.assertTrue(driver.findElement(inputParameterlabel).isDisplayed());
  		log.debug("Verified that 'Input Parameters' label appeared under script section in test tab");		
  		Assert.assertEquals(driver.findElement(inputParameterlabel).getText(), "Input Parameters");		
  		log.debug("Verified that 'Input Parameters' Text validated under Test Tab");
		
        Assert.assertTrue(driver.findElement(namelabel).isDisplayed());
  		log.debug("Verified that 'Name' label appeared under script section in test tab");		
  		Assert.assertEquals(driver.findElement(namelabel).getText(), "Name");		
  		log.debug("Verified that 'Name' Text validated under Test Tab");
  		
        Assert.assertTrue(driver.findElement(valuelabel).isDisplayed());
  		log.debug("Verified that 'Value' label appeared under script section in test tab");		
  		Assert.assertEquals(driver.findElement(valuelabel).getText(), "Value");		
  		log.debug("Verified that 'Value' Text validated under Test Tab");
  		
        Assert.assertTrue(driver.findElement(maskedlabel).isDisplayed());
  		log.debug("Verified that 'Masked' label appeared under script section in test tab");		
  		Assert.assertEquals(driver.findElement(maskedlabel).getText(), "Masked");		
  		log.debug("Verified that 'Masked' Text validated under Test Tab");
  		
  		
  		Assert.assertTrue(driver.findElement(notificationslabel).isDisplayed());
  		log.debug("Verified that 'Notifications' label appeared under script section in test tab");		
  		Assert.assertEquals(driver.findElement(notificationslabel).getText(), "Notifications");		
  		log.debug("Verified that 'Notifications' Text validated under Test Tab");
  		
  		Assert.assertTrue(driver.findElement(enabledBoxlabel).isDisplayed());
  		log.debug("Verified that 'Enabled' label appeared under Notification checkbox in test tab");		
  		Assert.assertEquals(driver.findElement(enabledBoxlabel).getText(), "Enabled");		
  		log.debug("Verified that 'Enabled' Text validated under Notification checkbox in test tab");			
  	
       
   	Assert.assertTrue(driver.findElement(notifiCheckbox).isDisplayed());
	log.debug("Verified that 'Notifi Enabled Checkbox' appeared under Notification in test tab");		 
	Assert.assertTrue(driver.findElement(notifiCheckbox).isEnabled());
	log.debug("Verified that 'Notification Enabled' checkbox appeared notification in Test tab");			
	
	
	Assert.assertTrue(driver.findElement(enabledBoxlabel).isDisplayed());
	log.debug("Verified that 'Enabled' label appeared under Notification checkbox in test tab");		
	Assert.assertEquals(driver.findElement(enabledBoxlabel).getText(), "Enabled");		
	log.debug("Verified that 'Enabled' Text validated under Notification checkbox in test tab");	
	
	Assert.assertTrue(driver.findElement(notifiEnabledlabel).isDisplayed());
	log.debug("Verified that 'Notification' label appeared in notification dropdown in test tab");		
	Assert.assertEquals(driver.findElement(notifiEnabledlabel).getText(), "Notifications Enabled");		
	log.debug("Verified that 'Notifications Enabled' Text validated in notification dropdown in test tab");	
	
	Assert.assertTrue(driver.findElement(patternlabel).isDisplayed());
	log.debug("Verified that 'Pattern' label appeared under Notification in test tab");		
	Assert.assertEquals(driver.findElement(patternlabel).getText(), "Pattern");		
	log.debug("Verified that 'Pattern' Text validated under Test Tab");	
	
	Assert.assertTrue(driver.findElement(severitylabel).isDisplayed());
	log.debug("Verified that 'Severity' label appeared under Notification in test tab");	
	Assert.assertEquals(driver.findElement(severitylabel).getText(), "Severity");		
	log.debug("Verified that 'Severity' Text validated under Test Tab");	
	
	Assert.assertTrue(driver.findElement(notifionrettogoodlabel).isDisplayed());
	log.debug("Verified that 'Notify on return to good' label appeared under Notification in test tab");		
	Assert.assertEquals(driver.findElement(notifionrettogoodlabel).getText(), "Notify on return to good");		
	log.debug("Verified that 'Notify on return to good' Text validated under Test Tab");	
	
	Assert.assertTrue(driver.findElement(reduceNotifiButton).isDisplayed());
	log.debug("Verified that '(-) reduce notification button appeared under notification in Test tab");			
	Assert.assertTrue(driver.findElement(reduceNotifiButton).isEnabled());
	log.debug("Verified that '(-) reduce notification button enabled under notification in Test tab");			
	  		
  		
	Assert.assertTrue(driver.findElement(addNotifiButton).isDisplayed());
	log.debug("Verified that '(+) add notification button appeared under notification in Test tab");			
	Assert.assertTrue(driver.findElement(addNotifiButton).isEnabled());
	log.debug("Verified that '(+) add notification button enabled under notification in Test tab");			
	
	
  	Assert.assertTrue(driver.findElement(notifiCheckbox).isDisplayed());
	log.debug("Verified that 'Notifi Enabled Checkbox' appeared under Notification in test tab");		 
	Assert.assertTrue(driver.findElement(notifiCheckbox).isEnabled());
	log.debug("Verified that 'Notification Enabled' checkbox appeared notification in Test tab");			
	
	// Notification Drop Down	
		
			 log.debug("Verified that Notification dropdown"); 		 
			 WebElement notifidropdown = driver.findElement(notifiDropdown);		
		//	 System.out.println(dropdown.getSize());		 
	       Select notifi1 = new Select(notifidropdown);        
	       Assert.assertFalse(notifi1.isMultiple());       
	      java.util.List<WebElement> options2 = notifi1.getOptions();   
	     
	      log.debug("Verified that following values available in the dropdown");      
	       for(WebElement item2:options2) 
	       { 
	       	for (int i = 0; i <options2.size(); i++) {        		
	       					        						    
	       			log.debug(""+item2.getText());      			   			
	    
	                  	}
	       		}

	    // Pattern Drop Down	
			
			 log.debug("Verified that Notification dropdown"); 		 
			 WebElement Patterndropdown = driver.findElement(patternDropdown);		
		//	 System.out.println(dropdown.getSize());		 
	       Select pattern1 = new Select(Patterndropdown);        
	       Assert.assertFalse(pattern1.isMultiple());       
	      java.util.List<WebElement> options3 = pattern1.getOptions();   
	     
	      log.debug("Verified that following values available in the dropdown");      
	       for(WebElement item3:options3) 
	       { 
	       	for (int i = 0; i <options3.size(); i++) {        		
	       					        						    
	       			log.debug(""+item3.getText());      			   			
	    
	                  	}
	       		}
		
	     Assert.assertTrue(driver.findElement(patternValue).isDisplayed());
	   	log.debug("Verified that 'Pattern' filled appeared under Notification in test tab");		 
	   	Assert.assertTrue(driver.findElement(patternValue).isEnabled());
	   	log.debug("Verified that 'Pattern' filled enabled under Notification in test tab");
	       
	 // Severty Drop Down	
		
		 log.debug("Verified that Severity dropdown"); 		 
		 WebElement severitydropdown = driver.findElement(serverityDropdown);		
	//	 System.out.println(dropdown.getSize());		 
      Select severity1 = new Select(severitydropdown);        
      Assert.assertFalse(severity1.isMultiple());       
     java.util.List<WebElement> options4 = severity1.getOptions();   
    
     log.debug("Verified that following values available in the dropdown");      
      for(WebElement item4:options4) 
      { 
      	for (int i = 0; i <options4.size(); i++) {        		
      					        						    
      			log.debug(""+item4.getText());      			   			
   
                 	}
      		} 
	
     Assert.assertTrue(driver.findElement(notifionCheckbox).isDisplayed());
  	log.debug("Verified that 'Notify on return to good' Checkbox appeared under Notification in test tab");		 
  	Assert.assertTrue(driver.findElement(notifionCheckbox).isEnabled());
  	log.debug("Verified that 'Notify on return to good' checkbox enabled under notification in Test tab");			
  	   
	
    Assert.assertTrue(driver.findElement(failThreSoldlabel).isDisplayed());
	log.debug("Verified that 'Failure Thresholds' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(failThreSoldlabel).getText(), "Failure Thresholds");		
	log.debug("Verified that 'Failure Thresholds' Text validated under Test Tab");
	
	Assert.assertTrue(driver.findElement(primaryMetlabel).isDisplayed());
	log.debug("Verified that 'Primary Metrics' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(primaryMetlabel).getText(), "Primary Metrics");		
	log.debug("Verified that 'Primary Metrics' Text validated under Test Tab");
  	
	Assert.assertTrue(driver.findElement(addMetLabel).isDisplayed());
	log.debug("Verified that 'Additional Metrics' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(addMetLabel).getText(), "Additional Metrics");		
	log.debug("Verified that 'Additional Metrics' Text validated under Test Tab");
	
	Assert.assertTrue(driver.findElement(failureEnabledlabel).isDisplayed());
	log.debug("Verified that 'Enabled' label appeared under Failure Thresholds in Tests tab");		
	Assert.assertEquals(driver.findElement(failureEnabledlabel).getText(), "Enabled");		
	log.debug("Verified that 'Enabled' text validated in Tests tab");		
	       
	Assert.assertTrue(driver.findElement(failMetriclabel).isDisplayed());
	log.debug("Verified that 'Metric' label appeared under Failure Thresholds in Tests tab");		
	Assert.assertEquals(driver.findElement(failMetriclabel).getText(), "Metric");		
	log.debug("Verified that 'Metric' text validated in Tests tab");	
	
	Assert.assertTrue(driver.findElement(failCriterilabel).isDisplayed());
	log.debug("Verified that 'Criteria' label appeared under Failure Thresholds in Tests tab");		
	Assert.assertEquals(driver.findElement(failCriterilabel).getText(), "Criteria");		
	log.debug("Verified that 'Criteria' text validated in Tests tab");
	
	Assert.assertTrue(driver.findElement(failWarrninglabel).isDisplayed());
	log.debug("Verified that 'Warning' label appeared under Failure Thresholds in Tests tab");		
	Assert.assertEquals(driver.findElement(failWarrninglabel).getText(), "Warning");		
	log.debug("Verified that 'Warning' text validated in Tests tab");
	
	Assert.assertTrue(driver.findElement(failCrticallabel).isDisplayed());
	log.debug("Verified that 'Critical' label appeared under Failure Thresholds in Tests tab");		
	Assert.assertEquals(driver.findElement(failCrticallabel).getText(), "Critical");		
	log.debug("Verified that 'Critical' text validated in Tests tab");
	
	Assert.assertTrue(driver.findElement(saveButtonTestTab).isDisplayed());
	log.debug("Verified that 'Save' button displayed under Tests tab");	
	Assert.assertFalse(driver.findElement(saveButtonTestTab).isEnabled());
	log.debug("Verified that 'Save' button' is enabled under Tests tab");	
	Assert.assertEquals(driver.findElement(saveButtonTestTab).getText(), "Save");		
	log.debug("Verified that 'Save' Text appeared on save button under Test Tab");
	
	Assert.assertTrue(driver.findElement(discardButtonTestTab).isDisplayed());
	log.debug("Verified that 'Discard' button displayed under Tests tab");	
	Assert.assertFalse(driver.findElement(discardButtonTestTab).isEnabled());
	log.debug("Verified that 'Discard' button' is enabled under Tests tab");	
	Assert.assertEquals(driver.findElement(discardButtonTestTab).getText(), "Discard");		
	log.debug("Verified that 'Discard' Text appeared on save button under Test Tab");
	
	
	if (driver.findElements(deleteButtonTestTab).isEmpty()) {
		
		log.debug("Verified that 'Delete button' is not displayed under Tests tab");		
		
					
	}else
	
	{
		log.debug("Verified that 'Delete button' displayed under Tests tab");	
		
	}

}
	

			
       
        
        
	//================================================================================			
	
																													
public void createTestbyLink() {
	
	
	   log.debug("Navigate to Alerts Tab");
	   driver.findElement(alertsTab);
	   driver.findElement(testTab).click();
	   log.debug("Again Navigate Back to Test Tab");
	   
	
	
	if (driver.findElements(testCreateLink).isEmpty()) {
		
		log.debug("Verified that new test created link is not appearing under Tests tab");		
		
					
	}else
	
	{
		
		log.debug("Verified that new test created link appeared under Tests tab");	
		
	}  
	   	   
	    log.debug("Validated the element pleaset while click Test Creation using button (+)");
		driver.findElement(testCreateplusbutton).click();
		
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'Save button' displayed under Tests tab");	
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'Save button' is disbaled under Tests tab");	
		Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
		log.debug("Verified that 'Save' Text appeared on save button under Test Tab");	
		
		Assert.assertTrue(driver.findElement(discardButton).isDisplayed());
		log.debug("Verified that 'Discard button' displayed under Tests tab");	
		Assert.assertFalse(driver.findElement(discardButton).isEnabled());
		log.debug("Verified that 'Discard button' is disbaled under Tests tab");	
		Assert.assertEquals(driver.findElement(discardButton).getText(), "Discard");		
		log.debug("Verified that 'Discard' Text appeared on save button under Test Tab");
		
				
		  if (driver.findElements(deleteButton).isEmpty()) {
				
				log.debug("Verified that 'Delete button' is not displayed under Tests tab");		
				
							
			}else
			
			{
				log.debug("Verified that 'Delete button' displayed under Tests tab");	
				
			}
		
		Assert.assertTrue(driver.findElement(testNamelabel).isDisplayed());
		log.debug("Verified that 'Test Name' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(testNamelabel).getText(), "Test Name");		
		log.debug("Verified that 'Test Name' Text validated under Test Tab");
		
		Assert.assertTrue(driver.findElement(descriptionlabel).isDisplayed());
		log.debug("Verified that 'Description' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(descriptionlabel).getText(), "Description");		
		log.debug("Verified that 'Description' Text validated under Test Tab");
		
		Assert.assertTrue(driver.findElement(hammerlabel).isDisplayed());
		log.debug("Verified that 'Hammer Group Name' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(hammerlabel).getText(), "Hammer Group");		
		log.debug("Verified that 'Hammer Group' Text validated under Test Tab");
		
		Assert.assertEquals(driver.findElement(hammerGroupDefaultValue).getText(), "us_hammers");
		log.debug("Verified that 'us_hammers' default value as Hammer Group under Test Tab");
		
		 int count = 0;
		 String[] exp = {"(GMT -12:00) Eniwetok, Kwajalein","(GMT -11:00) Midway Island, Samoa","(GMT -10:00) Hawaii","(GMT -9:00) Alaska","(GMT -8:00) Pacific Time (US & Canada)","(GMT -7:00) Mountain Time (US & Canada)","(GMT -7:00) Arizona Time (US & Canada)","(GMT -6:00) Central Time (US & Canada), Mexico City","(GMT -5:00) Eastern Time (US & Canada)","(GMT -5:00) Bogota, Lima","(GMT -4:30) Caracas","(GMT -4:00) Atlantic Time (Canada)","(GMT -4:00) Santiago","(GMT -4:00) Georgetown, La Paz","(GMT -3:30) Newfoundland","(GMT -3:00) Buenos Aires","(GMT -3:00) Sao Paulo", "(GMT -2:00) Mid-Atlantic","(GMT -1:00 hour) Azores, Cape Verde Islands","(GMT) Western Europe Time, London, Lisbon, Casablanca, Greenwich","(GMT +1:00 hour) Brussels, Copenhagen, Madrid, Paris","(GMT +2:00) Kaliningrad, South Africa, Cairo","(GMT +3:00) Baghdad, Riyadh, Moscow, St. Petersburg","(GMT +3:30) Tehran","(GMT +4:00) Abu Dhabi, Muscat, Yerevan, Baku, Tbilisi","(GMT +4:30) Kabul","(GMT +5:00) Ekaterinburg, Islamabad, Karachi, Tashkent","(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo","(GMT +5:45) Kathmandu","(GMT +6:00) Almaty, Dhaka","(GMT +6:30) Yangon, Cocos Islands","(GMT +7:00) Bangkok, Hanoi, Jakarta","(GMT +8:00) Beijing, Perth, Singapore, Hong Kong","(GMT +9:00) Tokyo, Seoul, Osaka, Sapporo, Yakutsk","(GMT +9:30) Adelaide, Darwin","(GMT +10:00) Eastern Australia, Guam, Vladivostok, Magadan","(GMT +11:00) Solomon Islands, New Caledonia","(GMT +12:00) Auckland, Wellington"};
		// System.out.println(exp.length);
		 log.debug("Verified that count of the dropdown values are: "  +exp.length); 
		 
		 WebElement dropdown = driver.findElement(By.xpath("//div[@class='input-group']//select[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty']")); 
		
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
        Assert.assertTrue(driver.findElement(secheduleLabel).isDisplayed());
      		log.debug("Verified that 'Schedules' label appeared on under Tests tab");		
      		Assert.assertEquals(driver.findElement(secheduleLabel).getText(), "Schedules");		
      		log.debug("Verified that 'Schedules' Text validated under Test Tab");
              
      		 Assert.assertTrue(driver.findElement(timeZoneLabel).isDisplayed());
      		log.debug("Verified that 'Start Date' label appeared on under Tests tab");		
      		Assert.assertEquals(driver.findElement(timeZoneLabel).getText(), "Time-zone");		
      		log.debug("Verified that 'Time-Zone' Text validated under Test Tab");
      			
      	    Assert.assertTrue(driver.findElement(startDateLabel).isDisplayed());
      		log.debug("Verified that 'Start Date' label appeared on under Tests tab");		
      		Assert.assertEquals(driver.findElement(startDateLabel).getText(), "Start Date");		
      		log.debug("Verified that 'Start Date' Text validated under Test Tab");
      	        
              
              
      		Assert.assertTrue(driver.findElement(defaultStartDate).isDisplayed());
      		log.debug("Verified that 'Start Date' displayed on under Tests tab");			
      		Assert.assertTrue(driver.findElement(defaultStartDate).isEnabled());
      		log.debug("Verified that 'Start Date' enabled on under Tests tab");	
      		
              Assert.assertTrue(driver.findElement(EndDateLabel).isDisplayed());
      		log.debug("Verified that 'End Date' label appeared on under Tests tab");		
      		Assert.assertEquals(driver.findElement(EndDateLabel).getText(), "End Date");		
      		log.debug("Verified that 'End Date' Text validated under Test Tab");
      		
      		Assert.assertTrue(driver.findElement(defaultEndDate).isDisplayed());
      		log.debug("Verified that 'Start Date' displayed on under Tests tab");			
      		Assert.assertFalse(driver.findElement(defaultEndDate).isEnabled());
      		log.debug("Verified that 'Start Date' enabled on under Tests tab");	
      		
      		Assert.assertTrue(driver.findElement(tieToScbscriptionCheckBox).isDisplayed());
      		log.debug("Verified that 'Tie To Scbscription' CheckBox appeared in Test tab");			
      		Assert.assertTrue(driver.findElement(tieToScbscriptionCheckBox).isEnabled());
      		log.debug("Verified that 'Tie To Scbscription' CheckBox enabled in Test tab");	
      		Assert.assertTrue(driver.findElement(tieToScbscriptionCheckBox).isSelected());
      		log.debug("Verified that 'Tie To Scbscription' CheckBox selected in Test tab");	
      		
      		Assert.assertTrue(driver.findElement(enabledlabel).isDisplayed());
      		log.debug("Verified that 'Enabled' label appeared under Sechedule section in test tab");		
      		Assert.assertEquals(driver.findElement(enabledlabel).getText(), "Enabled");		
      		log.debug("Verified that 'Enabled' Text validated under Test Tab");
      		
      		 Assert.assertTrue(driver.findElement(descriptionBoxlabel).isDisplayed());
      		log.debug("Verified that 'Description' label appeared under Sechedule section in test tab");		
      		Assert.assertEquals(driver.findElement(descriptionBoxlabel).getText(), "Description");		
      		log.debug("Verified that 'Description' Text validated under Test Tab");
      			
      		Assert.assertTrue(driver.findElement(periodlabel).isDisplayed());
      		log.debug("Verified that 'Period' label appeared under Sechedule section in test tab");		
      		Assert.assertEquals(driver.findElement(periodlabel).getText(), "Period");		
      		log.debug("Verified that 'Period' Text validated under Test Tab");
      		
      		Assert.assertTrue(driver.findElement(dayslabel).isDisplayed());
      		log.debug("Verified that 'Day' label appeared under Sechedule section in test tab");		
      		Assert.assertEquals(driver.findElement(dayslabel).getText(), "Days");		
      		log.debug("Verified that 'Days' Text validated under Test Tab");
      					
      		Assert.assertTrue(driver.findElement(startTimelabel).isDisplayed());
      		log.debug("Verified that 'Start Time' label appeared under Sechedule section in test tab");		
      		Assert.assertEquals(driver.findElement(startTimelabel).getText(), "Start Time");		
      		log.debug("Verified that 'Start Time' Text validated under Test Tab");
      		
      		Assert.assertTrue(driver.findElement(EndTimelabel).isDisplayed());
      		log.debug("Verified that 'End Time' label appeared under Sechedule section in test tab");		
      		Assert.assertEquals(driver.findElement(EndTimelabel).getText(), "End Time");		
      		log.debug("Verified that 'End Time' Text validated under Test Tab");		
      		
      		
      		
      		Assert.assertTrue(driver.findElement(reduceSechedule).isDisplayed());
      		log.debug("Verified that '(-)' button appeared to remove configured sechedule");			
      		Assert.assertTrue(driver.findElement(reduceSechedule).isEnabled());
      		log.debug("Verified that '(-)' button enabled under sechedule section");	
      		
      		Assert.assertTrue(driver.findElement(addSechedule).isDisplayed());
      		log.debug("Verified that '(+)' button appeared to add new configured sechedule");			
      		Assert.assertTrue(driver.findElement(addSechedule).isEnabled());
      		log.debug("Verified that '(+)' button enabled under sechedule section");	
      		
      		 Assert.assertTrue(driver.findElement(addDescription).isDisplayed());
      		log.debug("Verified that 'Description' field appered under Sechedule section in test tab");		
      		Assert.assertTrue(driver.findElement(addDescription).isEnabled());		
      		log.debug("Verified that 'Description' field is enabled under Sechedule section in test tab");
      	        
      		 Assert.assertTrue(driver.findElement(periodValue).isDisplayed());
      		log.debug("Verified that 'period' field appeared under Sechedule section in test tab");		
      		Assert.assertTrue(driver.findElement(periodValue).isEnabled());		
      		log.debug("Verified that 'period' value field is enabled under Sechedule section in test tab");	
      		
      		 Assert.assertTrue(driver.findElement(minutelabel).isDisplayed());
      		log.debug("Verified that 'Minute' label appeared under Sechedule section in test tab");		
      		Assert.assertEquals(driver.findElement(minutelabel).getText(), "mins");		
      		log.debug("Verified that 'Mins' Text validated under Test Tab");
      		
      		 Assert.assertTrue(driver.findElement(sunButton).isDisplayed());
      		log.debug("Verified that 'Sunday' button appeared under Sechedule section in test tab");		
      		Assert.assertEquals(driver.findElement(sunButton).getText(), "Sun");		
      		log.debug("Verified that 'sun' Text appeared on the button under Test Tab");
      		Assert.assertTrue(driver.findElement(sunButton).isEnabled());
      		log.debug("Verified that 'Sun' button enabled under sechedule section");
      		
      		Assert.assertTrue(driver.findElement(monButton).isDisplayed());
      		log.debug("Verified that 'Monday' label appeared under Sechedule section in test tab");		
      		Assert.assertEquals(driver.findElement(monButton).getText(), "Mon");		
      		log.debug("Verified that 'mon' Text appeared on the button under Test Tab");
      		Assert.assertTrue(driver.findElement(monButton).isEnabled());
      		log.debug("Verified that 'Mon' button enabled under sechedule section");
      		
      		Assert.assertTrue(driver.findElement(tueButton).isDisplayed());
      		log.debug("Verified that 'Tuesday' label appeared under Sechedule section in test tab");		
      		Assert.assertEquals(driver.findElement(tueButton).getText(), "Tue");		
      		log.debug("Verified that 'Tue' Text appeared on the button under Test Tab");
      		Assert.assertTrue(driver.findElement(tueButton).isEnabled());
      		log.debug("Verified that 'Tue' button enabled under sechedule section");
      					
      		Assert.assertTrue(driver.findElement(wedButton).isDisplayed());
      		log.debug("Verified that 'Wednessday' label appeared under Sechedule section in test tab");		
      		Assert.assertEquals(driver.findElement(wedButton).getText(), "Wed");		
      		log.debug("Verified that 'Wed' Text validated under Test Tab");
      		Assert.assertTrue(driver.findElement(wedButton).isEnabled());
      		log.debug("Verified that 'Wed' button enabled under sechedule section");
      		
      						
      		Assert.assertTrue(driver.findElement(thuButton).isDisplayed());
      		log.debug("Verified that 'Thrusday' label appeared under Sechedule section in test tab");		
      		Assert.assertEquals(driver.findElement(thuButton).getText(), "Thu");		
      		log.debug("Verified that 'Thu' Text validated under Test Tab");
      		Assert.assertTrue(driver.findElement(thuButton).isEnabled());
      		log.debug("Verified that 'Thu' button enabled under sechedule section");
      		
      		Assert.assertTrue(driver.findElement(friButton).isDisplayed());
      		log.debug("Verified that 'Friday' label appeared under Sechedule section in test tab");		
      		Assert.assertEquals(driver.findElement(friButton).getText(), "Fri");		
      		log.debug("Verified that 'Fri' Text validated under Test Tab");
      		Assert.assertTrue(driver.findElement(friButton).isEnabled());
      		log.debug("Verified that 'Fri' button enabled under sechedule section");
      		
      		
      		Assert.assertTrue(driver.findElement(satButton).isDisplayed());
      		log.debug("Verified that 'Satarday' label appeared under Sechedule section in test tab");		
      		Assert.assertEquals(driver.findElement(satButton).getText(), "Sat");		
      		log.debug("Verified that 'Sat' Text validated under Test Tab");
      		Assert.assertTrue(driver.findElement(satButton).isEnabled());
      		log.debug("Verified that 'Sat' button enabled under sechedule section");
      		
      		Assert.assertTrue(driver.findElement(startTimeValue).isDisplayed());
      		log.debug("Verified that 'Start Time' filled appeared under Sechedule section in test tab");		
      		Assert.assertTrue(driver.findElement(startTimeValue).isEnabled());
      		log.debug("Verified that 'Start Time' filled enabled under sechedule section");
      		
      		Assert.assertTrue(driver.findElement(endTimeValue).isDisplayed());
      		log.debug("Verified that 'End Time Value' filled appeared under Sechedule section in test tab");		
      		Assert.assertTrue(driver.findElement(endTimeValue).isEnabled());
      		log.debug("Verified that 'End Time Value filled enabled under sechedule section");
      		
	  //===================================================================================================
      		
      		Assert.assertTrue(driver.findElement(scriptlabel).isDisplayed());
    		log.debug("Verified that 'Script' label appeared under test tab");		
    		Assert.assertEquals(driver.findElement(scriptlabel).getText(), "Script");		
    		log.debug("Verified that 'Script' Text validated under Test Tab");
    		
    		Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
    		log.debug("Verified that 'Script name' label appeared under script section in test tab");		
    		Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
    		log.debug("Verified that 'Script Name' Text validated under Test Tab");
    		
    	// Script Drop Down	
    	
    			 log.debug("Verified that script dropdown"); 			 
    			 WebElement scriptdropdown = driver.findElement(selectaScriptDropdown); 			
    		//	 System.out.println(dropdown.getSize());			 
    	        Select scripts1 = new Select(scriptdropdown); 	        
    	        Assert.assertFalse(scripts1.isMultiple());	        
    	       java.util.List<WebElement> options1 = scripts1.getOptions();    
    	      log.debug("Verified that following values available in the dropdown"); 
    	          for(WebElement item1:options1) 
    	        { 
    	        	for (int i = 0; i <options1.size(); i++) {          		
    	        		log.debug(""+item1.getText());      			   			
    	     
    	                   	}
    	        		}
    	          
    		
            Assert.assertTrue(driver.findElement(inputParameterlabel).isDisplayed());
      		log.debug("Verified that 'Input Parameters' label appeared under script section in test tab");		
      		Assert.assertEquals(driver.findElement(inputParameterlabel).getText(), "Input Parameters");		
      		log.debug("Verified that 'Input Parameters' Text validated under Test Tab");
    		
            Assert.assertTrue(driver.findElement(namelabel).isDisplayed());
      		log.debug("Verified that 'Name' label appeared under script section in test tab");		
      		Assert.assertEquals(driver.findElement(namelabel).getText(), "Name");		
      		log.debug("Verified that 'Name' Text validated under Test Tab");
      		
            Assert.assertTrue(driver.findElement(valuelabel).isDisplayed());
      		log.debug("Verified that 'Value' label appeared under script section in test tab");		
      		Assert.assertEquals(driver.findElement(valuelabel).getText(), "Value");		
      		log.debug("Verified that 'Value' Text validated under Test Tab");
      		
            Assert.assertTrue(driver.findElement(maskedlabel).isDisplayed());
      		log.debug("Verified that 'Masked' label appeared under script section in test tab");		
      		Assert.assertEquals(driver.findElement(maskedlabel).getText(), "Masked");		
      		log.debug("Verified that 'Masked' Text validated under Test Tab");
      		
      		
      		Assert.assertTrue(driver.findElement(notificationslabel).isDisplayed());
      		log.debug("Verified that 'Notifications' label appeared under script section in test tab");		
      		Assert.assertEquals(driver.findElement(notificationslabel).getText(), "Notifications");		
      		log.debug("Verified that 'Notifications' Text validated under Test Tab");
      		
      		Assert.assertTrue(driver.findElement(enabledBoxlabel).isDisplayed());
      		log.debug("Verified that 'Enabled' label appeared under Notification checkbox in test tab");		
      		Assert.assertEquals(driver.findElement(enabledBoxlabel).getText(), "Enabled");		
      		log.debug("Verified that 'Enabled' Text validated under Notification checkbox in test tab");			
      	
           
       	Assert.assertTrue(driver.findElement(notifiCheckbox).isDisplayed());
    	log.debug("Verified that 'Notifi Enabled Checkbox' appeared under Notification in test tab");		 
    	Assert.assertTrue(driver.findElement(notifiCheckbox).isEnabled());
    	log.debug("Verified that 'Notification Enabled' checkbox appeared notification in Test tab");			
    	
    	
    	Assert.assertTrue(driver.findElement(enabledBoxlabel).isDisplayed());
    	log.debug("Verified that 'Enabled' label appeared under Notification checkbox in test tab");		
    	Assert.assertEquals(driver.findElement(enabledBoxlabel).getText(), "Enabled");		
    	log.debug("Verified that 'Enabled' Text validated under Notification checkbox in test tab");	
    	
    	Assert.assertTrue(driver.findElement(notifiEnabledlabel).isDisplayed());
    	log.debug("Verified that 'Notification' label appeared in notification dropdown in test tab");		
    	Assert.assertEquals(driver.findElement(notifiEnabledlabel).getText(), "Notifications Enabled");		
    	log.debug("Verified that 'Notifications Enabled' Text validated in notification dropdown in test tab");	
    	
    	Assert.assertTrue(driver.findElement(patternlabel).isDisplayed());
    	log.debug("Verified that 'Pattern' label appeared under Notification in test tab");		
    	Assert.assertEquals(driver.findElement(patternlabel).getText(), "Pattern");		
    	log.debug("Verified that 'Pattern' Text validated under Test Tab");	
    	
    	Assert.assertTrue(driver.findElement(severitylabel).isDisplayed());
    	log.debug("Verified that 'Severity' label appeared under Notification in test tab");	
    	Assert.assertEquals(driver.findElement(severitylabel).getText(), "Severity");		
    	log.debug("Verified that 'Severity' Text validated under Test Tab");	
    	
    	Assert.assertTrue(driver.findElement(notifionrettogoodlabel).isDisplayed());
    	log.debug("Verified that 'Notify on return to good' label appeared under Notification in test tab");		
    	Assert.assertEquals(driver.findElement(notifionrettogoodlabel).getText(), "Notify on return to good");		
    	log.debug("Verified that 'Notify on return to good' Text validated under Test Tab");	
    	
    	Assert.assertTrue(driver.findElement(reduceNotifiButton).isDisplayed());
    	log.debug("Verified that '(-) reduce notification button appeared under notification in Test tab");			
    	Assert.assertTrue(driver.findElement(reduceNotifiButton).isEnabled());
    	log.debug("Verified that '(-) reduce notification button enabled under notification in Test tab");			
    	  		
      		
    	Assert.assertTrue(driver.findElement(addNotifiButton).isDisplayed());
    	log.debug("Verified that '(+) add notification button appeared under notification in Test tab");			
    	Assert.assertTrue(driver.findElement(addNotifiButton).isEnabled());
    	log.debug("Verified that '(+) add notification button enabled under notification in Test tab");			
    	
    	
      	Assert.assertTrue(driver.findElement(notifiCheckbox).isDisplayed());
    	log.debug("Verified that 'Notifi Enabled Checkbox' appeared under Notification in test tab");		 
    	Assert.assertTrue(driver.findElement(notifiCheckbox).isEnabled());
    	log.debug("Verified that 'Notification Enabled' checkbox appeared notification in Test tab");			
    	
    	// Notification Drop Down	
    		
    			 log.debug("Verified that Notification dropdown"); 		 
    			 WebElement notifidropdown = driver.findElement(notifiDropdown);		
    		//	 System.out.println(dropdown.getSize());		 
    	       Select notifi1 = new Select(notifidropdown);        
    	       Assert.assertFalse(notifi1.isMultiple());       
    	      java.util.List<WebElement> options2 = notifi1.getOptions();   
    	     
    	      log.debug("Verified that following values available in the dropdown");      
    	       for(WebElement item2:options2) 
    	       { 
    	       	for (int i = 0; i <options2.size(); i++) {        		
    	       					        						    
    	       			log.debug(""+item2.getText());      			   			
    	    
    	                  	}
    	       		}
    	
    	    // Pattern Drop Down	
    			
    			 log.debug("Verified that Notification dropdown"); 		 
    			 WebElement Patterndropdown = driver.findElement(patternDropdown);		
    		//	 System.out.println(dropdown.getSize());		 
    	       Select pattern1 = new Select(Patterndropdown);        
    	       Assert.assertFalse(pattern1.isMultiple());       
    	      java.util.List<WebElement> options3 = pattern1.getOptions();   
    	     
    	      log.debug("Verified that following values available in the dropdown");      
    	       for(WebElement item3:options3) 
    	       { 
    	       	for (int i = 0; i <options3.size(); i++) {        		
    	       					        						    
    	       			log.debug(""+item3.getText());      			   			
    	    
    	                  	}
    	       		}
    		
    	     Assert.assertTrue(driver.findElement(patternValue).isDisplayed());
    	   	log.debug("Verified that 'Pattern' filled appeared under Notification in test tab");		 
    	   	Assert.assertTrue(driver.findElement(patternValue).isEnabled());
    	   	log.debug("Verified that 'Pattern' filled enabled under Notification in test tab");
    	       
    	 // Severty Drop Down	
    		
    		 log.debug("Verified that Severity dropdown"); 		 
    		 WebElement severitydropdown = driver.findElement(serverityDropdown);		
    	//	 System.out.println(dropdown.getSize());		 
          Select severity1 = new Select(severitydropdown);        
          Assert.assertFalse(severity1.isMultiple());       
         java.util.List<WebElement> options4 = severity1.getOptions();   
        
         log.debug("Verified that following values available in the dropdown");      
          for(WebElement item4:options4) 
          { 
          	for (int i = 0; i <options4.size(); i++) {        		
          					        						    
          			log.debug(""+item4.getText());      			   			
       
                     	}
          		}  
         Assert.assertTrue(driver.findElement(notifionCheckbox).isDisplayed());
      	log.debug("Verified that 'Notify on return to good' Checkbox appeared under Notification in test tab");		 
      	Assert.assertTrue(driver.findElement(notifionCheckbox).isEnabled());
      	log.debug("Verified that 'Notify on return to good' checkbox enabled under notification in Test tab");			
      	   
    	
        Assert.assertTrue(driver.findElement(failThreSoldlabel).isDisplayed());
    	log.debug("Verified that 'Failure Thresholds' label appeared on under Tests tab");		
    	Assert.assertEquals(driver.findElement(failThreSoldlabel).getText(), "Failure Thresholds");		
    	log.debug("Verified that 'Failure Thresholds' Text validated under Test Tab");
    	
    	Assert.assertTrue(driver.findElement(primaryMetlabel).isDisplayed());
    	log.debug("Verified that 'Primary Metrics' label appeared on under Tests tab");		
    	Assert.assertEquals(driver.findElement(primaryMetlabel).getText(), "Primary Metrics");		
    	log.debug("Verified that 'Primary Metrics' Text validated under Test Tab");
      	
    	Assert.assertTrue(driver.findElement(addMetLabel).isDisplayed());
    	log.debug("Verified that 'Additional Metrics' label appeared on under Tests tab");		
    	Assert.assertEquals(driver.findElement(addMetLabel).getText(), "Additional Metrics");		
    	log.debug("Verified that 'Additional Metrics' Text validated under Test Tab");
    	
    	Assert.assertTrue(driver.findElement(failureEnabledlabel).isDisplayed());
    	log.debug("Verified that 'Enabled' label appeared under Failure Thresholds in Tests tab");		
    	Assert.assertEquals(driver.findElement(failureEnabledlabel).getText(), "Enabled");		
    	log.debug("Verified that 'Enabled' text validated in Tests tab");		
    	       
    	Assert.assertTrue(driver.findElement(failMetriclabel).isDisplayed());
    	log.debug("Verified that 'Metric' label appeared under Failure Thresholds in Tests tab");		
    	Assert.assertEquals(driver.findElement(failMetriclabel).getText(), "Metric");		
    	log.debug("Verified that 'Metric' text validated in Tests tab");	
    	
    	Assert.assertTrue(driver.findElement(failCriterilabel).isDisplayed());
    	log.debug("Verified that 'Criteria' label appeared under Failure Thresholds in Tests tab");		
    	Assert.assertEquals(driver.findElement(failCriterilabel).getText(), "Criteria");		
    	log.debug("Verified that 'Criteria' text validated in Tests tab");
    	
    	Assert.assertTrue(driver.findElement(failWarrninglabel).isDisplayed());
    	log.debug("Verified that 'Warning' label appeared under Failure Thresholds in Tests tab");		
    	Assert.assertEquals(driver.findElement(failWarrninglabel).getText(), "Warning");		
    	log.debug("Verified that 'Warning' text validated in Tests tab");
    	
    	Assert.assertTrue(driver.findElement(failCrticallabel).isDisplayed());
    	log.debug("Verified that 'Critical' label appeared under Failure Thresholds in Tests tab");		
    	Assert.assertEquals(driver.findElement(failCrticallabel).getText(), "Critical");		
    	log.debug("Verified that 'Critical' text validated in Tests tab");
    	
    	Assert.assertTrue(driver.findElement(saveButtonTestTab).isDisplayed());
    	log.debug("Verified that 'Save' button displayed under Tests tab");	
    	Assert.assertFalse(driver.findElement(saveButtonTestTab).isEnabled());
    	log.debug("Verified that 'Save' button' is enabled under Tests tab");	
    	Assert.assertEquals(driver.findElement(saveButtonTestTab).getText(), "Save");		
    	log.debug("Verified that 'Save' Text appeared on save button under Test Tab");
    	
    	Assert.assertTrue(driver.findElement(discardButtonTestTab).isDisplayed());
    	log.debug("Verified that 'Discard' button displayed under Tests tab");	
    	Assert.assertFalse(driver.findElement(discardButtonTestTab).isEnabled());
    	log.debug("Verified that 'Discard' button' is enabled under Tests tab");	
    	Assert.assertEquals(driver.findElement(discardButtonTestTab).getText(), "Discard");		
    	log.debug("Verified that 'Discard' Text appeared on save button under Test Tab");
    	
    	if (driver.findElements(deleteButtonTestTab).isEmpty()) {
    		
    		log.debug("Verified that 'Delete button' is not displayed under Tests tab");		
    		
    					
    	}else
    	
    	{
    		log.debug("Verified that 'Delete button' displayed under Tests tab");	
    		
    	}
    	
    		
	
	}
	}