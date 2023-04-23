package pageObject.footer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Logger;

public class Footer {
    private WebDriver driver;
    WebDriverWait wait;

    private By buttonVK = By.cssSelector("[href='https://vk.com/cybersportru']");
    private By buttonTelegram = By.cssSelector("[href='#i-socials__tg']");
    private By buttonXml = By.cssSelector("[href='#i-socials__rss']");

    private By buttonAboutUs = By.cssSelector(".links_Ny7fs :first-child");
    private By textAboutUs = By.cssSelector(".page-title");
    private By buttonDocument = By.cssSelector(".links_Ny7fs :nth-child(2)");
    private By textDocument = By.cssSelector(".page-title");
    private String initialWindow;

    public Footer(WebDriver driver) {
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
        String urlVk = driver.getCurrentUrl();
        driver.close();
        driver.switchTo().window(initialWindow);
        return urlVk;
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

    public String checkTextAboutUsPage() {
        String text = driver.findElement(textAboutUs).getText();
        return text;
    }

    public void clickDocumentButton() {
        driver.findElement(buttonDocument).click();
    }

    public String checkTextDocumentPage() {
        String text = driver.findElement(textDocument).getText();
        return text;
    }
}
