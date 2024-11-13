package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import starter.models.LoginModel;
import starter.models.TransactionModel;
import starter.tasks.addtransaction.AddTransaction;
import starter.tasks.addtransaction.CheckNewTransactionWasAdded;
import starter.tasks.login.Login;
import starter.tasks.navigation.Navigate;
import starter.utils.GetInfoFromTable;

import java.util.List;


public class AddTransacionStepDefinition {

    @Given("{actor} is logged into the application")
    public void isLoggedIntoTheApplication(Actor actor, DataTable userLogin) {

        LoginModel loginModel = GetInfoFromTable.getLoginCredentials(userLogin);

        actor.attemptsTo(
                Navigate.loginPage(),
                new Login(loginModel.getUsername(), loginModel.getPassword())
        );
    }

    @When("{actor} enters the required information for the new transaction")
    public void entersTheRequiredInformationForTheNewTransaction(Actor actor, DataTable transactionInfo) {

        TransactionModel transactionModel = GetInfoFromTable.getTransactionData(transactionInfo);

        actor.attemptsTo(
                AddTransaction.withInfo(transactionModel.getTransctionDate(),
                                        transactionModel.getTransctionAmount(),
                                        transactionModel.getTransctionDescription()
                )
        );
    }

    @Then("{actor} should see a new transaction in the transaction list with correct details")
    public void shouldSeeANewTransactionInTheTransaction(Actor actor) throws InterruptedException {
       wait(5000);
        actor.attemptsTo(
                new CheckNewTransactionWasAdded()
        );
    }

}


