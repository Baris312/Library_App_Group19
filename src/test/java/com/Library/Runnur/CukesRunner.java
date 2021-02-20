package com.Library.Runnur;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/feature",
        glue = "com/Library/step_definition",
        dryRun = false,
        tags = "@wip"

)
public class CukesRunner
    {

    }
