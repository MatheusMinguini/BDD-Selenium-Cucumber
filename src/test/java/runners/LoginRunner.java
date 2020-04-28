package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// JUnit is a runner class, so it basically runs our tests
// In the line down below we are saying to JUnit: Hey, run the Class
// Test using Cucumber Framework
@RunWith(Cucumber.class)




// WARNING: If written like this glue = "src.test.java.steps" the Cucumber won't find the glue code
// Apparently it starts in the folder: glue = "src.test.java"

// Tell where the feature folder is
// Tell where the glue code is (Code that implements the steps definitions of the scenarios)
@CucumberOptions (features = "features", glue = "steps", strict = true)

public class LoginRunner {
}
