package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.BancolombiaPage;

public class OpenBancolombia implements Task {
    private BancolombiaPage bancolombiaPage;

    public static Performable thePageBancolombia() {
        return Tasks.instrumented(OpenBancolombia.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(bancolombiaPage));
    }
}
