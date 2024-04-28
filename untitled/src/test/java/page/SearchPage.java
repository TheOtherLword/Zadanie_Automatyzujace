package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"main\"]/div[3]/div/div/div/div[1]/section/article[1]/div/a")
    private WebElement wiecejBtn;
    public SearchPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public BusinessIntelligencePage goToBIPage(){
        wiecejBtn.click();
        return new BusinessIntelligencePage(driver);
    }

}
