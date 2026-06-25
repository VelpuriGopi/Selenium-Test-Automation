package Framework.Utility;

import Framework.Elements.SortPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SortMethods {

    WebDriver driver;

    public SortMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void sortByPriceHighToLow() {

        SortPage sp =
                PageFactory.initElements(
                        driver,
                        SortPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        Select sort =
                new Select(
                        wait.waitForElementVisible(
                                sp.sortDropdown));

        sort.selectByVisibleText(
                "Price (High - Low)");

        System.out.println(
                "Sorted By Price High To Low");
    }
}