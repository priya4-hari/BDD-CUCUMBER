package TestRunnerPack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="C:\\Users\\admin\\My_Projects\\MultipleTestScenarios\\FeatureFilesFolder\\TagExamples.feature",
		glue="StepDefinitionPack",
		tags="@Smoke or @Regression",
		plugin={"pretty","html:target\\REPORTS\\HTML\\first.html",
		"junit:target\\REPORTS\\XML\\first.xml",
		"json:target\\REPORTS\\JSON\\first.json"}
		)
public class TestRunner1 {

}
