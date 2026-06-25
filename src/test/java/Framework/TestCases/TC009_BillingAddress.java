package Framework.TestCases;

import Framework.Utility.BillingAddressMethods;
import Framework.Utility.DriverFactory;
import org.testng.annotations.Test;

public class TC009_BillingAddress extends BaseTest {

    @Test
    public void billingAddressTest() throws InterruptedException {

        BillingAddressMethods billing =
                new BillingAddressMethods(
                        DriverFactory.getDriver());

        billing.fillBillingAddress();

        System.out.println(
                "Billing Address Completed Successfully");
    }
}