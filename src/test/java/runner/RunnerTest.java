package runner;

import org.testng.annotations.Test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = {"pretty", "html:target/report-html"}, monochrome = true,
        features = "src/test/resources/features",
                  glue = "stepsDefinitions")
@Test
public class RunnerTest extends AbstractTestNGCucumberTests{

}
