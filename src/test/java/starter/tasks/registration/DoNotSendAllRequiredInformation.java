package starter.tasks.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static starter.ui.regisration.RegisterForm.*;

public class DoNotSendAllRequiredInformation implements Task {

    private final String expectedName;
    private final String expectedlastName;

    public DoNotSendAllRequiredInformation(String expectedName, String expectedlastName) {
        this.expectedName = expectedName;
        this.expectedlastName = expectedlastName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(expectedName).into(INPUT_NAME),
                Enter.theValue(expectedlastName).into(INPUT_LAST_NAME),
                Click.on(BUTTON_SAVE)
        );
    }
}
