package cybersport.helper;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverContainer {


    public static WebDriver getDriver() {
        WebDriver driver;
        Browsers browsers = Browsers.valueOf(System.getProperty("browser", "chrome"));

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setPlatform(Platform.WINDOWS);

        switch (browsers) {
            case firefox -> driver = new FirefoxDriver();
            case ie -> {
                EdgeOptions options1 = new EdgeOptions();
                options1.addArguments("--remote-allow-origins=*");
                driver = new EdgeDriver(options1);
            }
            default -> {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                caps.setBrowserName(Browser.CHROME.browserName());
            }
        }
        try {
            driver = new RemoteWebDriver(new URL("http://192.168.1.102:4444/wd/hub"),caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().window().maximize();

        return driver;
    }
}
