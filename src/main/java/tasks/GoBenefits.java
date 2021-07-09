package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static userinterfaces.BancolombiaPage.*;

public class GoBenefits implements Task {

    public static GoBenefits verifyTrustAccount() {
        return Tasks.instrumented(GoBenefits.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SOLICITUD_PRODUCTOS),
                Click.on(INVERSIONES),
                Click.on(OPCIONES),
                Click.on(MONTO_MINIMO),
                Click.on(CONOCE_MAS),
                Click.on(BENEFICIOS)
        );
    }
}
