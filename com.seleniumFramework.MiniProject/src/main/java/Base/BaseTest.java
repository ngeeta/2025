package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class BaseTest {
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	public static WebDriver driver;
	public static FileInputStream fs;
	public static Properties property;

	@BeforeTest
	public void startReporter() {

		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + File.separator + "reports"
				+ File.separator + "SDETADDAextentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		sparkReporter.config().setTheme(Theme.STANDARD);

		// extent.setSystemInfo("HostName", "RHEL8");
		// extent.setSystemInfo("UserName", "root");
		// configuration items to change the look and feel
		// add content, manage tests etc
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Automation test result Of Mini Project");
		//sparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

	}

	@BeforeMethod
	public void FileLoad(Method method) throws IOException {
		logger = extent.createTest(method.getName());
		fs = new FileInputStream("src/test/resources/ConfigFiles/locators.properties");
		property = new Properties();
		property.load(fs);
		System.out.println("from base " + property.getProperty("signInButton"));
	}

	@BeforeMethod
	@Parameters("browser")
	public void setUpBrowser(String browser, Method method) throws IOException {
		logger = extent.createTest(method.getName());
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			logger.info("From Chrome");
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			logger.info("From Edge");

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			logger.info("From Firefox");

		} else {
			throw new IllegalArgumentException("Unsupported Browser : " + browser);

		}
		driver.manage().window().maximize();
		driver.get(property.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getName() + " - Test case failed ", ExtentColor.RED));
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + " - Test case failed ", ExtentColor.RED));

		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " - Test case skipped ", ExtentColor.ORANGE));

		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS,
					MarkupHelper.createLabel(result.getName() + " - Test case Pass ", ExtentColor.GREEN));

		}
		driver.quit();
	}

	@AfterMethod
	public void afterTest() {
		extent.flush();
	}
}
