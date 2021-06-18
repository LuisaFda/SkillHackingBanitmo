package co.com.banistmo.certification.training.stepdefinitions;

import static co.com.banistmo.certification.training.utils.GeneralConstants.URL;
import static co.com.banistmo.certification.training.utils.GeneralConstants.VALIDATION_ERROR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;
import static org.openqa.selenium.remote.BrowserType.CHROME;

import co.com.banistmo.certification.training.exceptions.ValidationException;
import co.com.banistmo.certification.training.models.NominalRate;
import co.com.banistmo.certification.training.questions.ValidateRate;
import co.com.banistmo.certification.training.tasks.CalculateRate;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class RateConverterStepDefinition {

  @Managed(driver = CHROME)
  protected WebDriver hisBrowser;


  @Before
  public void preparation() {
    setTheStage(new OnlineCast());
    theActorCalled("User");
    theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
  }

  @Given("^the user is on the main page$")
  public void theUserIsOnTheMainPage() {
    theActorInTheSpotlight().wasAbleTo(
        Open.url(URL)
    );
  }

  @When("^he enters the nominal to effective rate data$")
  public void heEntersTheNominalToEffectiveRateData(List<NominalRate> rateList) {
    theActorInTheSpotlight().attemptsTo(
        CalculateRate.withInformation(rateList)
    );
  }

  @Then("^will validate that the value of the result is (.*)$")
  public void willValidateThatTheValueOfTheResultIsReflected(String rateExpected) {
    theActorInTheSpotlight()
        .should(
            seeThat(ValidateRate.withMessage(),
                containsString(rateExpected)
            ).orComplainWith(ValidationException.class, VALIDATION_ERROR));
  }
}
