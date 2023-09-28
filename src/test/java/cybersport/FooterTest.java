package cybersport;

import cybersport.helper.ActionFunctionInterface;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cybersport.page.mainpage.FooterMainPage;

public class FooterTest extends BaseTest {
    FooterMainPage footer;

    @BeforeMethod
    public void init() {
        footer = new FooterMainPage(driver);
    }

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{
                {"https://vk.com/cybersportru", (ActionFunctionInterface) () -> footer.clickVKButton()},
                {"https://t.me/csru_official", (ActionFunctionInterface) () -> footer.clickTelegramButton()},
                {"https://www.cybersport.ru/rss/materials", (ActionFunctionInterface) () -> footer.clickXmlButton()}};
    }

    @Test(dataProvider = "data-provider", testName = "Проверка перехода на ссылку")
    public void checkButtonHref(String href, ActionFunctionInterface func) {
        func.apply();
        footer.switchWindow();
        Assert.assertEquals(footer.checkURL(), href);
    }

    @Test
    public void clickButtonAboutUs() {
        LOG.info("Проверяем кнопку о нас");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 1500)");
        footer.clickAboutUsButton();
        Assert.assertEquals(footer.checkTextAboutUsPage(), "О нас");
    }

    @Test
    public void clickButtonDocuments() {
        LOG.info("Проверяем кнопку документы");
        footer.clickDocumentButton();
        Assert.assertEquals(footer.checkTextDocumentPage(), "Документы");
    }
}
