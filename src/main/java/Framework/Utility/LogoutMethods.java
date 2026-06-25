package Framework.Utility;

import Framework.Elements.LogoutPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LogoutMethods {

    WebDriver driver;

    public LogoutMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void logout() {

        LogoutPage lp =
                PageFactory.initElements(
                        driver,
                        LogoutPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        System.out.println("Waiting For User Menu");

        wait.waitForElementClickable(
                        lp.userDropdown)
                .click();

        System.out.println("User Menu Clicked");

        wait.waitForElementClickable(
                        lp.signOutButton)
                .click();

        System.out.println("Sign Out Clicked");
    }

    public boolean isSignInDisplayed() {

        LogoutPage lp =
                PageFactory.initElements(
                        driver,
                        LogoutPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        return wait.waitForElementVisible(
                        lp.signInButton)
                .isDisplayed();
    }
}