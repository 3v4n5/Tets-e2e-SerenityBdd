package starter.ui.regisration;

import net.serenitybdd.screenplay.targets.Target;

public class SummaryPage {
    public static final Target LABEL_NAME = Target.the("Label name").locatedBy("//strong[contains(text(),'Nombre')]/parent::p");
    public static final Target LABEL_LAST_NAME = Target.the("Label last name").locatedBy("//strong[contains(text(),'Apellido')]/parent::p");
    public static final Target LABEL_AGE = Target.the("Label Age").locatedBy("//strong[contains(text(),'Edad')]/parent::p");
}
