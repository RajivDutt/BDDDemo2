package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ={"src/test/java/Feature/LogInWithExample.feature"} , glue = {"DefineSteps"}, dryRun= false)
public class exampleRunner {
}
