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

public class BMWModule7TechnologyTC_56 {
	static WebDriver driver;
	MethodLibrary methodLibrary_object;
	public static Logger log = LogManager.getLogger(BMWModule7TechnologyTC_56.class.getName());

	@BeforeClass
	public void beforeClass() throws IOException {

		log.info("driver is initialised");

		Base base = new Base();
		driver = base.invokeBrowser();

		methodLibrary_object = new MethodLibrary(driver, log);

	}

	@Test
	public void Click_BMW_World_Tech_Innovation() throws IOException, InterruptedException {

		// Method Lib fun
		methodLibrary_object.BMW_Tech_Innovation();

		log.info("test successfull");
	}

	@AfterClass
	public void afterClass() {

		driver.close();
		driver = null;
		log.info("driver closed");
	}

}
