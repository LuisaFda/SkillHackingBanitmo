package co.com.banistmo.certification.training.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BusinessPage {

  public static final Target TAB_TOOLS = Target.the("Tab Tools")
      .locatedBy("//div[@class='col-md-12']//a[contains(text(),'Herramientas')]");
}
