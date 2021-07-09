package com.demoqa.automation.tasks;

import com.demoqa.automation.ui.RegisterqaFormPage;
import com.demoqa.automation.utils.SpecialMethods;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillAllFieldsConfigDi implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        SpecialMethods.configProperties();
        actor.attemptsTo(
                Enter.keyValues(SpecialMethods.properties.getProperty("firstName")).into(RegisterqaFormPage.FIRST_NAME_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("lastName")).into(RegisterqaFormPage.LAST_NAME_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("email")).into(RegisterqaFormPage.EMAIL_INPUT),
                JavaScriptClick.on(RegisterqaFormPage.GENDER_BUTTON),
                Enter.theValue(SpecialMethods.properties.getProperty("mobileNumber")).into(RegisterqaFormPage.MOBILE_NUMBER_INPUT),
                JavaScriptClick.on(RegisterqaFormPage.BIRTHDAY_SELECT),
                WaitUntil.the(RegisterqaFormPage.MONT_SELECT_BIRTH, isVisible()),
                JavaScriptClick.on(RegisterqaFormPage.MONT_SELECT_BIRTH),
                JavaScriptClick.on(RegisterqaFormPage.MONT_OPTION_BIRTH),
                JavaScriptClick.on(RegisterqaFormPage.YEAR_SELECT_BIRTH),
                JavaScriptClick.on(RegisterqaFormPage.YEAR_OPTION_BIRTH),
                JavaScriptClick.on(RegisterqaFormPage.DAY_SELECT_BIRTH),
                Enter.keyValues(SpecialMethods.properties.getProperty("subject")).into(RegisterqaFormPage.SUBJECTS_LIST_INPUT),
                Enter.keyValues(Keys.ENTER).into((RegisterqaFormPage.SUBJECTS_LIST_INPUT)),
                Scroll.to(RegisterqaFormPage.SELECT_PICTURE),
                JavaScriptClick.on(RegisterqaFormPage.HOBBIES_BUTTON),
                Enter.keyValues(SpecialMethods.properties.getProperty("picture")).into(RegisterqaFormPage.SELECT_PICTURE),
                Enter.theValue(SpecialMethods.properties.getProperty("currentAddress")).into(RegisterqaFormPage.CURRENT_ADDRESS_INPUT),
                JavaScriptClick.on(RegisterqaFormPage.SELECT_STATE_INPUT),
                Enter.theValue(SpecialMethods.properties.getProperty("state")).into(RegisterqaFormPage.SELECT_STATE_INPUT),
                Enter.keyValues(Keys.ENTER).into(RegisterqaFormPage.SELECT_STATE_INPUT),
                JavaScriptClick.on(RegisterqaFormPage.SELECT_CITY_INPUT),
                Enter.theValue(SpecialMethods.properties.getProperty("city")).into(RegisterqaFormPage.SELECT_CITY_INPUT),
                Enter.keyValues(Keys.ENTER).into(RegisterqaFormPage.SELECT_CITY_INPUT),
                JavaScriptClick.on(RegisterqaFormPage.SUBMIT_BUTTON_REGISTER)
                );

    }
    public static FillAllFieldsConfigDi dataInjectionConfig(){
        return instrumented(FillAllFieldsConfigDi.class);
    }
}