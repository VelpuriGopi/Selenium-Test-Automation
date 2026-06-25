package Framework.Utility;

import Framework.Elements.PaymentPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentMethods {

    WebDriver driver;

    public PaymentMethods(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPaymentPageDisplayed() {

        PaymentPage pp =
                PageFactory.initElements(
                        driver,
                        PaymentPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        return wait.waitForElementVisible(
                        pp.paymentMethodDropdown)
                .isDisplayed();
    }

    public void selectPaymentMethod() {

        PaymentPage pp =
                PageFactory.initElements(
                        driver,
                        PaymentPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        Select payment =
                new Select(
                        wait.waitForElementVisible(
                                pp.paymentMethodDropdown));

        payment.selectByVisibleText(
                "Credit Card");

        System.out.println(
                "Payment Method Selected");
    }



    public String getSuccessMessage() {

        PaymentPage pp =
                PageFactory.initElements(
                        driver,
                        PaymentPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        return wait.waitForElementVisible(
                        pp.successMessage)
                .getText();
    }



    public void fillCardDetails() {

        PaymentPage pp =
                PageFactory.initElements(
                        driver,
                        PaymentPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        wait.waitForElementVisible(
                        pp.cardNumber)
                .sendKeys("1111-2222-3333-4444");

        pp.expiryDate.sendKeys("12/3022");

        pp.cvv.sendKeys("123");

        pp.cardHolderName.sendKeys(
                "Velpuri Gopi");

        System.out.println(
                "Card Details Entered");
    }

    public void confirmOrder() {

        PaymentPage pp =
                PageFactory.initElements(
                        driver,
                        PaymentPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        wait.waitForElementClickable(
                        pp.confirmButton)
                .click();

        System.out.println(
                "Order Confirmed");
    }
}