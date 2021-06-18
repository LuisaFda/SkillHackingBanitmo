package co.com.banistmo.certification.training.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RateConverter {
  public static final Target CALCULATE_BUTTON = Target.the("Button calculate")
      .locatedBy("//div[@id='btntoolUno']//a[contains(text(),'Calcular')]");
  public static final Target INTEREST_RATE_INPUT = Target.the("input interest")
      .locatedBy("//input[@id='interes']");
  public static final Target DESIRED_PERIODICITY_SELECT = Target.the("pediodiciti select")
      .locatedBy("//select[@id='periodicidad-deseada']");
  public static final Target DESIRED_PERIODICITY_OPTION = Target.the("periodicity option")
      .locatedBy("//select[@id='periodicidad-deseada']//option[text()='{0}']");
  public static final Target CAPITALIZATION_SELECT = Target.the("select capitalization")
      .locatedBy("//select[@id='capitalizacion']");
  public static final Target CAPITALIZATION_OPTION = Target.the("option capitalization")
      .locatedBy("//select[@id='capitalizacion']//option[text()='{0}']");
  public static final Target RESULT_LABEL = Target.the("Result label")
      .locatedBy("//h3[@id='respuesta']");

}
