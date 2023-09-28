package cybersport;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import cybersport.page.mainpage.HeaderOneLineMainPage;

public class PageHeaderTest extends BaseTest{
    HeaderOneLineMainPage header;
    @BeforeMethod
    public void init(){
        header = new HeaderOneLineMainPage(driver);
    }
    @Test
    public void checkHomePageTest(){
        LOG.info("Проверяем кнопку главной страницы");
        header.clickHomePage();
        Assert.assertEquals(header.checkTextHomePage(),"Главные новости");
    }
    @Test
    public void checkMatchesPageTest(){
        LOG.info("Проверяем кнопку Матчи");
        header.clickMatchesPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Матчи");
    }
    @Test
    public void checkTournamentsPageTest(){
        LOG.info("Проверяем кнопку Турниры");
        header.clickTournamentPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Турниры");
    }
    @Test
    public void checkTeamsPageTest(){
        LOG.info("Проверяем кнопку Команды");
        header.clickTeamsPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Команды");
    }
    @Test
    public void checkBlogsPageTest(){
        LOG.info("Проверяем кнопку Блоги");
        header.clickBlogsPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Блоги");
    }
    @Test
    public void checkGamesPageTest(){
        LOG.info("Проверяем кнопку Игры");
        header.clickGamesPage();
        Assert.assertEquals(header.checkTitleTextPage(),"qwertyu");
    }
    @Test
    public void checkSearchIconTest(){
        LOG.info("Проверяем кнопку Поиск");
        header.searchIcon();
        header.searchStringIsVisible();
    }
    @Test
    public void checkSearchStringValidTest(){
        LOG.info("Проверяем строку поиска по сайту");
        String text = "virtus";
        header.searchIcon();
        header.searchString(text);
        Assert.assertEquals(header.checkTitleTextPage(), "Результаты: "+text);
    }
    @Test
    public void checkSearchStringInvalidTest(){
        LOG.info("Проверяем строку поиска по сайту при невалидном значении строки");
        String text = "12345";
        header.searchIcon();
        header.searchString(text);
        Assert.assertEquals(header.checkTextInvalidSearch(),"По вашему запросу ничего не найдено");
    }
}
