package Framework.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {

    @FindBy(xpath = "//*[@data-test='proceed-1']")
    public WebElement proceedToCheckoutButton;
}