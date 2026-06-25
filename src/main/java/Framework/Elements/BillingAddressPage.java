package Framework.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingAddressPage {

    @FindBy(xpath = "//*[contains(text(),'Billing Address')]")
    public WebElement billingAddressHeading;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "postal_code")
    public WebElement postalCode;

    @FindBy(id = "house_number")
    public WebElement houseNumber;

    @FindBy(id = "street")
    public WebElement street;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "state")
    public WebElement state;

    @FindBy(xpath = "//button[@data-test='proceed-3']")
    public WebElement proceedButton;
}