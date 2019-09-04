package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags = { "@tag" }, features = "src/test/java/Features", glue = { "seleniumgluecode" },
plugin = { "pretty", "junit:target/reports/testReport.xml",
			 "html:target/reports"},
monochrome = true)

public class Testrunner {

}
