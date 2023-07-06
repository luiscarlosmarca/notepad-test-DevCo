package ui;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class blocNotasPage {

    public static final Target TEXT_AREA_NOTA_TITULO = Target.the("Caja de texto que ingresa el titulo de la nota")
            .located(By.id("noteName"));

    public static final Target TEXT_AREA_NOTA = Target.the("Caja de texto que ingresa la nota")
            .located(By.id("editor"));

    public static final Target BTN_TEXT_RICH = Target.the("Boton para crear nota con texto enriquecido")
            .located(By.id("richtextnote-tab"));

    public static final Target BTN_SAVE = Target.the("Boton para guardar nota")
            .locatedBy("//button[contains(@class, 'saveNotesBtn') and contains(text(), 'Ahorrar')]");




}
