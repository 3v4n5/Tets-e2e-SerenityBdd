package starter.ui.regisration;


import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterForm {
    public static final Target INPUT_NAME = Target.the("Input name").locatedBy("//input[@id='name']");
    public static final Target INPUT_LAST_NAME = Target.the("Input last name").locatedBy("//input[@id='last-name']");
    public static final Target INPUT_AGE = Target.the("Input Age").locatedBy("//input[@id='age']");
    public static final Target SELECT_COUNTRY = Target.the("Select Country").locatedBy("//select[@id='country']");
    public static final Target INPUT_SEX = Target.the("Input sex").locatedBy("#sex-m");
    public static final Target INPUT_EMAIL = Target.the("Input email").locatedBy("//input[@id='email']");
    public static final Target INPUT_MONDAY = Target.the("Input monday").locatedBy("//input[@id='monday']");
    public static final Target INPUT_PICTURE = Target.the("Input picture").locatedBy("//input[@id='picture']");
    public static final Target BUTTON_SAVE = Target.the("Button save").locatedBy("//button[@class='btn btn-primary']");
    public static final Target ALERT_ALL_REQUIRED_FIELDS = Target.the("Required fields").locatedBy("//div[@role='alert']");
}
