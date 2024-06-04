package product;

import core.BaseSeleniumTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleSeleniumTest extends BaseSeleniumTest {

    private final static String SEARCH_STRING = "junit";
    private final static String EXPECTED_SEARCH_RESULT = "JUnit Vintage Engine";

    @Test
    public void checkSearch() {

        MainSeleniumPage mainPage = new MainSeleniumPage();
        SearchResultsPage searchResultsPage = mainPage.searchFor(SEARCH_STRING);
        searchResultsPage.checkSearchResults(EXPECTED_SEARCH_RESULT);
    }


}
