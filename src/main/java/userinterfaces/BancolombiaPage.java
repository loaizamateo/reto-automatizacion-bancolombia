package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.grupobancolombia.com")
public class BancolombiaPage extends PageObject {

    public static final Target SOLICITUD_PRODUCTOS = Target.the("Solicitud de productos")
            .located(By.id("header-solicitud-productos"));
//            .locatedBy("//a[@id='header-solicitud-productos']");
    public static final Target INVERSIONES = Target.the("Inversiones")
            .located(By.id("filtro-inversiones"));
    public static final Target OPCIONES = Target.the("Opciones")
            .located(By.id("mostrar-filtros"));
    public static final Target MONTO_MINIMO = Target.the("Monto minimo")
            .located(By.id("tag-catMontoMinimo50000 icon-cash"));
    public static final Target CONOCE_MAS = Target.the("Conoce mas")
            .located(By.id("filtrado-conoce-inversion-0"));
    public static final Target BENEFICIOS = Target.the("Beneficios")
            .locatedBy("//a[@href='#tab2']");
    public static final Target VERIFICAR_BENEFICIOS = Target.the("Verificar Beneficios")
            .locatedBy("//div[@id='tab2']/h2");
}
