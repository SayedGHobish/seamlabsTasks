package BDD.Runner;

import BDD.Runner.TestBase;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/BDD/Features",
                glue = ("BDD/Steps"),
                plugin = {"pretty","html:target/cucumber-html-report.html"})
public class TestRunner extends TestBase {
}
