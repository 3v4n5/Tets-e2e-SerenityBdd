package starter.tasks.addtransaction;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.By;
import starter.questions.GetTransactionInfo;
import starter.ui.addtransaction.AddTransactionPage;

import static starter.ui.addtransaction.AddTransactionPage.*;

public class CheckNewTransactionWasAdded implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(GetTransactionInfo.getDescription()).contains("transaction description"),
                Ensure.that(TRANSACTIONS_TABLE)
                        .text().contains("50000")
        );
    }
}
