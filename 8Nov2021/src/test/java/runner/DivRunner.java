package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features//Calculator.feature",
							glue="stepDefs",
							dryRun=false,
							monochrome=true,
							publish=true,
							plugin= {"pretty","html:target/div.html"})
public class DivRunner {

}
