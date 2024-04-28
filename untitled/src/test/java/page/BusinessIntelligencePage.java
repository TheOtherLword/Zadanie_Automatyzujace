package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessIntelligencePage {
    private WebDriver driver;

    @FindBy(className = "section-infoText__heading")
    private WebElement text;

    @FindBy(className = "header-main__brand")
    private WebElement goHomePageBtn;

    public BusinessIntelligencePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public HomePage goHomePage(){
        goHomePageBtn.click();
        return new HomePage(driver);
    }

    public WebElement getText(){
        return text;
    }
}
