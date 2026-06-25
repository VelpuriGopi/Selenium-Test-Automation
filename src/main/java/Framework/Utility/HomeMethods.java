package Framework.Utility;

import Framework.Elements.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeMethods {

    WebDriver driver;

    public HomeMethods(WebDriver driver) {

        this.driver = driver;
    }

    public void clickSignIn() {

        HomePage hp =
                PageFactory.initElements(
                        driver,
                        HomePage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        wait.waitForElementClickable(
                        hp.signInLink)
                .click();
    }
}