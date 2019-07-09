package PageActions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
		
          if (driver.findElements(testCreateplusbutton).isEmpty()) {
			
			log.debug("Verified that new test creation plus (+) icon not appeared on top left side under Tests tab");	
			
						
		}else
		
		{
			log.debug("Verified that new test creation plus (+) icon appeared on top left side under Tests tab");	
			
			
		
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
		
	//	Select select = new Select(driver.findElement(By.xpath("//div[@class='input-group']//select[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty']")));
	//	System.out.println(select.getOptions());
	

		
		Assert.assertEquals(driver.findElement(hammerGroupDefaultValue).getText(), "us_hammers");
		log.debug("Verified that 'us_hammers' default value as Hammer Group under Test Tab");
		
		
/*		WebElement dropdown = driver.findElement(By.xpath("//div[@class='input-group']//select[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty']")); 
        Select s = new Select(dropdown); 
       java.util.List<WebElement> options = s.getOptions(); 
        for(WebElement item:options) 
        { 
        
             System.out.println("Dropdown values are "+ item.getText());           
           }
		*/
        
        
		 String[] exp = {"(GMT -12:00) Eniwetok, Kwajalein","(GMT -11:00) Midway Island, Samoa","(GMT -10:00) Hawaii","(GMT -9:00) Alaska","(GMT -8:00) Pacific Time (US & Canada)","(GMT -7:00) Mountain Time (US & Canada)","(GMT -7:00) Arizona Time (US & Canada)","(GMT -6:00) Central Time (US & Canada), Mexico City","(GMT -5:00) Eastern Time (US & Canada)","(GMT -5:00) Bogota, Lima","(GMT -4:30) Caracas","(GMT -4:00) Atlantic Time (Canada)","(GMT -4:00) Santiago","(GMT -4:00) Georgetown, La Paz","(GMT -3:30) Newfoundland","(GMT -3:00) Buenos Aires","(GMT -3:00) Sao Paulo", "(GMT -2:00) Mid-Atlantic","(GMT -1:00 hour) Azores, Cape Verde Islands","(GMT) Western Europe Time, London, Lisbon, Casablanca, Greenwich","(GMT +1:00 hour) Brussels, Copenhagen, Madrid, Paris","(GMT +2:00) Kaliningrad, South Africa, Cairo","(GMT +3:00) Baghdad, Riyadh, Moscow, St. Petersburg","(GMT +3:30) Tehran","(GMT +4:00) Abu Dhabi, Muscat, Yerevan, Baku, Tbilisi","(GMT +4:30) Kabul","(GMT +5:00) Ekaterinburg, Islamabad, Karachi, Tashkent","(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo","(GMT +5:45) Kathmandu","(GMT +6:00) Almaty, Dhaka","(GMT +6:30) Yangon, Cocos Islands","(GMT +7:00) Bangkok, Hanoi, Jakarta","(GMT +8:00) Beijing, Perth, Singapore, Hong Kong","(GMT +9:00) Tokyo, Seoul, Osaka, Sapporo, Yakutsk","(GMT +9:30) Adelaide, Darwin","(GMT +10:00) Eastern Australia, Guam, Vladivostok, Magadan","(GMT +11:00) Solomon Islands, New Caledonia","(GMT +12:00) Auckland, Wellington"};
		// System.out.println(exp.length);
		 log.debug("Verified that count of the dropdown values are: "  +exp.length); 
		 
		 WebElement dropdown = driver.findElement(dropdownTimeZone); 
		
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
      
																													}
				
	
	     
	
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
		
		/*Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'Delete button' displayed under Tests tab");	
		Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
		log.debug("Verified that 'Delete button' is disbaled under Tests tab");	
		Assert.assertEquals(driver.findElement(deleteButton).getText(), "Delete");		
		log.debug("Verified that 'Delete' Text appeared on save button under Test Tab");*/
		
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
	}}}				

	


	
	

	