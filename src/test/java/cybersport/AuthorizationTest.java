package cybersport;

import cybersport.helper.ActionFunctionInterface;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cybersport.page.loginPage.LoginPage;

public class AuthorizationTest extends BaseTest {
    private LoginPage loginPage;

    @BeforeMethod
    public void init() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void checkJoinButton() {
        LOG.info("Кликаем на иконку входа на сайт");
        loginPage.clickJoinButton();
        loginPage.checkWindowAuthorizationIsVisible();
    }

    @DataProvider(name = "testAuthorization")
    public Object[][] dpMethod() {
        return new Object[][]{
                {"test_dns@rambler.ru", "123456_Test", (ActionFunctionInterface) () -> loginPage.checkIconIsVisible()},
                {"test_dns@", "123456_Test", (ActionFunctionInterface) () ->
                        Assert.assertEquals(loginPage.authorizationIsError(), "Неверный e-mail или пароль")},
                {"test_dns@rambler.ru", "123456_", (ActionFunctionInterface) () ->
                        Assert.assertEquals(loginPage.authorizationIsError(), "Неверный e-mail или пароль")},
                {" ", "123456_", (ActionFunctionInterface) () ->
                        Assert.assertEquals(loginPage.authorizationIsError(), "Неверный e-mail или пароль")},
                {"test_dns@rambler.ru", " ", (ActionFunctionInterface) () ->
                        Assert.assertEquals(loginPage.authorizationIsError(), "Неверный e-mail или пароль")},
                {"test_dns@rambler.ru", "ASJAD", (ActionFunctionInterface) () ->
                        Assert.assertEquals(loginPage.authorizationIsError(), "Неверный e-mail или пароль")},
                {"тест@grf", "123456_Test", (ActionFunctionInterface) () ->
                        Assert.assertEquals(loginPage.authorizationIsError(), "Неверный e-mail или пароль")},
                {"test_dns@rambler.rudsajdasdljaskdjasdpaskdasdjasds", "123456_Test", (ActionFunctionInterface) () ->
                        Assert.assertEquals(loginPage.authorizationIsError(), "Неверный e-mail или пароль")},
                {"test_dns@", "123456_Testjasdloasdakda;ldasdasdjsds;d'asd;sd'aasdj", (ActionFunctionInterface) () ->
                        Assert.assertEquals(loginPage.authorizationIsError(), "Неверный e-mail или пароль")},
                {" ", " ", (ActionFunctionInterface) () ->
                        Assert.assertEquals(loginPage.authorizationIsError(), "Неверный e-mail или пароль")},
                {":.!", "123456_Test", (ActionFunctionInterface) () ->
                        Assert.assertEquals(loginPage.authorizationIsError(), "Неверный e-mail или пароль")},
                {"test_dns@rambler.ru", ":.!", (ActionFunctionInterface) () ->
                        Assert.assertEquals(loginPage.authorizationIsError(), "Неверный e-mail или пароль")}
        };
    }

    @Test(dataProvider = "testAuthorization", testName = "Проверка авторизации на сайт")
    public void checkJoinSait(String login, String password, ActionFunctionInterface func) {
        LOG.info("Вводим логин и пароль на сайт и авторизуемся");
        loginPage.clickJoinButton();
        loginPage.attemptLogin(login, password);
        func.apply();
    }

    @Test(testName = "Проверка ссылки правила пользования сайтом")
    public void checkLinkTermsUseSite() {
        LOG.info("Кликаем на ссылку Правила пользования сайтом");
        loginPage.clickJoinButton();
        loginPage.clickLinkTermsUseSite();
        loginPage.switchWindow();
        Assert.assertEquals(loginPage.checkURL(), "https://www.cybersport.ru/docs/site_rules.pdf");
    }

    @Test(testName = "Проверка ссылки политика обработки персональных данных Cybersport")
    public void checkLinkPersonalProcessingPolicyCybersport() {
        LOG.info("Кликаем на ссылку Политика обработки персональных данных Cybersport");
        loginPage.clickJoinButton();
        loginPage.clickLinkPersonalProcessingPolicyCybersport();
        loginPage.switchWindow();
        Assert.assertEquals(loginPage.checkURL(), "https://www.cybersport.ru/docs/privacy_policy.pdf");
    }

    @Test(testName = "Проверка ссылки политика обработки персональных данных Goggle")
    public void checkLinkPersonalProcessingPolicyGoggle() {
        LOG.info("Кликаем на ссылку Политика обработки персональных данных Goggle");
        loginPage.clickJoinButton();
        loginPage.clickLinkPersonalProcessingPolicyGoogle();
        loginPage.switchWindow();
        Assert.assertEquals(loginPage.checkURL(), "https://policies.google.com/privacy");
    }

    @Test(testName = "Проверка ссылки Условия работы")
    public void checkLinkWorkingConditions() {
        LOG.info("Кликаем на ссылку условия работы Goggle");
        loginPage.clickJoinButton();
        loginPage.clickLinkWorkingConditions();
        loginPage.switchWindow();
        Assert.assertEquals(loginPage.checkURL(), "https://policies.google.com/terms");
    }
}
