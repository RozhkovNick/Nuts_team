package cybersport;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import cybersport.helper.WebDriverContainer;
import cybersport.page.loginPage.LoginPage;

public class MainTest extends BaseTest{

   @Test
    public void clickJoinButton() {
       LOG.info("Кликаем на иконку входа на сайт");
       LoginPage loginPage = new LoginPage(WebDriverContainer.getDriver());
       loginPage.clickJoinButton();
       loginPage.checkWindowAuthorizationIsVisible();
   }
   @Test
    public void clickJoinWithPassword(){
       LOG.info("Вводим логин и пароль на сайт и авторизуемся");
       LoginPage factoryPage = PageFactory.initElements(WebDriverContainer.getDriver(),LoginPage.class);
       factoryPage.clickJoinButton();
       factoryPage.attemptLogin();
       factoryPage.checkIconIsVisible();
   }
   @Test
   public void clickJoinWithInvalidLoginAndPassword(){
      LOG.info("Вводим неверный логин и пароль на сайт и авторизуемся");
      LoginPage factoryPage = PageFactory.initElements(WebDriverContainer.getDriver(),LoginPage.class);
      factoryPage.clickJoinButton();
      factoryPage.attemptInvalidLoginAndPassword();
      Assert.assertEquals(factoryPage.authorizationIsError(),"Неверный e-mail или пароль");
   }
   @Test
   public void clickJoinWithInvalidLogin(){
      LOG.info("Вводим неверный логин на сайт и авторизуемся");
      LoginPage factoryPage = PageFactory.initElements(WebDriverContainer.getDriver(),LoginPage.class);
      factoryPage.clickJoinButton();
      factoryPage.attemptInvalidLogin();
      Assert.assertEquals(factoryPage.authorizationIsError(),"Неверный e-mail или пароль");
   }
   @Test
   public void clickJoinWithInvalidPassword(){
      LOG.info("Вводим неверный пароль на сайт и авторизуемся");
      LoginPage factoryPage = PageFactory.initElements(WebDriverContainer.getDriver(),LoginPage.class);
      factoryPage.clickJoinButton();
      factoryPage.attemptInvalidPassword();
      Assert.assertEquals(factoryPage.authorizationIsError(),"Неверный e-mail или пароль");
   }
}
