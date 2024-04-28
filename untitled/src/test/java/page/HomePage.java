package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    private WebDriver driver;

    @FindBy(className = "header-main__brand" )
    private WebElement logoIcon;
    @FindBy(css = "#cookieInfoFooter > div.close-wrapper > a")
    private WebElement cookiePopUp;

    @FindBy(id = "main")
    private WebElement homePage;
    @FindBy(css = "#main > div:nth-child(3) > div > div > section > a")
    private WebElement letsTalkBtn;

    @FindBy(css = "#talkForm > div.popup-talk__buttons > a")
    private WebElement exitLetsTalkBtn;

    @FindBy(xpath = "//*[@id=\"talkForm\"]/div[2]/div[2]")
    private WebElement emailBox;

    @FindBy(css = "#main > div:nth-child(1) > div > div > div > div > div.col-xxl-4.col-lg-5 > div > form > input")
    private WebElement searchBox;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickCookePopUp(){
        cookiePopUp.click();
    }
    public void goToContact(){
        Actions actions = new Actions(driver);
        actions.moveToElement(letsTalkBtn).
                click().
                build().
                perform();
    }

    public boolean isHomePageVisible(){
        return homePage.isDisplayed();
    }
    public boolean isEmailBoxVisible(){
        return !emailBox.isDisplayed();
    }
    public void fillingSearchBox(String word){
        Actions actions = new Actions(driver);
        actions.moveToElement(searchBox).
                click().
                build().
                perform();
        searchBox.sendKeys(word);
        searchBox.sendKeys(Keys.ENTER);
    }
    public void closeToContact(){
        Actions actions = new Actions(driver);
        actions.moveToElement(exitLetsTalkBtn).
                click().
                build().
                perform();
    }

}
