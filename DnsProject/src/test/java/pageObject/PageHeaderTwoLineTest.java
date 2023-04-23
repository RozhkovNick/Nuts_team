package pageObject;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.headerTwoLine.BeforeAndAfter;
import pageObject.headerTwoLine.HeaderTwoLine;
import pageObject.helperr.WebDriverContainer;

public class PageHeaderTwoLineTest extends BeforeAndAfter {
    @Test
    public void clickDotaTwoPageTest(){
        LOG.info("Проверяем кнопку Dota 2");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickDotaTwoButtonPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Dota 2");
    }
    @Test
    public void clickCsGoPageTest(){
        LOG.info("Проверяем кнопку CS:GO");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickCsGoButtonPage();
        Assert.assertEquals(header.checkTitleTextPage(),"CS:GO");
    }
    @Test
    public void clickLeagueOfLegendsPageTest(){
        LOG.info("Проверяем кнопку League of Legends");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickLeagueOfLegendsButtonPage();
        Assert.assertEquals(header.checkTitleTextPage(),"League of Legends");
    }
    @Test
    public void clickWarcraftThreePageTest(){
        LOG.info("Проверяем кнопку Warcraft III");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickWarcraftThreeButtonPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Warcraft III");
    }
    @Test
    public void clickRainbowSixSiegePageTest(){
        LOG.info("Проверяем кнопку Rainbow Six Siege");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickRainbowSixSiegeButtonPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Rainbow Six Siege");
    }
    @Test
    public void clickPUBGBPageTest(){
        LOG.info("Проверяем кнопку PUBG");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickPUBGButtonPage();
        Assert.assertEquals(header.checkTitleTextPage(),"PUBG");
    }
    @Test
    public void clickFortnitePageTest(){
        LOG.info("Проверяем кнопку Fortnite");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickFortnitePage();
        Assert.assertEquals(header.checkTitleTextPage(),"Fortnite");
    }
    @Test
    public void clickApexLegendsPageTest(){
        LOG.info("Проверяем кнопку Apex Legends");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickApexLegendsPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Apex Legends");
    }
    @Test
    public void clickValorantPageTest(){
        LOG.info("Проверяем кнопку Valorant");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickValorantPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Valorant");
    }
    @Test
    public void clickOverwatchPageTest(){
        LOG.info("Проверяем кнопку Overwatch");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickOverwatchPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Overwatch");
    }
    @Test
    public void clickHearthstonePageTest(){
        LOG.info("Проверяем кнопку Hearthstone");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickHearthstonePage();
        Assert.assertEquals(header.checkTitleTextPage(),"Hearthstone");
    }
    @Test
    public void clickFIFAPageTest(){
        LOG.info("Проверяем кнопку FIFA");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickFIFAPage();
        Assert.assertEquals(header.checkTitleTextPage(),"FIFA");
    }
    @Test
    public void clickFreeFirePageTest(){
        LOG.info("Проверяем кнопку Free Fire");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickFreeFirePage();
        Assert.assertEquals(header.checkTitleTextPage(),"Free Fire");
    }
    @Test
    public void clickWarfacePageTest(){
        LOG.info("Проверяем кнопку Warface");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickWarfacePage();
        Assert.assertEquals(header.checkTitleTextPage(),"Warface");
    }
    @Test
    public void clickStarcraftPageTest(){
        LOG.info("Проверяем кнопку StarCraft 2");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickStarcraftTwoPage();
        Assert.assertEquals(header.checkTitleTextPage(),"StarCraft 2");
    }
    @Test
    public void clickHeroesOfTheStormPageTest(){
        LOG.info("Проверяем кнопку Heroes of the Storm");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickHeroesOfTheStormPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Heroes of the Storm");
    }
    @Test
    public void clickQuakeChampionsPageTest(){
        LOG.info("Проверяем кнопку Quake Champions");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickQuakeChampionsPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Quake Champions");
    }
    @Test
    public void clickDotaUnderlordsPageTest(){
        LOG.info("Проверяем кнопку Dota Underlords");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickDotaUnderlordsPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Dota Underlords");
    }
    @Test
    public void clickForecastPageTest(){
        LOG.info("Проверяем кнопку прогнозы");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickForecastPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Ставки и прогнозы");
    }
    @Test
    public void clickMoviesPageTest(){
        LOG.info("Проверяем кнопку Фильмы");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickMoviesPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Фильмы");
    }
    @Test
    public void clickCosplayPageTest(){
        LOG.info("Проверяем кнопку Косплей");
        HeaderTwoLine header = new HeaderTwoLine(WebDriverContainer.getDriver());
        header.clickCosplayPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Косплей");
    }

}
