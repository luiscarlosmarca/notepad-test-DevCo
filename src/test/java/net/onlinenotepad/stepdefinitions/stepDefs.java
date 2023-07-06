package net.onlinenotepad.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import utils.GetDriver;

import static net.onlinenotepad.stepdefinitions.setup.userNote;
import static task.CrearNotaTextoEnriquecido.crearNuevaNota;
import static ui.blocNotasPage.BTN_TEXT_RICH;

public class stepDefs {





    @Given("^el usuario ingresa al home de la aplicacion bloc de notas online$")
    public void el_usuario_ingresa_al_home_de_la_aplicacion_bloc_de_notas_online() {
        userNote.can(BrowseTheWeb.with(GetDriver.web().onPage("https://www.online-notepad.net/es/bloc-de-notas-online")));
        userNote.attemptsTo(Click.on(BTN_TEXT_RICH));
    }

    @When("^ingresa el siguiente texto enriquecido \"([^\"]*)\" con titulo \"([^\"]*)\"$")
    public void ingresa_el_siguiente_texto_enriquecido_con_titulo_Nota_Testing(String nota, String titulo){
        userNote.attemptsTo(crearNuevaNota(titulo,nota));
    }

    @Then("^El usuario podra ver el titulo de la nota en listado de notas creadas\\.$")
    public void el_usuario_podra_ver_el_titulo_de_la_nota_en_listado_de_notas_creadas() {
        // Write code here that turns the phrase above into concrete actions
    }

}
