package co.com.banistmo.certification.training.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

  public static final Target TAB_BUSINESS = Target.the("Tab Business")
      .locatedBy("//li[@class='header-top_item']//a[contains(text(),'Negocios')]");

}
