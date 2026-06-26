package Framework.TestCases;

import Framework.Base.BaseTest;
import Framework.Utility.DriverFactory;
import Framework.Utility.LoginMethods;
import Framework.Utility.LogoutMethods;
import org.testng.annotations.Test;

public class TC012_Logout extends BaseTest {

    @Test
    public void logoutTest() {

        DriverFactory.getDriver().get(
                "https://practicesoftwaretesting.com/auth/login");

        LoginMethods login =
                new LoginMethods(
                        DriverFactory.getDriver());

        login.login(
                "customer@practicesoftwaretesting.com",
                "welcome01");

        System.out.println(
                "Login Successful");

        LogoutMethods logout =
                new LogoutMethods(
                        DriverFactory.getDriver());

        logout.logout();

        System.out.println(
                "Logout Successful");
    }


    //Difference Between TC012 and TC025
    //
    //TC012_Logout
    //
    //Login
    //↓
    //Logout
    //↓
    //Pass
    //


    //TC025_LogoutValidation
    //
    //Login
    //↓
    //Logout
    //↓
    //Verify Sign In Displayed
    //↓
    //Assertion
    //↓
    //Pass
}