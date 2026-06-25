package Framework.Utility;

import Framework.Elements.CheckoutLoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckoutLoginMethods {

    WebDriver driver;

    public CheckoutLoginMethods(WebDriver driver) {

        this.driver = driver;
    }

    public void loginToCheckout(
            String emailValue,
            String passwordValue) {

        CheckoutLoginPage page =
                PageFactory.initElements(
                        driver,
                        CheckoutLoginPage.class);

        WaitUtils waitUtils =
                new WaitUtils(driver);

        System.out.println(
                "Current Checkout URL : "
                        + driver.getCurrentUrl());

        // User already logged in
        if (driver.getPageSource()
                .contains("already logged in")) {

            System.out.println(
                    "User Already Logged In");

            System.out.println(
                    "Proceed Buttons Found : "
                            + driver.findElements(
                                    org.openqa.selenium.By.cssSelector(
                                            "button[data-test='proceed-2']"))
                            .size());

            waitUtils.waitForElementClickable(
                    page.proceedAfterLoginButton);

            ((JavascriptExecutor) driver)
                    .executeScript(
                            "arguments[0].click();",
                            page.proceedAfterLoginButton);

            System.out.println(
                    "Proceed Button Clicked");

            System.out.println(
                    "URL After Proceed : "
                            + driver.getCurrentUrl());

            return;
        }

        System.out.println(
                "Email Fields Found : "
                        + driver.findElements(
                                org.openqa.selenium.By.id("email"))
                        .size());

        System.out.println("Entering Email");

        waitUtils.waitForElementVisible(
                        page.email)
                .sendKeys(emailValue);

        System.out.println("Entering Password");

        waitUtils.waitForElementVisible(
                        page.password)
                .sendKeys(passwordValue);

        System.out.println("Clicking Login");

        waitUtils.waitForElementClickable(
                        page.loginButton)
                .click();

        System.out.println(
                "Current URL After Login : "
                        + driver.getCurrentUrl());

        // Wait for Proceed button after login
        waitUtils.waitForElementClickable(
                page.proceedAfterLoginButton);

        System.out.println(
                "Proceed Button Found");

        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].click();",
                        page.proceedAfterLoginButton);

        System.out.println(
                "Proceed Button Clicked");

        System.out.println(
                "URL After Proceed : "
                        + driver.getCurrentUrl());

        System.out.println(
                "Login Completed Successfully");
    }
}