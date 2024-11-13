package starter.ui.login;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target INPUT_USERNAME = Target.the("username").located((By.id("username")));
    public static final Target INPUT_PASSWORD = Target.the("password").located((By.id("password")));
    public static final Target BUTTON_LOGIN = Target.the("login buton").located((By.xpath("//button[@type='submit']")));
}
