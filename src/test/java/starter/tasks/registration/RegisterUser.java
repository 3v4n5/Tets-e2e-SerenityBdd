package starter.tasks.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Upload;

import java.net.URISyntaxException;

import static starter.ui.regisration.RegisterForm.*;

public class RegisterUser implements Task {

    private final String expectedName;
    private final String expectedlastName;
    private final String expectedAge;
    private final String expectedCountry;
    private final String expectedEmail;


    public RegisterUser(String expectedName, String expectedlastName, String expectedAge, String expectedCountry, String expectedEmail) {
        this.expectedName = expectedName;
        this.expectedlastName = expectedlastName;
        this.expectedAge = expectedAge;
        this.expectedCountry = expectedCountry;
        this.expectedEmail = expectedEmail;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Enter.theValue(expectedName).into(INPUT_NAME),
                    Enter.theValue(expectedlastName).into(INPUT_LAST_NAME),
                    Enter.theValue(expectedAge).into(INPUT_AGE),
                    SelectFromOptions.byVisibleText(expectedCountry).from(SELECT_COUNTRY),
                    Click.on(INPUT_SEX),
                    Enter.theValue(expectedEmail).into(INPUT_EMAIL),
                    Click.on(INPUT_MONDAY),
                    Upload.theClasspathResource("pictures/image.jpg").to(INPUT_PICTURE),
                    Click.on(BUTTON_SAVE)
            );
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
