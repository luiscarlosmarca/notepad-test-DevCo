package task;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static groovy.xml.Entity.not;
import static ui.blocNotasPage.*;

public class CrearNotaTextoEnriquecido implements Task {
    String titulo, nota;

    public CrearNotaTextoEnriquecido(String titulo, String nota) {
        this.titulo = titulo;
        this.nota = nota;
    }

    public static CrearNotaTextoEnriquecido crearNuevaNota(String titulo, String nota){
        return new CrearNotaTextoEnriquecido(titulo, nota);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("").into(TEXT_AREA_NOTA_TITULO).thenHit(Keys.DELETE)
        );
        actor.attemptsTo(Enter.keyValues(titulo).into(TEXT_AREA_NOTA_TITULO));
        actor.attemptsTo(Click.on(TEXT_AREA_NOTA));
        actor.attemptsTo(Enter.keyValues(nota).into(TEXT_AREA_NOTA));
        actor.attemptsTo(Click.on(BrowseTheWeb.as(actor).findAll(BTN_SAVE.getCssOrXPathSelector()).get(2)));

    }


}
