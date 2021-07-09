package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.SearchError;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.CheckBenefits;
import tasks.GoBenefits;
import tasks.OpenBancolombia;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static utils.ConstantError.SEARCH_FAILED;

public class BancolombiaStepDefinitions {

    @Managed(driver = "chrome")
    protected WebDriver hisBrowser;

    @Before
    public void configuracionInicial(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("usuario").can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^the user wants open browser an got to bancolombia$")
    public void theUserWantsOpenBrowserAnGotToBancolombia() {
        theActorInTheSpotlight().wasAbleTo(OpenBancolombia.thePageBancolombia());
    }

    @When("^He seeks the benefits of his trust account$")
    public void heSeeksTheBenefitsOfHisTrustAccount(){
        theActorInTheSpotlight().attemptsTo(GoBenefits.verifyTrustAccount());
    }

    @Then("^he verifies his benefits$")
    public void heVerifiesHisBenefits(){
        theActorInTheSpotlight().should(seeThat(CheckBenefits.inTheScreen()).orComplainWith(SearchError.class, SEARCH_FAILED));
    }

}
