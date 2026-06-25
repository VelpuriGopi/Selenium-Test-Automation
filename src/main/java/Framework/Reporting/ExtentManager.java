package Framework.Reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getReporter() {

        if (extent == null) {

            String reportName =
                    "Reports/ExtentReport_" +
                            System.currentTimeMillis() +
                            ".html";

            ExtentSparkReporter spark =
                    new ExtentSparkReporter(reportName);

            spark.config().setReportName(
                    "Selenium Automation Report");

            spark.config().setDocumentTitle(
                    "Automation Test Report");

            extent = new ExtentReports();

            extent.attachReporter(spark);

            extent.setSystemInfo(
                    "Framework",
                    "Selenium Java");

            extent.setSystemInfo(
                    "Tester",
                    "Velpuri Gopi");

            extent.setSystemInfo(
                    "Environment",
                    "QA");
        }

        return extent;
    }
}