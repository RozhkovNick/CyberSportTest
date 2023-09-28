package cybersport.page.mainpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderTwoLineMainPage {
    private WebDriver driver;
    private final By dotaTwoButton = By.cssSelector("[href='/tags/dota-2'][class='link_SMfCY']");
    private final By cs_goButton = By.cssSelector("[href='/tags/cs-go'][class='link_SMfCY']");
    private final By stillButton = By.xpath("//li[3]/div");
    private final By leagueOfLegendsButton = By.cssSelector("[href='/tags/league-of-legends'][class='link_SMfCY']");
    private final By warcraftThreeButton = By.cssSelector("[href='/tags/warcraft-iii'][class='link_SMfCY']");
    private final By rainbowSixSiegeButton = By.cssSelector("[href='/tags/rainbow-six-siege'][class='link_SMfCY']");
    private final By pubgButton = By.cssSelector("[href='/tags/pubg'][class='link_SMfCY']");
    private final By fortniteButton = By.cssSelector("[href='/tags/fortnite'][class='link_SMfCY']");
    private final By apexLegendsButton = By.cssSelector("[href='/tags/apex-legends'][class='link_SMfCY']");
    private final By valorantButton = By.cssSelector("[href='/tags/valorant'][class='link_SMfCY']");
    private final By overwatchButton = By.cssSelector("[href='/tags/overwatch'][class='link_SMfCY']");
    private final By hearthstoneButton = By.cssSelector("[href='/tags/hearthstone'][class='link_SMfCY']");
    private final By fifaButton = By.cssSelector("[href='/tags/fifa'][class='link_SMfCY']");
    private final By free_fireButton = By.cssSelector("[href='/tags/free-fire'][class='link_SMfCY']");
    private final By warfaceButton = By.cssSelector("[href='/tags/warface'][class='link_SMfCY']");
    private final By starcraftTwoButton = By.cssSelector("[href='/tags/starcraft-2'][class='link_SMfCY']");
    private final By heroesOfTheStormButton = By.cssSelector("[href='/tags/heroes-of-the-storm'][class='link_SMfCY']");
    private final By quakeChampionsButton = By.cssSelector("[href='/tags/quake-champions'][class='link_SMfCY']");
    private final By dotaUnderlordsButton = By.cssSelector("[href='/tags/dota-underlords'][class='link_SMfCY']");
    private final By forecastButton = By.cssSelector("[href='/tags/bets']");
    private final By cosplayButton = By.cssSelector("[href='/tags/cosplay'][class='link_SMfCY']");
    private final By pageTitle = By.className("page-title");

    public HeaderTwoLineMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public String checkTitleTextPage() {
        String text = driver.findElement(pageTitle).getText();
        return text;
    }

    public void clickDotaTwoButtonPage() {
        driver.findElement(dotaTwoButton).click();
    }

    public void clickCsGoButtonPage() {
        driver.findElement(cs_goButton).click();
    }

    public void clickLeagueOfLegendsButtonPage() {
        driver.findElement(stillButton).click();
        driver.findElement(leagueOfLegendsButton).click();
    }

    public void clickWarcraftThreeButtonPage() {
        driver.findElement(stillButton).click();
        driver.findElement(warcraftThreeButton).click();
    }

    public void clickRainbowSixSiegeButtonPage() {
        driver.findElement(stillButton).click();
        driver.findElement(rainbowSixSiegeButton).click();
    }

    public void clickPUBGButtonPage() {
        driver.findElement(stillButton).click();
        driver.findElement(pubgButton).click();
    }

    public void clickFortnitePage() {
        driver.findElement(stillButton).click();
        driver.findElement(fortniteButton).click();
    }

    public void clickApexLegendsPage() {
        driver.findElement(stillButton).click();
        driver.findElement(apexLegendsButton).click();
    }

    public void clickValorantPage() {
        driver.findElement(stillButton).click();
        driver.findElement(valorantButton).click();
    }

    public void clickOverwatchPage() {
        driver.findElement(stillButton).click();
        driver.findElement(overwatchButton).click();
    }

    public void clickHearthstonePage() {
        driver.findElement(stillButton).click();
        driver.findElement(hearthstoneButton).click();
    }

    public void clickFIFAPage() {
        driver.findElement(stillButton).click();
        driver.findElement(fifaButton).click();
    }

    public void clickFreeFirePage() {
        driver.findElement(stillButton).click();
        driver.findElement(free_fireButton).click();
    }

    public void clickWarfacePage() {
        driver.findElement(stillButton).click();
        driver.findElement(warfaceButton).click();
    }

    public void clickStarcraftTwoPage() {
        driver.findElement(stillButton).click();
        driver.findElement(starcraftTwoButton).click();
    }

    public void clickHeroesOfTheStormPage() {
        driver.findElement(stillButton).click();
        driver.findElement(heroesOfTheStormButton).click();
    }

    public void clickQuakeChampionsPage() {
        driver.findElement(stillButton).click();
        driver.findElement(quakeChampionsButton).click();
    }

    public void clickDotaUnderlordsPage() {
        driver.findElement(stillButton).click();
        driver.findElement(dotaUnderlordsButton).click();
    }

    public void clickForecastPage() {
        driver.findElement(stillButton).click();
        driver.findElement(forecastButton).click();
    }

    public void clickCosplayPage() {
        driver.findElement(stillButton).click();
        driver.findElement(cosplayButton).click();
    }
}
