package Framework.Utility;

import Framework.Elements.FilterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class FilterMethods {

    WebDriver driver;

    public FilterMethods(WebDriver driver) {

        this.driver = driver;
    }

    public void selectHammerFilter() {

        FilterPage fp =
                PageFactory.initElements(
                        driver,
                        FilterPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        wait.waitForElementClickable(
                        fp.hammerCheckbox)
                .click();
    }

    public int getFilteredProductCount() {

        FilterPage fp =
                PageFactory.initElements(
                        driver,
                        FilterPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        wait.waitForElementVisible(
                fp.productList.getFirst());

        return fp.productList.size();
    }

    public void movePriceSlider() {

        FilterPage fp =
                PageFactory.initElements(
                        driver,
                        FilterPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        Actions actions =
                new Actions(driver);

        actions.dragAndDropBy(
                        wait.waitForElementVisible(
                                fp.maxPriceSlider),
                        -80,
                        0)
                .perform();

        System.out.println(
                "Price Slider Moved Successfully");
    }
}