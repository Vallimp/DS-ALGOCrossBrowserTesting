package appHooks;

import java.io.ByteArrayInputStream;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

//import driverFactory.DriverFactory;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import com.utils.ConfigReader;
import com.utils.Helper;
//import com.utils.Loggerload;

public class Hooks {
	private static WebDriver driver;
	private static Helper helper;
	static Scenario scenario;

	@BeforeAll
	public static void before() throws Throwable {
		//Get browser Type from config file
		//		Loggerload.info("Loading Config file");
		ConfigReader.loadConfig();
		String browser = ConfigReader.getBrowserType();

		// Initialize driver from Helper
		helper = new Helper();
		driver = helper.initializeDrivers(browser);
		//Loggerload.info("Initializing driver for : "+browser);

	}

	@Before
	public static void setUp() {

		Helper.setUpDriver();
	}

	@Before
	public void scenario(Scenario scenario) {
		//		Loggerload.info("===============================================================================================");
		//		Loggerload.info(scenario.getSourceTagNames() +" : "+scenario.getName());
		//		Loggerload.info("-----------------------------------------------------------------------------------------------");

	}
	@AfterStep
	public void afterstep(Scenario scenario) {
		if (scenario.isFailed()) {
			//			Loggerload.error("Steps Failed , Taking Screenshot");
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "My screenshot");
			Allure.addAttachment("Myscreenshot",
					new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));

		}
	}

	@AfterAll
	public static void after() {
		//		Loggerload.info("Closing Driver");
		//		driverfactory.closeallDriver();
	}
}
