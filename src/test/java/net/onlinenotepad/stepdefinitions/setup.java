package net.onlinenotepad.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class setup {

    public static Actor userNote;

    @Before
    public void prepareStage() {

        userNote = Actor.named("The user");
        OnStage.setTheStage(new OnlineCast());
    }
}
