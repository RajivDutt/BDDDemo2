package DefineSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogSteps {
    @Given("User is on login page")
    public void userIsOnLoginPage(){
        System.out.println("User is on login page");
    }

    @When("User enters username and password")
    public void userEntersUsernameAndPassword(){
        System.out.println("User enters username and password");
    }

    @And("click on login button")
    public void clickOnLoginButton(){
        System.out.println("click on login button");
    }

    @Then("User is navigate to the home page")
    public void userIsNavigateToTheHomePage(){
        System.out.println("User is navigate to the home page");
    }
}
