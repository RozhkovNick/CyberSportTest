package cybersport;

import cybersport.page.mainpage.MatchesPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MatchesTest extends BaseTest {
    private MatchesPage matchesPage;

    @BeforeMethod
    public void init() {
        matchesPage = new MatchesPage(driver);
    }

    @Test
    public void checkJoinMatchesPage() {
        LOG.info("Кликаем на кнопку Все матчи");
        matchesPage.clickButtonAllMatches();
        Assert.assertEquals(matchesPage.checkTitleTextPage(), "Матчи");
    }
}
