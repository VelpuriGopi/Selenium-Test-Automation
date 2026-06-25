package Framework.TestCases;

import Framework.Utility.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC016_CompleteCheckout extends BaseTest {

    @Test
    public void completeCheckoutTest() {

        ProductMethods product =
                new ProductMethods(
                        DriverFactory.getDriver());

        product.openSecondProduct();

        CartMethods cart =
                new CartMethods(
                        DriverFactory.getDriver());

        cart.addProductToCart();

        System.out.println(
                "Product Added To Cart");

        cart.openCart();

        cart.proceedToCheckout();

        CheckoutLoginMethods login =
                new CheckoutLoginMethods(
                        DriverFactory.getDriver());

        login.loginToCheckout(
                "customer@practicesoftwaretesting.com",
                "welcome01");

        BillingAddressMethods billing =
                new BillingAddressMethods(
                        DriverFactory.getDriver());

        billing.fillBillingAddress();

        PaymentMethods payment =
                new PaymentMethods(
                        DriverFactory.getDriver());

        payment.selectPaymentMethod();

        payment.fillCardDetails();

        payment.confirmOrder();

        String successMessage =
                payment.getSuccessMessage();

        System.out.println(
                "Success Message : "
                        + successMessage);

        Assert.assertTrue(
                successMessage.length() > 0,
                "Order Confirmation Failed");

        System.out.println(
                "Complete Checkout Successful");
    }
}