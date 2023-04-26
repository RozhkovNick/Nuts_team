package cybersport;
import org.testng.Assert;
import org.testng.annotations.Test;
import cybersport.helper.WebDriverContainer;
import cybersport.page.mainpage.HeaderOneLineMainPage;

public class PageHeaderTest extends BaseTest{
    @Test
    public void clickHomePageTest(){
        LOG.info("Проверяем кнопку главной страницы");
        HeaderOneLineMainPage header = new HeaderOneLineMainPage(WebDriverContainer.getDriver());
        header.clickHomePage();
        Assert.assertEquals(header.checkTextHomePage(),"Главные новости");
    }
    @Test
    public void clickMatchesPageTest(){
        LOG.info("Проверяем кнопку Матчи");
        HeaderOneLineMainPage header = new HeaderOneLineMainPage(WebDriverContainer.getDriver());
        header.clickMatchesPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Матчи");
    }
    @Test
    public void clickTournamentsPageTest(){
        LOG.info("Проверяем кнопку Турниры");
        HeaderOneLineMainPage header = new HeaderOneLineMainPage(WebDriverContainer.getDriver());
        header.clickTournamentPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Турниры");
    }
    @Test
    public void clickTeamsPageTest(){
        LOG.info("Проверяем кнопку Команды");
        HeaderOneLineMainPage header = new HeaderOneLineMainPage(WebDriverContainer.getDriver());
        header.clickTeamsPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Команды");
    }
    @Test
    public void clickBlogsPageTest(){
        LOG.info("Проверяем кнопку Блоги");
        HeaderOneLineMainPage header = new HeaderOneLineMainPage(WebDriverContainer.getDriver());
        header.clickBlogsPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Блоги");
    }
    @Test
    public void clickGamesPageTest(){
        LOG.info("Проверяем кнопку Игры");
        HeaderOneLineMainPage header = new HeaderOneLineMainPage(WebDriverContainer.getDriver());
        header.clickGamesPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Игры");
    }
    @Test
    public void searchIconTest(){
        LOG.info("Проверяем кнопку Поиск");
        HeaderOneLineMainPage header = new HeaderOneLineMainPage(WebDriverContainer.getDriver());
        header.searchIcon();
        header.searchStringIsVisible();
    }
    @Test
    public void searchStringValidTest(){
        LOG.info("Проверяем строку поиска по сайту");
        HeaderOneLineMainPage header = new HeaderOneLineMainPage(WebDriverContainer.getDriver());
        String text = "virtus";
        header.searchIcon();
        header.searchString(text);
        Assert.assertEquals(header.checkTitleTextPage(), "Результаты: "+text);
    }
    @Test
    public void searchStringInvalidTest(){
        LOG.info("Проверяем строку поиска по сайту при невалидном значении строки");
        HeaderOneLineMainPage header = new HeaderOneLineMainPage(WebDriverContainer.getDriver());
        String text = "12345";
        header.searchIcon();
        header.searchString(text);
        Assert.assertEquals(header.checkTextInvalidSearch(),"По вашему запросу ничего не найдено");
    }
}
