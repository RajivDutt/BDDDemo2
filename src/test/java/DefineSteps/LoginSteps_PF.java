package DefineSteps;
import PageFactory.LoginPage_PF;
import PageFactory.HomePage_PF;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class LoginSteps_PF {
    WebDriver d = null;
    LoginPage_PF login;
    HomePage_PF home;
    @Given("browser is open")
    public void browserIsOpen() {
        System.out.println(" =====I am inside the browser is open====");
        WebDriverManager.chromedriver().setup();
        d = new ChromeDriver();
        d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        d.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        d.manage().window().maximize();
    }

    @And("User is on login pg")
    public void userIsOnLoginPg() {
        d.navigate().to("https://example.testproject.io/web/");
    }

    @When("user enters <Username> and <password>")
    public void userEntersUsernameAndPassword(String username,String password) throws InterruptedException {
        login = new LoginPage_PF(d);
        login.enterUserName(username);
        login.enterPassword(password);
        sleep(2000);
    }
    @When("^user enters (.*) and (.*)$")
    public void user_EntersUsernameAndPassword(String username,String password) throws InterruptedException {
        login = new LoginPage_PF(d);
        login.enterUserName(username);
        login.enterPassword(password);
        sleep(2000);

    }

    @And("User clicks on login")
    public void userClicksOnLogin() {
        login.clickLogin();
    }

    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() throws InterruptedException {
        home= new HomePage_PF(d);
        Assert.assertTrue(home.checkLogoutIsDisplayed());
        Thread.sleep(2000);
        d.close();
        d.quit();
    }


}
