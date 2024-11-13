package starter.stepdefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import starter.tasks.registration.CheckNewAccountCreated;
import starter.tasks.registration.DoNotSendAllRequiredInformation;
import starter.tasks.registration.RegisterUser;
import starter.tasks.registration.SHouldSeeAllFieldsRequired;
import starter.ui.regisration.RegisterPage;

import java.util.List;

public class RegistrationStepDefinition {

    String expectedName = "";
    String expectedlastName = "";
    String expectedAge = "";
    String expectedCountry = "";
    String expectedEmail = "";


    @Given("{actor} wants to sign up in the aplication")
    public void wantsToSignUpInTheAplication(Actor actor){
        actor.attemptsTo(Open.browserOn(new RegisterPage()));
    }

    @When("{actor} sends required information to sign up")
    public void sendsRequiredInformationToSignUp(Actor actor, io.cucumber.datatable.DataTable userInfo){
        //filas del datatable
        List<List<String>> rows = userInfo.asLists(String.class);
        //columnas del datatable
        for (List<String> columns: rows){
            expectedName = columns.get(0);
            expectedlastName = columns.get(1);
            expectedAge = columns.get(2);
            expectedEmail = columns.get(3);
            expectedCountry = columns.get(4);
        }

        actor.attemptsTo(
                new RegisterUser(expectedName,expectedlastName,expectedAge,expectedCountry,expectedEmail)
        );
    }

    @Then("{actor} should have a new account created")
    public void shouldHaveANewAccountCreated(Actor actor) {
        actor.attemptsTo(
                new CheckNewAccountCreated(expectedName, expectedlastName, expectedAge)
        );
    }

    @When("{actor} does not send the required information")
    public void doesNotSendTheRequiredInformation(Actor actor) {
        actor.attemptsTo(
                new DoNotSendAllRequiredInformation(expectedName, expectedlastName)
        );
    }

    @Then("{actor} should be told all fields are required")
    public void shouldBeToldAllFieldsAreRequired(Actor actor) {
        actor.attemptsTo(
            new SHouldSeeAllFieldsRequired()
        );
    }
}
