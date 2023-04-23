package pageObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.helperr.WebDriverContainer;
import pageObject.Header.BeforeAndAfter;
import pageObject.Header.Header;

public class PageHeaderTest extends BeforeAndAfter{
    @Test
    public void clickHomePageTest(){
        LOG.info("Проверяем кнопку главной страницы");
        Header header = new Header(WebDriverContainer.getDriver());
        header.clickHomePage();
        Assert.assertEquals(header.checkTextHomePage(),"Главные новости");
    }
    @Test
    public void clickMatchesPageTest(){
        LOG.info("Проверяем кнопку Матчи");
        Header header = new Header(WebDriverContainer.getDriver());
        header.clickMatchesPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Матчи");
    }
    @Test
    public void clickTournamentsPageTest(){
        LOG.info("Проверяем кнопку Турниры");
        Header header = new Header(WebDriverContainer.getDriver());
        header.clickTournamentPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Турниры");
    }
    @Test
    public void clickTeamsPageTest(){
        LOG.info("Проверяем кнопку Команды");
        Header header = new Header(WebDriverContainer.getDriver());
        header.clickTeamsPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Команды");
    }
    @Test
    public void clickBlogsPageTest(){
        LOG.info("Проверяем кнопку Блоги");
        Header header = new Header(WebDriverContainer.getDriver());
        header.clickBlogsPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Блоги");
    }
    @Test
    public void clickGamesPageTest(){
        LOG.info("Проверяем кнопку Игры");
        Header header = new Header(WebDriverContainer.getDriver());
        header.clickGamesPage();
        Assert.assertEquals(header.checkTitleTextPage(),"Игры");
    }
    @Test
    public void searchIconTest(){
        LOG.info("Проверяем кнопку Поиск");
        Header header = new Header(WebDriverContainer.getDriver());
        header.searchIcon();
        header.searchStringIsVisible();
    }
    @Test
    public void searchStringValidTest(){
        LOG.info("Проверяем строку поиска по сайту");
        Header header = new Header(WebDriverContainer.getDriver());
        String text = "virtus";
        header.searchIcon();
        header.searchString(text);
        Assert.assertEquals(header.checkTitleTextPage(), "Результаты: "+text);
    }
    @Test
    public void searchStringInvalidTest(){
        LOG.info("Проверяем строку поиска по сайту при невалидном значении строки");
        Header header = new Header(WebDriverContainer.getDriver());
        String text = "12345";
        header.searchIcon();
        header.searchString(text);
        Assert.assertEquals(header.checkTextInvalidSearch(),"По вашему запросу ничего не найдено");
    }
}
