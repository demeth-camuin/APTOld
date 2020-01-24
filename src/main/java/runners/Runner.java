package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "steps" }, // Name of folder that contains the steps.
	plugin = { "com.cucumber.listener.ExtentCucumberFormatter:reports\\Extent-Report.html" }, monochrome = true, // For code readability.
	strict = true, // Always set to true to check every undefined/pending steps.
	dryRun = false, // Checking of steps if implemented or not.
	// tags = { "@Regression" },
	// tags = { "@Regression-Slow" },
	tags = { "@RegressionRerun" },
	// tags = { "@WIP" },
	// features = "src/main/resources/features/"
	// features = "src/main/resources/features/Air.feature"
	// features = "src/main/resources/features/Commissions.feature"
	features = "src/main/resources/features/Contracts.feature"
// features = "src/main/resources/features/Customers.feature"
// features = "src/main/resources/features/HomePage.feature"
// features = "src/main/resources/features/Promotions.feature"
// features = "src/main/resources/features/Suppliers.feature"
// features = "src/main/resources/features/Users.feature"
)

public class Runner {
	
}