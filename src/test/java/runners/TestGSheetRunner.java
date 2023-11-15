package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions (
        features = "src/test/resources/features/google_search.feature"
        ,glue = {"stepdefinitions"}
        ,monochrome=true
        ,tags = "@readSheetDocument"
        ,plugin= {"pretty", "json:target/JSONReports/report.json"}
)
public class TestGSheetRunner {

}



