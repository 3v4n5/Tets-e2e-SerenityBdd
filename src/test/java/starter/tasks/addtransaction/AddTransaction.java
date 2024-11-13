package starter.tasks.addtransaction;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static starter.ui.addtransaction.AddTransactionPage.*;

public class AddTransaction {

    public static Performable withInfo(String transactionDate, String transactionAmount, String transactionDescription) {
        return Task.where("{0} adds a new transaction",

                Click.on(BUTTON_ADD_TRANSACTION),
                Enter.theValue(transactionDate).into(INPUT_DATE),
                Enter.theValue(transactionAmount).into(INPUT_AMOUNT),
                Enter.theValue(transactionDescription).into(INPUT_DESCRIPTION),
                Click.on(BUTTON_SAVE)

        );
    }
}
