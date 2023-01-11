package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/Feature/LogInDemo.feature", glue= {"DefineSteps"}, monochrome = true,
plugin = {"pretty", "junit:target/Junitreports/LoginPagereport.xml"})
public class LoginPage_POMRunner {
}
