package utilities;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends TestData {

	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeTest
	public void setup(String br) {

		logger = Logger.getLogger("Ninja Website");
		PropertyConfigurator.configure("log4j.properties");

		if (br.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			// options.addArguments("--headless");
			options.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);

		} else if (br.equals("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(options);
		}

		else if (br.equals("edge")) {

		}

		driver.manage().window().maximize();

		driver.get(URL);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));

		logger.info("Page Title: " + driver.getTitle());

	}

	@AfterTest
	public void tearDown() throws Exception {

		MyScreenRecording.stopRecording();
		driver.quit();
	}

}
