package Framework.Utility;

import Framework.Elements.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchMethods {

    WebDriver driver;

    public SearchMethods(WebDriver driver) {

        this.driver = driver;
    }

    public void searchProduct(String product) {

        SearchPage sp =
                PageFactory.initElements(
                        driver,
                        SearchPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        wait.waitForElementVisible(
                        sp.searchBox)
                .clear();

        wait.waitForElementVisible(
                        sp.searchBox)
                .sendKeys(product);

        wait.waitForElementClickable(
                        sp.searchButton)
                .click();

        System.out.println(
                "Search Button Clicked");
    }
}