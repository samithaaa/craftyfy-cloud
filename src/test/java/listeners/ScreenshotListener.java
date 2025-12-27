package listeners;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;

import base.TestBase;
import utility.ScreenshotUtil;

public class ScreenshotListener extends TestBase implements ITestListener {
	@BeforeClass
	public void setUp(ITestContext context) {
	    driver = new ChromeDriver();
	    context.setAttribute("driver", driver);
	}

	@Override
	public void onTestFailure(ITestResult result) {
	    WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");
	    if(driver != null){
	        // take screenshot
	    }
	}

    
        }
    


