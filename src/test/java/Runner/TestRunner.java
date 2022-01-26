package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
                 (
		              features="src/test/resources/BusinessLogic",
		              glue="Mappingcodecucumberrr",
		              tags="@SmokeTest",
		              plugin="pretty",
		              monochrome=true
		
	           	)


public class TestRunner {

}
