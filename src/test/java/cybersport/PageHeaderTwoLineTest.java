package cybersport;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import cybersport.page.mainpage.HeaderTwoLineMainPage;

public class PageHeaderTwoLineTest extends BaseTest {
    HeaderTwoLineMainPage header;

    @BeforeMethod
    public void init() {
        header = new HeaderTwoLineMainPage(driver);
    }

    @Test
    public void checkDotaTwoPageTest() {
        LOG.info("Проверяем кнопку Dota 2");
        header.clickDotaTwoButtonPage();
        Assert.assertEquals(header.checkTitleTextPage(), "Dota 2");
    }

    @Test
    public void checkCsGoPageTest() {
        LOG.info("Проверяем кнопку CS:GO");
        header.clickCsGoButtonPage();
        Assert.assertEquals(header.checkTitleTextPage(), "CS:GO");
    }

    @Test
    public void checkLeagueOfLegendsPageTest() {
        LOG.info("Проверяем кнопку League of Legends");
        header.clickLeagueOfLegendsButtonPage();
        Assert.assertEquals(header.checkTitleTextPage(), "League of Legends");
    }

    @Test
    public void checkWarcraftThreePageTest() {
        LOG.info("Проверяем кнопку Warcraft III");
        header.clickWarcraftThreeButtonPage();
        Assert.assertEquals(header.checkTitleTextPage(), "Warcraft III");
    }

    @Test
    public void checkRainbowSixSiegePageTest() {
        LOG.info("Проверяем кнопку Rainbow Six Siege");
        header.clickRainbowSixSiegeButtonPage();
        Assert.assertEquals(header.checkTitleTextPage(), "Rainbow Six Siege");
    }

    @Test
    public void checkPUBGBPageTest() {
        LOG.info("Проверяем кнопку PUBG");
        header.clickPUBGButtonPage();
        Assert.assertEquals(header.checkTitleTextPage(), "PUBG");
    }

    @Test
    public void checkFortnitePageTest() {
        LOG.info("Проверяем кнопку Fortnite");
        header.clickFortnitePage();
        Assert.assertEquals(header.checkTitleTextPage(), "Fortnite");
    }

    @Test
    public void checkApexLegendsPageTest() {
        LOG.info("Проверяем кнопку Apex Legends");
        header.clickApexLegendsPage();
        Assert.assertEquals(header.checkTitleTextPage(), "Apex Legends");
    }

    @Test
    public void checkValorantPageTest() {
        LOG.info("Проверяем кнопку Valorant");
        header.clickValorantPage();
        Assert.assertEquals(header.checkTitleTextPage(), "Valorant");
    }

    @Test
    public void checkOverwatchPageTest() {
        LOG.info("Проверяем кнопку Overwatch");
        header.clickOverwatchPage();
        Assert.assertEquals(header.checkTitleTextPage(), "Overwatch");
    }

    @Test
    public void checkHearthstonePageTest() {
        LOG.info("Проверяем кнопку Hearthstone");
        header.clickHearthstonePage();
        Assert.assertEquals(header.checkTitleTextPage(), "Hearthstone");
    }

    @Test
    public void checkFIFAPageTest() {
        LOG.info("Проверяем кнопку FIFA");
        header.clickFIFAPage();
        Assert.assertEquals(header.checkTitleTextPage(), "FIFA");
    }

    @Test
    public void checkFreeFirePageTest() {
        LOG.info("Проверяем кнопку Free Fire");
        header.clickFreeFirePage();
        Assert.assertEquals(header.checkTitleTextPage(), "Free Fire");
    }

    @Test
    public void checkWarfacePageTest() {
        LOG.info("Проверяем кнопку Warface");
        header.clickWarfacePage();
        Assert.assertEquals(header.checkTitleTextPage(), "Warface");
    }

    @Test
    public void checkStarcraftPageTest() {
        LOG.info("Проверяем кнопку StarCraft 2");
        header.clickStarcraftTwoPage();
        Assert.assertEquals(header.checkTitleTextPage(), "StarCraft 2");
    }

    @Test
    public void checkHeroesOfTheStormPageTest() {
        LOG.info("Проверяем кнопку Heroes of the Storm");
        header.clickHeroesOfTheStormPage();
        Assert.assertEquals(header.checkTitleTextPage(), "Heroes of the Storm");
    }

    @Test
    public void checkQuakeChampionsPageTest() {
        LOG.info("Проверяем кнопку Quake Champions");
        header.clickQuakeChampionsPage();
        Assert.assertEquals(header.checkTitleTextPage(), "Quake Champions");
    }

    @Test
    public void checkDotaUnderlordsPageTest() {
        LOG.info("Проверяем кнопку Dota Underlords");
        header.clickDotaUnderlordsPage();
        Assert.assertEquals(header.checkTitleTextPage(), "Dota Underlords");
    }

    @Test
    public void checkForecastPageTest() {
        LOG.info("Проверяем кнопку прогнозы");
        header.clickForecastPage();
        Assert.assertEquals(header.checkTitleTextPage(), "Ставки и прогнозы");
    }

    @Test
    public void checkCosplayPageTest() {
        LOG.info("Проверяем кнопку Косплей");
        header.clickCosplayPage();
        Assert.assertEquals(header.checkTitleTextPage(), "Косплей");
    }
}
