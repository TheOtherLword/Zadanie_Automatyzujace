package Zadanie;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.chrome.ChromeDriver;
import page.*;
import java.time.Duration;

public class ZadanieTestSteps {
    WebDriver driver;

    @Given("Open web browser")
    public void openWebBrowser(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @When("Flow Dog Home Page is open")
    public void openHomePage(){
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        this.driver.get("https://flowdog.io");
    }
    @And ("I check if Home Page is visible")
    public void checkHomePage(){
        HomePage homePage = new HomePage(driver);
        homePage.clickCookePopUp();
        Assertions.assertTrue(homePage.isHomePageVisible());
    }
    @And ("I click Wyślij formularz i zobacz co możemy dla Ciebie zrobić")
    public void openContactForm(){
        HomePage homePage = new HomePage(driver);
        homePage.goToContact();
    }
    @And ("I check if email box is visible")
    public void checkEmailVisible(){
        HomePage homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Assertions.assertTrue(homePage.isEmailBoxVisible());
    }
    @And ("I close contact form")
    public void closeContactForm(){
        HomePage homePage = new HomePage(driver);
        homePage.closeToContact();
    }
    @And ("I check if email box is not visible")
    public void checkEmailNotVisible(){
        HomePage homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Assertions.assertFalse(homePage.isEmailBoxVisible());
    }
    @And ("I fill in search box with {word}")
    public void fillSearchBox(String phrase){
        HomePage homePage = new HomePage(driver);
        homePage.fillingSearchBox(phrase);
    }
    @And ("I click Więcej and go to article about Business Intelligence")
    public void goToBusinesIntelligencePage(){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.goToBIPage();
    }
    @Then ("I verify if text {string} is visible")
    public void checkingTextVisible(String sentence){
        BusinessIntelligencePage businessIntelligencePage = new BusinessIntelligencePage(driver);
        Assertions.assertEquals(sentence,businessIntelligencePage.getText().getText());
    }
    @And ("I click on Firm Logo to go to Home Page")
    public void goBackToHomePage(){
        BusinessIntelligencePage businessIntelligencePage = new BusinessIntelligencePage(driver);
        businessIntelligencePage.goHomePage();
    }
    @And ("I verify if Home Page is visible")
    public void checkHomePage2(){
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.isHomePageVisible());
    }
}
