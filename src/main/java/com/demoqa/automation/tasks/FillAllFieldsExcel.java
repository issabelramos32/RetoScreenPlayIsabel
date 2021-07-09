package com.demoqa.automation.tasks;


import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.ui.RegisterqaFormPage;
import com.demoqa.automation.utils.MyExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import java.io.IOException;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class FillAllFieldsExcel implements Task {

    DataInjection dataInjection =new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
            Enter.theValue(MyExcel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,0)).into(RegisterqaFormPage.FIRST_NAME_INPUT),
            Enter.theValue(MyExcel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,1)).into(RegisterqaFormPage.LAST_NAME_INPUT),
            Enter.theValue(MyExcel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,2)).into(RegisterqaFormPage.EMAIL_INPUT),
            JavaScriptClick.on(RegisterqaFormPage.GENDER_BUTTON),
            Enter.theValue(MyExcel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,3)).into(RegisterqaFormPage.MOBILE_NUMBER_INPUT),
            JavaScriptClick.on(RegisterqaFormPage.BIRTHDAY_SELECT),
            JavaScriptClick.on(RegisterqaFormPage.MONT_SELECT_BIRTH),
            JavaScriptClick.on(RegisterqaFormPage.MONT_OPTION_BIRTH),
            JavaScriptClick.on(RegisterqaFormPage.YEAR_SELECT_BIRTH),
            JavaScriptClick.on(RegisterqaFormPage.YEAR_OPTION_BIRTH),
            JavaScriptClick.on(RegisterqaFormPage.DAY_SELECT_BIRTH),
            Enter.keyValues(MyExcel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,4)).into(RegisterqaFormPage.SUBJECTS_LIST_INPUT),
            Enter.keyValues(Keys.ENTER).into(RegisterqaFormPage.SUBJECTS_LIST_INPUT),
            Scroll.to(RegisterqaFormPage.SELECT_PICTURE),
            JavaScriptClick.on(RegisterqaFormPage.HOBBIES_BUTTON),

            Enter.keyValues(MyExcel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,5)).into(RegisterqaFormPage.SELECT_PICTURE),

            Enter.theValue(MyExcel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,6)).into(RegisterqaFormPage.CURRENT_ADDRESS_INPUT),

            JavaScriptClick.on(RegisterqaFormPage.SELECT_STATE_INPUT),
            Enter.theValue(MyExcel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,7)).into(RegisterqaFormPage.SELECT_STATE_INPUT),
            Enter.keyValues(Keys.ENTER).into(RegisterqaFormPage.SELECT_STATE_INPUT),

            JavaScriptClick.on(RegisterqaFormPage.SELECT_CITY_INPUT),
            Enter.theValue(MyExcel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,8)).into(RegisterqaFormPage.SELECT_CITY_INPUT),
            Enter.keyValues(Keys.ENTER).into(RegisterqaFormPage.SELECT_CITY_INPUT),

            JavaScriptClick.on(RegisterqaFormPage.SUBMIT_BUTTON_REGISTER)
                     );
        } catch (IOException e) {
            e.printStackTrace();
        }
}
        public static FillAllFieldsExcel dataInjectionSheet(){return instrumented(FillAllFieldsExcel.class);}
    }

