package Framework.TestCases;

import Framework.Base.BaseTest;
import Framework.Utility.DriverFactory;
import Framework.Utility.RegisterMethods;
import org.testng.annotations.Test;

public class TC001_Register extends BaseTest {

    @Test
    public void registerCustomer() {

        DriverFactory.getDriver().get(
                "https://practicesoftwaretesting.com/auth/register");

        RegisterMethods register =
                new RegisterMethods(
                        DriverFactory.getDriver());

        register.fillRegistrationForm();

        register.clickRegisterButton();

        System.out.println("Registration Form Submitted");
    }
}