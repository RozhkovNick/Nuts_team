package cybersport.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverContainer {


    public static WebDriver getDriver() {
        WebDriver driver;
        Browsers browsers = Browsers.valueOf(System.getProperty("browser", "chrome"));

        switch (browsers) {
            case firefox -> driver = new FirefoxDriver();
            case ie -> driver = new EdgeDriver();
            default -> {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
            }
        }
        driver.manage().window().maximize();

        return driver;
    }
}
