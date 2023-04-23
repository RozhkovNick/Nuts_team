package pageObject.loginPage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import pageObject.helperr.Browsers;
import pageObject.helperr.WebDriverContainer;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BeforeAndAfter {
    protected Logger LOG = Logger.getLogger(String.valueOf(BeforeAndAfter.class));
   public WebDriver driver;

    @BeforeMethod(description = "Вход на сайт")
    public  void beforeTest(){
        Browsers browser = Browsers.valueOf (System.getProperty("browser","chrome"));
        switch (browser){
            case chrome : driver = WebDriverContainer.getDriver();break;
            case firefox: driver = new FirefoxDriver();break;
            case ie: driver = new EdgeDriver();break;
        }
        driver.get("https://www.cybersport.ru/");
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterTest(description = "Закрываем браузер")
    public void afterTest() {
        driver.quit();
    }
}
