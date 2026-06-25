package Framework.Utility;

import Framework.Elements.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginMethods {

    WebDriver driver;

    public LoginMethods(WebDriver driver) {

        this.driver = driver;
    }

    public void login(String email,
                      String password) {

        LoginPage lp =
                PageFactory.initElements(
                        driver,
                        LoginPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        wait.waitForElementVisible(lp.email)
                .sendKeys(email);

        wait.waitForElementVisible(lp.password)
                .sendKeys(password);

        wait.waitForElementClickable(lp.loginButton)
                .click();
    }
}