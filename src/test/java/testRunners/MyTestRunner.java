package testRunners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\maruthi\\workspace\\CucumberPOM\\src\\test\\resources\\com\\features\\MassMutual.feature"},
		glue = {"stepdefinitions", "AppHooks"},
        dryRun=true
				
		
		)

public class MyTestRunner {

}
