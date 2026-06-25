package Framework.Utility;

import org.openqa.selenium.WebDriver;

public class CheckoutFlowMethods {

    WebDriver driver;

    public CheckoutFlowMethods(WebDriver driver) {

        this.driver = driver;
    }

    // Navigate to Checkout Login page
    public void navigateToCheckoutLogin() {

        ProductMethods product =
                new ProductMethods(driver);

        product.clickFirstProduct();

        CartMethods cart =
                new CartMethods(driver);

        cart.addProductToCart();

        cart.openCart();

        cart.proceedToCheckout();
    }

    // Navigate to Billing Address page
    public void navigateToBillingAddress() {

        navigateToCheckoutLogin();

        CheckoutLoginMethods checkout =
                new CheckoutLoginMethods(driver);

        checkout.loginToCheckout(
                "customer@practicesoftwaretesting.com",
                "welcome01");
    }

    // Navigate to Payment page
    public void navigateToPayment() {

        navigateToBillingAddress();

        BillingAddressMethods billing =
                new BillingAddressMethods(driver);

        billing.fillBillingAddress();
    }

    // Navigate to Payment page using the second product
    public void navigateToPaymentWithSecondProduct() {

        ProductMethods product =
                new ProductMethods(driver);

        product.openSecondProduct();

        CartMethods cart =
                new CartMethods(driver);

        cart.addProductToCart();

        cart.openCart();

        cart.proceedToCheckout();

        CheckoutLoginMethods checkout =
                new CheckoutLoginMethods(driver);

        TestDataReader data =
                new TestDataReader();

        checkout.loginToCheckout(
                data.getData("validEmail"),
                data.getData("validPassword"));

        BillingAddressMethods billing =
                new BillingAddressMethods(driver);

        billing.fillBillingAddress();
    }
}