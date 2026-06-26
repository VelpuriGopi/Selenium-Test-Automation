package Framework.TestCases;

import Framework.Base.BaseTest;
import Framework.Utility.BillingAddressMethods;
import Framework.Utility.CheckoutFlowMethods;
import Framework.Utility.DriverFactory;
import org.testng.annotations.Test;

public class TC009_BillingAddress extends BaseTest {

    @Test
    public void billingAddressTest() {

        CheckoutFlowMethods flow =
                new CheckoutFlowMethods(
                        DriverFactory.getDriver());

        flow.navigateToBillingAddress();

        BillingAddressMethods billing =
                new BillingAddressMethods(
                        DriverFactory.getDriver());

        billing.fillBillingAddress();

        System.out.println(
                "Billing Address Completed Successfully");
    }
}