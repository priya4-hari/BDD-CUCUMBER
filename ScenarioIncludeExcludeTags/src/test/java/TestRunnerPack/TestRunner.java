package TestRunnerPack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="C:\\Users\\admin\\My_Projects\\MultipleTestScenarios\\FeatureFilesFolder\\Login.feature",
		glue="StepDefinitionPack",
		plugin={"pretty","html:REPORTS\\HTML\\first.html",
		"junit:REPORTS\\XML\\first.xml",
		"json:REPORTS\\JSON\\first.json"}
		)
public class TestRunner {

}
