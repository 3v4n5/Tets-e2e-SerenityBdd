package starter.tasks.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    public static Performable loginPage(){
        return Task.where("{0} navigates to login page",
                Open.url("http://127.0.0.1:5500/login.html")
                );
    }
}
