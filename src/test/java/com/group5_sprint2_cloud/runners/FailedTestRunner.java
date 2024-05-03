package com.group5_sprint2_cloud.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/group5_sprint2_cloud/step_definitions"
)
public class FailedTestRunner {
}


