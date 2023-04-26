package cybersport;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import cybersport.helper.WebDriverContainer;
import cybersport.page.loginPage.LoginPage;

public class MainTest extends BaseTest{
   private LoginPage loginPage;
   @BeforeMethod
   public void init(){
      loginPage = new LoginPage(driver);
   }
   @Test
    public void checkJoinButton() {
       LOG.info("Кликаем на иконку входа на сайт");
       loginPage.clickJoinButton();
       loginPage.checkWindowAuthorizationIsVisible();
   }
   @Test
    public void checkJoinWithPassword(){
       LOG.info("Вводим логин и пароль на сайт и авторизуемся");
      loginPage.clickJoinButton();
      loginPage.attemptLogin();
      loginPage.checkIconIsVisible();
   }
   @Test
   public void checkJoinWithInvalidLoginAndPassword(){
      LOG.info("Вводим неверный логин и пароль на сайт и авторизуемся");
      loginPage.clickJoinButton();
      loginPage.attemptInvalidLoginAndPassword();
      Assert.assertEquals(loginPage.authorizationIsError(),"Неверный e-mail или пароль");
   }
   @Test
   public void checkJoinWithInvalidLogin(){
      LOG.info("Вводим неверный логин на сайт и авторизуемся");
      loginPage.clickJoinButton();
      loginPage.attemptInvalidLogin();
      Assert.assertEquals(loginPage.authorizationIsError(),"Неверный e-mail или пароль");
   }
   @Test
   public void checkJoinWithInvalidPassword(){
      LOG.info("Вводим неверный пароль на сайт и авторизуемся");
      loginPage.clickJoinButton();
      loginPage.attemptInvalidPassword();
      Assert.assertEquals(loginPage.authorizationIsError(),"Неверный e-mail или пароль");
   }
}
