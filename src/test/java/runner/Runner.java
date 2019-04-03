package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
@CucumberOptions(
			features = "src/test/java/cucumber/Login.feature",
					glue = {"steps","pages"},
					monochrome = true,
					tags = {"@Positive"}
					/*dryRun = true,
					snippets = SnippetType.CAMELCASE*/)
	@RunWith(Cucumber.class)

public class Runner {
}








	



