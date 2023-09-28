package cybersport.page.mainpage;

import org.openqa.selenium.*;

public class HeaderOneLineMainPage {
    private WebDriver driver;
    private final By homePageButton = By.className("logo_u0Je5");
    private final By textHomePage = By.cssSelector(".widget-title.title_k01HS");
    private final By matchesPageButton = By.cssSelector("[href='/matches']");
    private final By tournamentPageButton = By.cssSelector("[href='/tournaments']");
    private final By teamsPageButton = By.cssSelector("[href='/teams']");
    private final By blogsPageButton = By.cssSelector("[href='/blog']");
    private final By gamesPageButton = By.cssSelector("[href='/games']");
    private final By pageTitle = By.className("page-title");
    private final By searchButton = By.cssSelector("[type='button'][class='action_tl-RG']");
    private final By searchString = By.cssSelector(".input_VpfrS");
    private final By textInvalidSearch = By.cssSelector(".empty-message.empty_5gFLL");

    public HeaderOneLineMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchIcon() {
        driver.findElement(searchButton).click();
    }

    public void searchStringIsVisible() {
        driver.findElement(searchString).isDisplayed();
    }

    public String checkTextInvalidSearch() {
        String text = driver.findElement(textInvalidSearch).getText();
        return text;
    }

    public void searchString(String a) {
        driver.findElement(searchString).sendKeys(a);
        driver.findElement(searchString).sendKeys(Keys.ENTER);
    }

    public void clickHomePage() {
        driver.findElement(homePageButton).click();
    }

    public String checkTextHomePage() {
        String text = driver.findElement(textHomePage).getText();
        return text;
    }

    public void clickMatchesPage() {
        driver.findElement(matchesPageButton).click();
    }

    public String checkTitleTextPage() {
        String text = driver.findElement(pageTitle).getText();
        return text;
    }

    public void clickTournamentPage() {
        driver.findElement(tournamentPageButton).click();
    }

    public void clickTeamsPage() {
        driver.findElement(teamsPageButton).click();
    }

    public void clickBlogsPage() {
        driver.findElement(blogsPageButton).click();
    }

    public void clickGamesPage() {
        driver.findElement(gamesPageButton).click();
    }
}
