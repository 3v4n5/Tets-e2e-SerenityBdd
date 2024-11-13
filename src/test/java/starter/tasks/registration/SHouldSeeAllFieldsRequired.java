package starter.tasks.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.ui.regisration.RegisterForm;

public class SHouldSeeAllFieldsRequired implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(RegisterForm.ALERT_ALL_REQUIRED_FIELDS).text().contains("Por favor diligencie todos los campos")
        );
    }
}
