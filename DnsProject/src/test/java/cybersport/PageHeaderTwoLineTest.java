package cybersport;

import org.testng.Assert;
import org.testng.annotations.Test;
import cybersport.page.mainpage.HeaderTwoLineMainPage;
import cybersport.helper.WebDriverContainer;

public class PageHeaderTwoLineTest extends BaseTest {
    @Test
    public void clickDotaTwoPageTest(){
        LOG.info("Проверяем кнопку Dota 2");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickDotaTwoButtonPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Dota 2");
    }
    @Test
    public void clickCsGoPageTest(){
        LOG.info("Проверяем кнопку CS:GO");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickCsGoButtonPage();
        Assert.assertEquals(header.checkTitleTextPage(),"CS:GO");
    }
    @Test
    public void clickLeagueOfLegendsPageTest(){
        LOG.info("Проверяем кнопку League of Legends");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickLeagueOfLegendsButtonPage();
        Assert.assertEquals(header.checkTitleTextPage(),"League of Legends");
    }
    @Test
    public void clickWarcraftThreePageTest(){
        LOG.info("Проверяем кнопку Warcraft III");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickWarcraftThreeButtonPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Warcraft III");
    }
    @Test
    public void clickRainbowSixSiegePageTest(){
        LOG.info("Проверяем кнопку Rainbow Six Siege");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickRainbowSixSiegeButtonPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Rainbow Six Siege");
    }
    @Test
    public void clickPUBGBPageTest(){
        LOG.info("Проверяем кнопку PUBG");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickPUBGButtonPage();
        Assert.assertEquals(header.checkTitleTextPage(),"PUBG");
    }
    @Test
    public void clickFortnitePageTest(){
        LOG.info("Проверяем кнопку Fortnite");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickFortnitePage();
        Assert.assertEquals(header.checkTitleTextPage(),"Fortnite");
    }
    @Test
    public void clickApexLegendsPageTest(){
        LOG.info("Проверяем кнопку Apex Legends");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickApexLegendsPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Apex Legends");
    }
    @Test
    public void clickValorantPageTest(){
        LOG.info("Проверяем кнопку Valorant");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickValorantPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Valorant");
    }
    @Test
    public void clickOverwatchPageTest(){
        LOG.info("Проверяем кнопку Overwatch");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickOverwatchPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Overwatch");
    }
    @Test
    public void clickHearthstonePageTest(){
        LOG.info("Проверяем кнопку Hearthstone");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickHearthstonePage();
        Assert.assertEquals(header.checkTitleTextPage(),"Hearthstone");
    }
    @Test
    public void clickFIFAPageTest(){
        LOG.info("Проверяем кнопку FIFA");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickFIFAPage();
        Assert.assertEquals(header.checkTitleTextPage(),"FIFA");
    }
    @Test
    public void clickFreeFirePageTest(){
        LOG.info("Проверяем кнопку Free Fire");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickFreeFirePage();
        Assert.assertEquals(header.checkTitleTextPage(),"Free Fire");
    }
    @Test
    public void clickWarfacePageTest(){
        LOG.info("Проверяем кнопку Warface");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickWarfacePage();
        Assert.assertEquals(header.checkTitleTextPage(),"Warface");
    }
    @Test
    public void clickStarcraftPageTest(){
        LOG.info("Проверяем кнопку StarCraft 2");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickStarcraftTwoPage();
        Assert.assertEquals(header.checkTitleTextPage(),"StarCraft 2");
    }
    @Test
    public void clickHeroesOfTheStormPageTest(){
        LOG.info("Проверяем кнопку Heroes of the Storm");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickHeroesOfTheStormPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Heroes of the Storm");
    }
    @Test
    public void clickQuakeChampionsPageTest(){
        LOG.info("Проверяем кнопку Quake Champions");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickQuakeChampionsPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Quake Champions");
    }
    @Test
    public void clickDotaUnderlordsPageTest(){
        LOG.info("Проверяем кнопку Dota Underlords");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickDotaUnderlordsPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Dota Underlords");
    }
    @Test
    public void clickForecastPageTest(){
        LOG.info("Проверяем кнопку прогнозы");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickForecastPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Ставки и прогнозы");
    }
    @Test
    public void clickMoviesPageTest(){
        LOG.info("Проверяем кнопку Фильмы");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickMoviesPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Фильмы");
    }
    @Test
    public void clickCosplayPageTest(){
        LOG.info("Проверяем кнопку Косплей");
        HeaderTwoLineMainPage header = new HeaderTwoLineMainPage(WebDriverContainer.getDriver());
        header.clickCosplayPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Косплей");
    }

}
