package Framework.Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtils {

    public static String captureScreenshot(
            WebDriver driver,
            String testName) {

        String path =
                "Reports/Screenshots/" +
                        testName +
                        ".png";

        File source =
                ((TakesScreenshot) driver)
                        .getScreenshotAs(
                                OutputType.FILE);

        File destination =
                new File(path);

        try {

            FileUtils.copyFile(
                    source,
                    destination);

        } catch (IOException e) {

            e.printStackTrace();
        }

        return path;
    }
}