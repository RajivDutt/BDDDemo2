package DefineSteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.util.List;

public class LoginDataTableSteps {
    @Given("User is on login page of the application")
    public void userIsOnLoginPageOfTheApplication() {
        
    }
    @When("User enters following username and password")
    public void user_enters_following_username_and_password(DataTable dataTable) throws Throwable {
//        List<List<String>> listOfRows = dataTable.raw()
        throw new PendingException();
    }

    @Then("User should be able to log in")
    public void user_should_be_able_to_log_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
