package Framework.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutLoginPage {

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//input[@data-test='login-submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[contains(text(),'Billing Address')]")
    public WebElement billingAddressStep;

//    @FindBy(xpath = "//button[contains(text(),'Proceed to checkout')]")
//    public WebElement proceedAfterLoginButton;

//    @FindBy(xpath = "//button[contains(text(),'Proceed to checkout')]")
//    public WebElement proceedAfterLoginButton;


    @FindBy(css = "button[data-test='proceed-2']")
    public WebElement proceedAfterLoginButton;

//    @FindBy(xpath = "//button[@data-test='proceed-2']")
//    public WebElement proceedAfterLoginButton;

    @FindBy(xpath = "//*[contains(text(),'Invalid email or password')]")
    public WebElement invalidLoginMessage;
}