package starter.ui.addtransaction;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddTransactionPage {

    public static final Target BUTTON_ADD_TRANSACTION = Target.the("add transaction button").locatedBy("//button[@data-toggle='modal']");
    public static final Target INPUT_DATE = Target.the("input date").locatedBy("//input[@type='date']");
    public static final Target INPUT_AMOUNT = Target.the("input amount").located(By.id("amount"));
    public static final Target INPUT_DESCRIPTION = Target.the("input description").located(By.className("form-control"));
    public static final Target BUTTON_SAVE = Target.the("button save").locatedBy("//button[contains(., 'Guardar')]");
    public static final Target TRANSACTIONS_TABLE = Target.the("transaction table").locatedBy("//tbody[@id='transactions-list']");

    public static final String TRANSACTIONS_TABLE_XPATH = "//tbody[@id='transactions-list']";
}
