package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@io.cucumber.testng.CucumberOptions (
        features = "ruthfeatures",
        glue = "ruthstepdef",
        dryRun = false,
        tags = "@login",
        plugin = { "pretty", // Human-readable console output
                "html:target/cucumber-html-reports/overview-features.html", // Simple HTML report (optional)
                "json:target/cucumber-json/cucumber.json", // Needed for Jenkins' Cucumber plugin
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", // For Extent Report
                "rerun:target/failed_scenarios.txt" // For reruns
        },
        monochrome = true

)
public class TestRunner extends AbstractTestNGCucumberTests {

//        @Override
//        @DataProvider(parallel = true)  // Enable parallel execution of scenarios
//        public Object[][] scenarios() {
//                return super.scenarios();
//        }
@Test
public void checkRunnerExecution() {
        System.out.println("TestNG is running the test class");
}
}
