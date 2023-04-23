package pageObject.Header;

import org.openqa.selenium.*;


public class Header {
    private WebDriver driver;
    private By homePageButton = By.className("logo_u0Je5");
    private By textHomePage = By.cssSelector(".widget-title.title_k01HS");
    private By matchesPageButton = By.cssSelector("[href='/matches']");
    private By tournamentPageButton = By.cssSelector("[href='/tournaments']");
    private By teamsPageButton = By.cssSelector("[href='/teams']");
    private By blogsPageButton = By.cssSelector("[href='/blog']");
    private By gamesPageButton = By.cssSelector("[href='/games']");
    private By pageTitle = By.className("page-title");
    private By searchButton = By.cssSelector("[type='button'][class='action_tl-RG']");
    private By searchString = By.cssSelector(".input_VpfrS");
    private By textInvalidSearch = By.cssSelector(".empty-message.empty_5gFLL");
    public Header(WebDriver driver) {
        this.driver = driver;
    }

    public void searchIcon(){
       driver.findElement(searchButton).click();
    }
    public void searchStringIsVisible(){
        driver.findElement(searchString).isDisplayed();
    }
    public String checkTextInvalidSearch(){
        String text = driver.findElement(textInvalidSearch).getText();
        return text;
    }
    public void searchString(String a){
        driver.findElement(searchString).sendKeys(a);
        driver.findElement(searchString).sendKeys(Keys.ENTER);
    }
    public void clickHomePage() {
        driver.findElement(homePageButton).click();
    }

    public String checkTextHomePage() {
        String text = driver.findElement(textHomePage).getText();
        return text;
    }

    public void clickMatchesPage() {
        driver.findElement(matchesPageButton).click();
    }

    public String checkTitleTextPage() {
        String text = driver.findElement(pageTitle).getText();
        return text;
    }

    public void clickTournamentPage() {
        driver.findElement(tournamentPageButton).click();
    }

    public void clickTeamsPage() {
        driver.findElement(teamsPageButton).click();
    }

    public void clickBlogsPage() {
        driver.findElement(blogsPageButton).click();
    }

    public void clickGamesPage() {
        driver.findElement(gamesPageButton).click();
    }
}
