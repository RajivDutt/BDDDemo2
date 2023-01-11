package DefineSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginExampleSteps {
    private WebDriver d;
    @Given("User is on home page")
    public void userIsOnHomePage() {
        WebDriverManager.chromedriver().setup();
        d = new ChromeDriver();
        d.get("https://www.saucedemo.com/");

    }

    @When("User navigates to the home page")
    public void userNavigatesToTheHomePage() {
        System.out.println("User navigates to the home page");
    }

    @And("User enters {string} and {string}")
    public void userEntersAnd(String userName, String password) throws Throwable{
        System.out.println("User Name is "+ userName+" Password is " + password);
        d.findElement(By.xpath("//input[@id='user-name']")).sendKeys(userName);
        d.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        d.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @Then("Message displayed Login successful")
    public void messageDisplayedLoginSuccessful() throws Throwable {
        System.out.println("Login Success");
        Thread.sleep(2000);
        d.close();
    }
}
