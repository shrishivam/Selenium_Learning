package bmw_scripts;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bmw_methodlib.MethodLibrary;

import bmw_utilities.Base;


public class BMWModule1SeriesCheckTC_007 {
	static WebDriver driver;
	public MethodLibrary Method_Library_object;
	public static Logger log = LogManager.getLogger(BMWModule1SeriesCheckTC_007.class.getName());

	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException {

		log.info("driver is initialised");
		Base base = new Base();
		driver = base.invokeBrowser();
		Thread.sleep(1000);
		Method_Library_object = new MethodLibrary(driver,log);
	}

	@Test
	public void Series_Checking() throws InterruptedException, IOException {

		Method_Library_object.Series_Check_Module_TC007();		
	}

	@AfterClass
	public void afterClass() {

		driver.close();
		driver = null;
		log.info("driver closed");
	}

}
