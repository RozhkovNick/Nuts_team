package pageObject;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.footer.BeforeAndAfter;
import pageObject.footer.Footer;
import pageObject.helperr.WebDriverContainer;

public class FooterTest extends BeforeAndAfter {
    Footer footer = new Footer(WebDriverContainer.getDriver());

    @Test
    public void clickButtonVK(){
        LOG.info("Проверяем кнопку Vk");
        footer.clickVKButton();
        footer.switchWindow();
        Assert.assertEquals(footer.checkURL(), "https://vk.com/cybersportru");
    }

    @Test
    public void clickButtonTelegram(){
        LOG.info("Проверяем кнопку Telegram");
        footer.clickTelegramButton();
        footer.switchWindow();
        Assert.assertEquals(footer.checkURL(), "https://t.me/csru_official");

    }

    @Test
    public void clickButtonXml(){
        LOG.info("Проверяем кнопку Xml");
        footer.clickXmlButton();
        footer.switchWindow();
        Assert.assertEquals(footer.checkURL(), "https://www.cybersport.ru/rss/materials");

    }

    @Test
    public void clickButtonAboutUs(){
        LOG.info("Проверяем кнопку о нас");
        footer.clickAboutUsButton();
        Assert.assertEquals(footer.checkTextAboutUsPage(), "О нас");

    }

    @Test
    public void clickButtonDocuments(){
        LOG.info("Проверяем кнопку документы");
        footer.clickDocumentButton();
        Assert.assertEquals(footer.checkTextDocumentPage(), "Документы");

    }
}
