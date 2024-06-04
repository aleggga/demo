package product;

import core.BaseSeleniumPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage extends BaseSeleniumPage {


    @FindBy(css = "ul[data-testid='eventList']>li div:nth-child(2)>span>span")
    private List<WebElement> searchResultNames;


    public List<WebElement> getSearchResults() {
        return searchResultNames;
    }


    public SearchResultsPage checkSearchResults(String expectedResult) {
        Assertions.assertTrue(
                getSearchResults().stream()
                        .filter(s -> s.getText().contains(expectedResult))
                        .findFirst()
                        .orElse(null) != null);

        return this;
    }
}
