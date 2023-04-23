package pageObject.headerTwoLine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderTwoLine {
    private WebDriver driver;
    private By dotaTwoButton = By.cssSelector("[href='/tags/dota-2'][class='link_SMfCY']");
    private By cs_goButton = By.cssSelector("[href='/tags/cs-go'][class='link_SMfCY']");
    private By stillButton = By.xpath("//li[3]/div");
    private By leagueOfLegendsButton = By.cssSelector("[href='/tags/league-of-legends'][class='link_SMfCY']");
    private By warcraftThreeButton = By.cssSelector("[href='/tags/warcraft-iii'][class='link_SMfCY']");
    private By rainbowSixSiegeButton = By.cssSelector("[href='/tags/rainbow-six-siege'][class='link_SMfCY']");
    private By pubgButton = By.cssSelector("[href='/tags/pubg'][class='link_SMfCY']");
    private By fortniteButton = By.cssSelector("[href='/tags/fortnite'][class='link_SMfCY']");
    private By apexLegendsButton = By.cssSelector("[href='/tags/apex-legends'][class='link_SMfCY']");
    private By valorantButton = By.cssSelector("[href='/tags/valorant'][class='link_SMfCY']");
    private By overwatchButton = By.cssSelector("[href='/tags/overwatch'][class='link_SMfCY']");
    private By hearthstoneButton = By.cssSelector("[href='/tags/hearthstone'][class='link_SMfCY']");
    private By fifaButton = By.cssSelector("[href='/tags/fifa'][class='link_SMfCY']");
    private By free_fireButton = By.cssSelector("[href='/tags/free-fire'][class='link_SMfCY']");
    private By warfaceButton = By.cssSelector("[href='/tags/warface'][class='link_SMfCY']");
    private By starcraftTwoButton = By.cssSelector("[href='/tags/starcraft-2'][class='link_SMfCY']");
    private By heroesOfTheStormButton = By.cssSelector("[href='/tags/heroes-of-the-storm'][class='link_SMfCY']");
    private By quakeChampionsButton = By.cssSelector("[href='/tags/quake-champions'][class='link_SMfCY']");
    private By dotaUnderlordsButton = By.cssSelector("[href='/tags/dota-underlords'][class='link_SMfCY']");
    private By forecastButton = By.cssSelector("[href='/tags/bets']");
    private By moviesButton = By.cssSelector("[href='/tags/movies'][class='link_SMfCY']");
    private By cosplayButton = By.cssSelector("[href='/tags/cosplay'][class='link_SMfCY']");
    private By pageTitle = By.className("page-title");

    public HeaderTwoLine(WebDriver driver) {
        this.driver = driver;
    }
    public String checkTitleTextPage() {
        String text = driver.findElement(pageTitle).getText();
        return text;
    }
    public void clickDotaTwoButtonPage() {
        driver.findElement(dotaTwoButton).click();
    }
    public void clickCsGoButtonPage() {
        driver.findElement(cs_goButton).click();
    }
    public void clickLeagueOfLegendsButtonPage() {
        driver.findElement(stillButton).click();
        driver.findElement(leagueOfLegendsButton).click();
    }
    public void clickWarcraftThreeButtonPage() {
        driver.findElement(stillButton).click();
        driver.findElement(warcraftThreeButton).click();
    }
    public void clickRainbowSixSiegeButtonPage() {
        driver.findElement(stillButton).click();
        driver.findElement(rainbowSixSiegeButton).click();
    }
    public void clickPUBGButtonPage() {
        driver.findElement(stillButton).click();
        driver.findElement(pubgButton).click();
    }
    public void clickFortnitePage() {
        driver.findElement(stillButton).click();
        driver.findElement(fortniteButton).click();
    }
    public void clickApexLegendsPage() {
        driver.findElement(stillButton).click();
        driver.findElement(apexLegendsButton).click();
    }
    public void clickValorantPage() {
        driver.findElement(stillButton).click();
        driver.findElement(valorantButton).click();
    }
    public void clickOverwatchPage() {
        driver.findElement(stillButton).click();
        driver.findElement(overwatchButton).click();
    }
    public void clickHearthstonePage() {
        driver.findElement(stillButton).click();
        driver.findElement(hearthstoneButton).click();
    }
    public void clickFIFAPage() {
        driver.findElement(stillButton).click();
        driver.findElement(fifaButton).click();
    }
    public void clickFreeFirePage() {
        driver.findElement(stillButton).click();
        driver.findElement(free_fireButton).click();
    }
    public void clickWarfacePage() {
        driver.findElement(stillButton).click();
        driver.findElement(warfaceButton).click();
    }
    public void clickStarcraftTwoPage() {
        driver.findElement(stillButton).click();
        driver.findElement(starcraftTwoButton).click();
    }
    public void clickHeroesOfTheStormPage() {
        driver.findElement(stillButton).click();
        driver.findElement(heroesOfTheStormButton).click();
    }
    public void clickQuakeChampionsPage() {
        driver.findElement(stillButton).click();
        driver.findElement(quakeChampionsButton).click();
    }
    public void clickDotaUnderlordsPage() {
        driver.findElement(stillButton).click();
        driver.findElement(dotaUnderlordsButton).click();
    }
    public void clickForecastPage() {
        driver.findElement(stillButton).click();
        driver.findElement(forecastButton).click();
    }
    public void clickMoviesPage() {
        driver.findElement(stillButton).click();
        driver.findElement(moviesButton).click();
    }
    public void clickCosplayPage() {
        driver.findElement(stillButton).click();
        driver.findElement(cosplayButton).click();
    }
}
