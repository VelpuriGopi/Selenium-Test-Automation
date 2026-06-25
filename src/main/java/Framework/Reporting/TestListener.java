package Framework.Reporting;

import Framework.Utility.DriverFactory;
import Framework.Utility.ScreenshotUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    private static final ExtentReports extent =
            ExtentManager.getReporter();

    private static final ThreadLocal<ExtentTest> test =
            new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {

        ExtentTest extentTest =
                extent.createTest(result.getMethod().getMethodName());

        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.get().pass("Test Passed");
    }


    @Override
    public void onTestFailure(ITestResult result) {

        test.get().fail(result.getThrowable());

        String screenshotPath =
                ScreenshotUtils.captureScreenshot(
                        DriverFactory.getDriver(),
                        result.getMethod().getMethodName());

        try {

            test.get().addScreenCaptureFromPath(
                    screenshotPath);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        test.get().skip("Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush();
    }
}