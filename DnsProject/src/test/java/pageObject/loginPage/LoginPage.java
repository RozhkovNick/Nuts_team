package pageObject.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private WebDriver driver;
    private By buttonJoinToSite = By.cssSelector("[class='button_MRo+t desktopOnly_w-2LU']");
    @FindBy(css = "#__layout > div > div.vue-portal-target > div > div > div:nth-child(3) > div:nth-child(2) > form > div:nth-child(2) > label > input")
    private WebElement inputLogin;
    @FindBy(css = "[type='password']")
    private WebElement inputPassword;
    @FindBy(css = "[class='button_+fnen type-orange_vubji button_62Kp9']")
    private WebElement buttonJoin;
    private By iconAccount = By.cssSelector(".action_tl-RG.actionAccount_5BORL");
    private By windowAuthorization = By.cssSelector(".container_56Rl5");
    private By invalidLoginAndPassword = By.xpath("//form/div[3]/div");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickJoinButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(buttonJoinToSite))
                .click()
                .build()
                .perform();
    }
    public void checkWindowAuthorizationIsVisible(){
        driver.findElement(windowAuthorization).isDisplayed();
    }

    private void setLogin(String login) {
        inputLogin.sendKeys(login);
    }

    private void setPassword(String password) {
        inputPassword.sendKeys(password);
    }

    private void clickLoginButton() {
        buttonJoin.click();
    }

    public void attemptLogin() {
        setLogin("test_dns@rambler.ru");
        setPassword("123456_Test");
        clickLoginButton();
    }
    public void attemptInvalidLoginAndPassword() {
        setLogin("qwerty");
        setPassword("12345");
        clickLoginButton();
    }
    public void attemptInvalidLogin() {
        setLogin("qwerty");
        setPassword("123456_Test");
        clickLoginButton();
    }
    public void attemptInvalidPassword() {
        setLogin("test_dns@rambler.ru");
        setPassword("12345");
        clickLoginButton();
    }
    public String authorizationIsError(){
       String text = driver.findElement(invalidLoginAndPassword).getText();
        return text;
    }
    public void checkIconIsVisible(){
        driver.findElement(iconAccount).isDisplayed();
    }
}
//form > div:nth-child(3) > div   неверный логин
