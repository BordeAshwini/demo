package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features//Cucumberhooks.feature",
							glue="stepDefs",
							//tags="@smoke",  
							dryRun=false,
							monochrome=true,
							publish=true,
							plugin= {"pretty","html:target/hook.html"})

public class TestHookRunner {

}
