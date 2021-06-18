package co.com.banistmo.certification.training.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ToolsPage {
  public static final Target RATE_CONVERTER = Target.the("Rate converter button")
      .locatedBy("//div[@class='simulator-options']//li//h3[contains(text(),'Conversor de tasas de inter')]");
}
