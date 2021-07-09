package com.demoqa.automation.tasks;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.questions.RegisterFormQuestions;
import com.demoqa.automation.ui.RegisterqaFormPage;
import com.demoqa.automation.utils.MyExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.*;

public class ValidationExcelForm implements Task {

    DataInjection dataInjection= new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.should(
                    seeThat(RegisterFormQuestions.in(RegisterqaFormPage.VALIDATIONS_REGISTER), equalToIgnoringCase(MyExcel.getCellValue(dataInjection.getFilepath(), dataInjection.getSheetName(), 0, 9)))

            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ValidationExcelForm compareText(){
        return instrumented(ValidationExcelForm.class);
    }
}

