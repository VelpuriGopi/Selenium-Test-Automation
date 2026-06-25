package Framework.Utility;

import Framework.Elements.AccountPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AccountMethods {

    WebDriver driver;

    public AccountMethods(WebDriver driver) {

        this.driver = driver;
    }

    public boolean isMyAccountDisplayed() {

        AccountPage ap =
                PageFactory.initElements(
                        driver,
                        AccountPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        return wait.waitForElementVisible(
                        ap.myAccountHeading)
                .isDisplayed();
    }
}