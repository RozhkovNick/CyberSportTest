package cybersport.page.mainpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MatchesPage {
    private WebDriver driver;
    private final By buttonJoinMatches =
            By.xpath("//a[@class='button_+fnen type-bordered_w6rMh' and contains(text(), 'Все матчи')]");
    private final By pageTitle = By.className("page-title");

    public MatchesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonAllMatches() {
        driver.findElement(buttonJoinMatches).click();
    }

    public String checkTitleTextPage() {
        String text = driver.findElement(pageTitle).getText();
        return text;
    }
}
