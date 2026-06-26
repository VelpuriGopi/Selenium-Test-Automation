package Framework.TestCases;

import Framework.Base.BaseTest;
import Framework.Utility.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC020_PaymentPageValidation
        extends BaseTest {

    @Test
    public void paymentPageValidationTest() {

        ProductMethods product =
                new ProductMethods(
                        DriverFactory.getDriver());

        product.openSecondProduct();

        CartMethods cart =
                new CartMethods(
                        DriverFactory.getDriver());

        cart.addProductToCart();

        cart.openCart();

        cart.proceedToCheckout();

        CheckoutLoginMethods login =
                new CheckoutLoginMethods(
                        DriverFactory.getDriver());

        login.loginToCheckout(
                "gopi9310@gmail.com",
                "Ashritha1234@1");

        BillingAddressMethods billing =
                new BillingAddressMethods(
                        DriverFactory.getDriver());

        billing.fillBillingAddress();

        PaymentMethods payment =
                new PaymentMethods(
                        DriverFactory.getDriver());

        boolean paymentPageDisplayed =
                payment.isPaymentPageDisplayed();

        System.out.println(
                "Payment Page Displayed : "
                        + paymentPageDisplayed);

        Assert.assertTrue(
                paymentPageDisplayed,
                "Payment Page Not Displayed");

        System.out.println(
                "Payment Page Validation Successful");
    }
}