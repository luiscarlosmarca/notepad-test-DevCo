package net.onlinenotepad.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class stepDefs {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

}
