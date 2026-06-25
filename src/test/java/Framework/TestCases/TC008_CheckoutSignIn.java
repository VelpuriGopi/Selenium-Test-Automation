package Framework.TestCases;

import Framework.TestCases.Base.BaseTest;
import Framework.Utility.CheckoutFlowMethods;
import Framework.Utility.CheckoutLoginMethods;
import Framework.Utility.DriverFactory;
import org.testng.annotations.Test;

public class TC008_CheckoutSignIn extends BaseTest {

    @Test
    public void checkoutSignInTest() {

        CheckoutFlowMethods flow =
                new CheckoutFlowMethods(
                        DriverFactory.getDriver());

        flow.navigateToCheckoutLogin();

        CheckoutLoginMethods checkout =
                new CheckoutLoginMethods(
                        DriverFactory.getDriver());

        checkout.loginToCheckout(
                "customer@practicesoftwaretesting.com",
                "welcome01");

        System.out.println(
                "Checkout Login Successful");
    }
}