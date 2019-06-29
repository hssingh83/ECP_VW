package reuseableScript;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import resources.baseProperties;

public class driverScript extends baseProperties {
	
	private static Logger log =LogManager.getLogger(driverScript.class.getName());
	
	//Browser Initialization
	
	@Test
	public void applicationLaunch() throws IOException, InterruptedException
	{
	log.info("VoiceWatch loginPageAccess TestCase Validation Started");
	driver=intializeDriver();
	log.info("Driver intilized successfully");
	driver.get(prop.getProperty("url"));
	Thread.sleep(10000);
	log.info("VoiceWatch Application Launched successfully");
	}
	}