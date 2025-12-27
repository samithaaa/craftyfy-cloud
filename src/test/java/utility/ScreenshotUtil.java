package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class ScreenshotUtil {

    public static void takeScreenshot(WebDriver driver, String testName) {


        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);

            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            File dest = new File("screenshots/" + testName + "_" + timestamp + ".png");

            FileUtils.copyFile(src, dest);

        } catch (WebDriverException | IOException e) {
            System.out.println("Screenshot failed: " + e.getMessage());
        }
    }
}




