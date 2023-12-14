package base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;

public class Hooks extends AbstractTestNGCucumberTests {

        @Override
        public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
            synchronized (Hooks.class) {
                super.runScenario(pickleWrapper, featureWrapper);
            }
        }
}
