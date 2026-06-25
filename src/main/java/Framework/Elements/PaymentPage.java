package Framework.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage {

    @FindBy(id = "payment-method")
    public WebElement paymentMethodDropdown;

    @FindBy(xpath = "//button[@data-test='finish']")
    public WebElement confirmButton;

    @FindBy(xpath = "//*[contains(text(),'Payment was successful')]")
    public WebElement successMessage;




    @FindBy(id = "credit_card_number")
    public WebElement cardNumber;

    @FindBy(id = "expiration_date")
    public WebElement expiryDate;

    @FindBy(id = "cvv")
    public WebElement cvv;

    @FindBy(id = "card_holder_name")
    public WebElement cardHolderName;


}

