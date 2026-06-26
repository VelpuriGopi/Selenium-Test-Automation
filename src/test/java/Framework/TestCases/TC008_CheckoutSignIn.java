package Framework.TestCases;

import Framework.Base.BaseTest;
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
                "gopi9310@gmail.com",
                "Ashritha1234@1");

        System.out.println(
                "Checkout Login Successful");
    }
}