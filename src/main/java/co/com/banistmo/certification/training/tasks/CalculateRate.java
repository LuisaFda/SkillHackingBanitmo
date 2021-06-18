package co.com.banistmo.certification.training.tasks;

import co.com.banistmo.certification.training.models.NominalRate;
import co.com.banistmo.certification.training.userinterfaces.BusinessPage;
import co.com.banistmo.certification.training.userinterfaces.HomePage;
import co.com.banistmo.certification.training.userinterfaces.RateConverter;
import co.com.banistmo.certification.training.userinterfaces.ToolsPage;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CalculateRate implements Task {

  private NominalRate rateList;

  public CalculateRate(NominalRate rateList) {
    this.rateList = rateList;
  }

  public static CalculateRate withInformation(List<NominalRate> rateList) {
    return Tasks.instrumented(CalculateRate.class, rateList.get(0));
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(HomePage.TAB_BUSINESS),
        Click.on(BusinessPage.TAB_TOOLS),
        Click.on(ToolsPage.RATE_CONVERTER),
        Click.on(RateConverter.CALCULATE_BUTTON),
        Enter.theValue(rateList.getInterest()).into(RateConverter.INTEREST_RATE_INPUT),
        Click.on(RateConverter.DESIRED_PERIODICITY_SELECT),
        Click.on(RateConverter.DESIRED_PERIODICITY_OPTION.of(rateList.getPeriodicity())),
        Click.on(RateConverter.CAPITALIZATION_SELECT),
        Click.on(RateConverter.CAPITALIZATION_OPTION.of(rateList.getCapitalization()))
    );
  }
}
