package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static userinterfaces.BancolombiaPage.VERIFICAR_BENEFICIOS;

public class CheckBenefits implements Question<Boolean>{

    public static CheckBenefits inTheScreen() {
        return new CheckBenefits();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(VERIFICAR_BENEFICIOS).viewedBy(actor).asBoolean();
    }
}
