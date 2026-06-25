package Framework.Utility;

import Framework.Elements.CheckoutPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckoutMethods {

    WebDriver driver;

    public CheckoutMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void proceedToCheckout() {

        CheckoutPage cp =
                PageFactory.initElements(
                        driver,
                        CheckoutPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        wait.waitForElementClickable(
                        cp.proceedToCheckoutButton)
                .click();
    }
}