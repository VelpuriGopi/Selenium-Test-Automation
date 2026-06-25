package Framework.Utility;

import Framework.Elements.SearchResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchResultMethods {

    WebDriver driver;

    public SearchResultMethods(WebDriver driver) {

        this.driver = driver;
    }

    public boolean isProductPresent(String expectedProduct) {

        SearchResultPage sr =
                PageFactory.initElements(
                        driver,
                        SearchResultPage.class);

        for (WebElement product : sr.productNames) {

            if (product.getText().trim()
                    .equalsIgnoreCase(expectedProduct)) {

                return true;
            }
        }

        return false;
    }
}