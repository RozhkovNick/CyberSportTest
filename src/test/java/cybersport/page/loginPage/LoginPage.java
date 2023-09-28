package cybersport.page.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
    private WebDriver driver;
    private final By buttonJoinToSite = By.cssSelector("[class='button_MRo+t desktopOnly_w-2LU']");
    private final By inputLogin = By.cssSelector("#__layout > div > div.vue-portal-target > div > div > div:nth-child(3) > div:nth-child(2) > form > div:nth-child(2) > label > input");
    private final By inputPassword = By.cssSelector("[type='password']");
    private final By buttonJoin = By.cssSelector("[class='button_+fnen type-orange_vubji button_62Kp9']");
    private final By iconAccount = By.cssSelector(".action_tl-RG.actionAccount_5BORL");
    private final By windowAuthorization = By.cssSelector(".container_56Rl5");
    private final By invalidLoginAndPassword = By.xpath("//form/div[3]/div");
    private final String initialWindow;
    private final By termsUseSite = By.cssSelector("[href='/docs/site_rules.pdf']");
    private final By personalProcessingPolicyCybersport = By.cssSelector("[href='/docs/privacy_policy.pdf']");
    private final By personalProcessingPolicyGoogle = By.cssSelector("[href='https://policies.google.com/privacy']");
    private final By workingConditions = By.cssSelector("[href='https://policies.google.com/terms']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        initialWindow = driver.getWindowHandle();
    }

    public void clickJoinButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(buttonJoinToSite))
                .click()
                .build()
                .perform();
    }

    private void setLogin(String login) {
        driver.findElement(inputLogin).sendKeys(login);
    }

    private void setPassword(String password) {
        driver.findElement(inputPassword).sendKeys(password);
    }

    private void clickLoginButton() {
        driver.findElement(buttonJoin).click();
    }

    public void attemptLogin(String login, String password) {
        setLogin(login);
        setPassword(password);
        clickLoginButton();
    }

    public void checkWindowAuthorizationIsVisible() {
        driver.findElement(windowAuthorization).isDisplayed();
    }

    public void checkIconIsVisible() {
        driver.findElement(iconAccount).isDisplayed();
    }

    public String authorizationIsError() {
        return driver.findElement(invalidLoginAndPassword).getText();
    }

    public void clickLinkTermsUseSite() {
        driver.findElement(termsUseSite).click();
    }

    public void clickLinkPersonalProcessingPolicyCybersport() {
        driver.findElement(personalProcessingPolicyCybersport).click();
    }

    public void clickLinkPersonalProcessingPolicyGoogle() {
        driver.findElement(personalProcessingPolicyGoogle).click();
    }

    public void clickLinkWorkingConditions() {
        driver.findElement(workingConditions).click();
    }

    public String checkURL() {
        String url = driver.getCurrentUrl();
        driver.close();
        driver.switchTo().window(initialWindow);
        return url;
    }

    public void switchWindow() {
        String newTabHandle = driver.getWindowHandles().toArray()[1].toString();
        driver.switchTo().window(newTabHandle);
    }

}
