package product;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainSelenidePage {

    public MainSelenidePage(String url) {
        Selenide.open(url);
    }
    private final SelenideElement searchInput = $x("//.,f");
    private final ElementsCollection results = $$x("wfsdf");

    public MainSelenidePage search() {
        searchInput.sendKeys("sdf");
        searchInput.submit();

        return this;
    }

    public String getFirstResult() {
        return results.first().getText();
    }
}
