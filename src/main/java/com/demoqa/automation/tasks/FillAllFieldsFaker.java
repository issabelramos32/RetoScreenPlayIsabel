package com.demoqa.automation.tasks;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.ui.RegisterqaFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.JavaScript;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillAllFieldsFaker implements Task {
    private DataInjection dataInjection= new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(dataInjection.getName()).into(RegisterqaFormPage.FIRST_NAME_INPUT),
                Enter.keyValues(dataInjection.getLastName()).into(RegisterqaFormPage.LAST_NAME_INPUT),
                Enter.keyValues(dataInjection.getEmail()).into(RegisterqaFormPage.EMAIL_INPUT),
                JavaScriptClick.on(RegisterqaFormPage.GENDER_BUTTON),
                Enter.keyValues(dataInjection.getMobileNumber()).into(RegisterqaFormPage.MOBILE_NUMBER_INPUT),
                JavaScriptClick.on(RegisterqaFormPage.BIRTHDAY_SELECT),
                JavaScriptClick.on(RegisterqaFormPage.MONT_SELECT_BIRTH),
                JavaScriptClick.on(RegisterqaFormPage.MONT_OPTION_BIRTH),
                JavaScriptClick.on(RegisterqaFormPage.YEAR_SELECT_BIRTH),
                JavaScriptClick.on(RegisterqaFormPage.YEAR_OPTION_BIRTH),
                JavaScriptClick.on(RegisterqaFormPage.DAY_SELECT_BIRTH),
                Enter.keyValues(dataInjection.getSubjects()).into(RegisterqaFormPage.SUBJECTS_LIST_INPUT),
                Enter.keyValues(Keys.ENTER).into(RegisterqaFormPage.SUBJECTS_LIST_INPUT),
                Scroll.to(RegisterqaFormPage.SELECT_PICTURE),
                JavaScriptClick.on(RegisterqaFormPage.HOBBIES_BUTTON),
                Enter.keyValues(dataInjection.getPicture()).into(RegisterqaFormPage.SELECT_PICTURE),
                Enter.keyValues(dataInjection.getCurrentAddress()).into(RegisterqaFormPage.CURRENT_ADDRESS_INPUT),
                JavaScriptClick.on(RegisterqaFormPage.SELECT_STATE_INPUT),
                Enter.keyValues(dataInjection.getState()).into(RegisterqaFormPage.SELECT_STATE_INPUT),
                Enter.keyValues(Keys.ENTER).into(RegisterqaFormPage.SELECT_STATE_INPUT),

                JavaScriptClick.on(RegisterqaFormPage.SELECT_CITY_INPUT),
                Enter.keyValues(dataInjection.getCity()).into(RegisterqaFormPage.SELECT_CITY_INPUT),
                Enter.keyValues(Keys.ENTER).into(RegisterqaFormPage.SELECT_CITY_INPUT),
                JavaScriptClick.on(RegisterqaFormPage.SUBMIT_BUTTON_REGISTER));
            }

public static FillAllFieldsFaker dataInjectionFaker(){return instrumented(FillAllFieldsFaker.class);}
}

