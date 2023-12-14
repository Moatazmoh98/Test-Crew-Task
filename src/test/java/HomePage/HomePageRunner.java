package HomePage;

import base.Hooks;
import io.cucumber.testng.CucumberOptions;

public class HomePageRunner {
    @CucumberOptions(
            features = "HomePage.feature",
            glue = "src/test/java/HomePage",
            plugin = {"pretty", "html:target/cucumber-reports"}
    )
    public class CucumberRunner extends Hooks {
    }
}
