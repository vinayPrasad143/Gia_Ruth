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
        plugin = {"pretty",
//               "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
                "html:target/cucumber-reports.html",
                "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/failed_scenarios.txt"
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
