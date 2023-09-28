package cybersport.page.mainpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FooterMainPage {
    private WebDriver driver;
    WebDriverWait wait;
    private final By buttonVK = By.cssSelector("[href='https://vk.com/cybersportru']");
    private final By buttonTelegram = By.cssSelector("[href='#i-socials__tg']");
    private final By buttonXml = By.cssSelector("[href='#i-socials__rss']");
    private final By buttonAboutUs = By.cssSelector(".links_Ny7fs :first-child");
    private final By textAboutUs = By.cssSelector(".page-title");
    private final By buttonDocument = By.cssSelector(".links_Ny7fs :nth-child(2)");
    private final By textDocument = By.cssSelector(".page-title");
    private final String initialWindow;

    public FooterMainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        initialWindow = driver.getWindowHandle();
    }

    public void clickVKButton() {
        driver.findElement(buttonVK).click();
    }

    public void switchWindow() {
        String newTabHandle = driver.getWindowHandles().toArray()[1].toString();
        driver.switchTo().window(newTabHandle);
    }

    public String checkURL() {
        String url = driver.getCurrentUrl();
        driver.close();
        driver.switchTo().window(initialWindow);
        return url;
    }

    public void clickTelegramButton() {
        driver.findElement(buttonTelegram).click();
    }

    public void clickXmlButton() {
        driver.findElement(buttonXml).click();
    }

    public void clickAboutUsButton() {
        driver.findElement(buttonAboutUs).click();
    }

    public void clickDocumentButton() {
        driver.findElement(buttonDocument).click();
    }

    public String checkTextAboutUsPage() {
        String text = driver.findElement(textAboutUs).getText();
        return text;
    }

    public String checkTextDocumentPage() {
        String text = driver.findElement(textDocument).getText();
        return text;
    }
}
