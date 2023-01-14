package co.choucair.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/java/co/choucair/tests/features",
        glue = {"co.choucair.tests.stepDefinition"}

)
public class CucumberRunner { }

