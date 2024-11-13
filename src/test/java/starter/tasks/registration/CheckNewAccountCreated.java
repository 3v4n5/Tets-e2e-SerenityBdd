package starter.tasks.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;

import static starter.ui.regisration.SummaryPage.*;

public class CheckNewAccountCreated implements Task {

    private final String expectedName;
    private final String expectedlastName;
    private final String expectedAge;

    public CheckNewAccountCreated(String expectedName, String expectedlastName, String expectedAge) {
        this.expectedName = expectedName;
        this.expectedlastName = expectedlastName;
        this.expectedAge = expectedAge;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                //cambia a la segunda pestaña del navegador
                Switch.toWindowTitled("Summary"),

                Ensure.that(LABEL_NAME).text()
                        .containsIgnoringCase(expectedName),

                Ensure.that(LABEL_LAST_NAME).text()
                        .containsIgnoringCase(expectedlastName),

                Ensure.that(LABEL_AGE).text()
                        .containsIgnoringCase(expectedAge)
        );
    }
}

