package co.com.banistmo.certification.training.questions;

import static co.com.banistmo.certification.training.userinterfaces.RateConverter.RESULT_LABEL;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidateRate implements Question<String> {

  public static ValidateRate withMessage() {
    return new ValidateRate();
  }

  @Override
  public String answeredBy(Actor actor) {
    actor.attemptsTo(
        WaitUntil.the(RESULT_LABEL, WebElementStateMatchers.isVisible())
    );
    return Text.of(RESULT_LABEL).viewedBy(actor).asString().substring(0, 4);
  }
}
