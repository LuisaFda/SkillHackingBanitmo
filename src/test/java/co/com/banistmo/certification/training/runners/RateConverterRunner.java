package co.com.banistmo.certification.training.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/rate_converter.feature",
    glue = "co.com.banistmo.certification.training.stepdefinitions",
    snippets = SnippetType.CAMELCASE)
public class RateConverterRunner {

}
