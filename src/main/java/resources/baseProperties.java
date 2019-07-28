package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;


public class baseProperties {
	
	public WebDriver driver;
	public Properties prop;
	
	private static Logger log =LogManager.getLogger(baseProperties.class.getName());
	
	public WebDriver intializeDriver() throws IOException, InterruptedException
	{
		//Chrome
		
prop=new Properties();

//  FileInputStream fis=new FileInputStream("C:\\perforce_workspace\\Preempt\\DevOps\\VoiceWatch\\AutomationTest\\VoiceWatchAutomation\\VoiceWatchAutomation\\src\\main\\java\\resources\\data.properties");

//FileInputStream fis=new FileInputStream("C:\\Users\\hsingh\\.jenkins\\${JENKIN_HOME}\\ECP_VW\\src\\main\\java\\resources\\data.properties");

FileInputStream fis=new FileInputStream("C:\\Users\\hsingh\\git_project\\ECP_VW\\src\\main\\java\\resources\\data.properties");



prop.load(fis);
String browserName=prop.getProperty("browser");
if(browserName.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hsingh\\git_project\\ECP_VW\\src\\main\\java\\resources\\drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    log.debug("Chrome Driver intilized successfully");
    log.debug("Chrome Browser selected & Launching in few second");
}		
		
//firefox

else if (browserName.equals("firefox"))
	
{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\hsingh\\git_project\\ECP_VW\\src\\main\\java\\resources\\drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
	
	log.info("Firefox Driver intilized successfully");
    log.info("Firefox Browser selected & Launch");
}

//IE
else if (browserName.equals("ie"))
{
	System.setProperty("webdriver.ie.driver","C:\\Users\\hsingh\\git_project\\ECP_VW\\src\\main\\java\\resources\\drivers\\IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	
	log.info("IE Driver intilized successfully");
    log.info("IE Browser selected & Launch");
}

//Timeout

driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
driver.get(prop.getProperty("url"));
log.debug("URL provided");
driver.manage().window().maximize();
log.debug("Screen maximized successfully");
log.debug("Waiting to access above URL");
Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/nav/div[1]/a/img")).isDisplayed());
Thread.sleep(1000);
log.debug(" Verified that VoiceWatch login screen appeared successfully");

return driver;
	}
	
	

		
	public void getScreenshot(String result) throws IOException
//	public void getScreenshot() throws IOException
	
	{
		
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\Users\\hsingh\\git_project\\ECP_VW\\src\\main\\java\\resources\\screenshot"+result+"screenshot.png"));
//	FileUtils.copyFile(src, new File("C:\\Users\\hsingh\\git_project\\ECP_VW\\src\\main\\java\\resources\\screenshot\\screenshot.png"));
	
	}


	
	
}
	
