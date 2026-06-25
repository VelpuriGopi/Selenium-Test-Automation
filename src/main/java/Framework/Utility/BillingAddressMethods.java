package Framework.Utility;

import Framework.Elements.BillingAddressPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillingAddressMethods {

    WebDriver driver;

    public BillingAddressMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void fillBillingAddress() {

        BillingAddressPage bp =
                PageFactory.initElements(
                        driver,
                        BillingAddressPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        System.out.println(
                "Waiting for Billing Address Page...");

        wait.waitForElementVisible(
                bp.billingAddressHeading);

        System.out.println(
                "Current URL : "
                        + driver.getCurrentUrl());

        System.out.println(
                "Current Title : "
                        + driver.getTitle());

        System.out.println(
                "Page Contains Country : "
                        + driver.getPageSource()
                        .contains("country"));

        System.out.println(
                "Page Contains Billing Address : "
                        + driver.getPageSource()
                        .contains("Billing Address"));

        System.out.println(
                "Country Elements Found : "
                        + driver.findElements(
                                org.openqa.selenium.By.id("country"))
                        .size());

        Select country =
                new Select(
                        wait.waitForElementVisible(
                                bp.country));

        country.selectByVisibleText(
                "Austria");

        wait.waitForElementVisible(
                        bp.postalCode)
                .clear();

        bp.postalCode.sendKeys("1234");

        bp.houseNumber.clear();
        bp.houseNumber.sendKeys("42");

        bp.street.clear();
        bp.street.sendKeys("Test Street");

        bp.city.clear();
        bp.city.sendKeys("Vienna");

        bp.state.clear();
        bp.state.sendKeys("Vienna");

        wait.waitForElementClickable(
                        bp.proceedButton)
                .click();

        System.out.println(
                "Billing Address Submitted Successfully");
    }
}