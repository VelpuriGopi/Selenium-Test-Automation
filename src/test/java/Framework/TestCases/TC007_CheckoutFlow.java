package Framework.TestCases;

import Framework.Base.BaseTest;
import Framework.Utility.BillingAddressMethods;
import Framework.Utility.CartMethods;
import Framework.Utility.CheckoutLoginMethods;
import Framework.Utility.DriverFactory;
import Framework.Utility.PaymentMethods;
import Framework.Utility.ProductMethods;
import org.testng.annotations.Test;

public class TC007_CheckoutFlow extends BaseTest {

    @Test
    public void checkoutFlowTest()
            throws InterruptedException {

        DriverFactory.getDriver()
                .manage()
                .deleteAllCookies();

        DriverFactory.getDriver()
                .navigate()
                .refresh();

        // rest of code


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

        Thread.sleep(2000);

        cart.openCart();

        Thread.sleep(2000);

        cart.proceedToCheckout();

        Thread.sleep(2000);

        System.out.println(
                "Checkout Navigation Successful");

        CheckoutLoginMethods login =
                new CheckoutLoginMethods(
                        DriverFactory.getDriver());

        login.loginToCheckout(
                "gopi9310@gmail.com",
                "Ashritha1234@1");

        System.out.println(
                "Checkout Login Successful");

        BillingAddressMethods billing =
                new BillingAddressMethods(
                        DriverFactory.getDriver());

        billing.fillBillingAddress();

        System.out.println(
                "Billing Address Completed Successfully");

        PaymentMethods payment =
                new PaymentMethods(
                        DriverFactory.getDriver());

        payment.selectPaymentMethod();

        System.out.println(
                "Payment Method Selected Successfully");

        System.out.println(
                "Checkout Flow Completed Successfully");

        Thread.sleep(10000);
    }
}