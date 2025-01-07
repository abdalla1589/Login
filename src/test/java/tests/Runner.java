package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = "src/test/java/tests/Login.feature",
        glue = {"tests", "base"},
        plugin = {},
        monochrome = true


)
public class Runner extends AbstractTestNGCucumberTests{

}

