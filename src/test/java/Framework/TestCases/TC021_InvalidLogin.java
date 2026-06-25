package Framework.TestCases;

import Framework.Elements.CheckoutLoginPage;
import Framework.TestCases.Base.BaseTest;
import Framework.Utility.DriverFactory;
import Framework.Utility.WaitUtils;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC021_InvalidLogin extends BaseTest {

    @Test
    public void invalidLoginTest() {

        DriverFactory.getDriver()
                .navigate()
                .to("https://practicesoftwaretesting.com/auth/login");

        CheckoutLoginPage loginPage =
                PageFactory.initElements(
                        DriverFactory.getDriver(),
                        CheckoutLoginPage.class);

        WaitUtils wait =
                new WaitUtils(
                        DriverFactory.getDriver());

        loginPage.email.sendKeys(
                "invalid@test.com");

        loginPage.password.sendKeys(
                "wrong123");

        loginPage.loginButton.click();

        String errorMessage =
                wait.waitForElementVisible(
                                loginPage.invalidLoginMessage)
                        .getText();

        System.out.println(
                "Error Message : "
                        + errorMessage);

        Assert.assertEquals(
                errorMessage,
                "Invalid email or password");

        System.out.println(
                "Invalid Login Validation Successful");
    }
}