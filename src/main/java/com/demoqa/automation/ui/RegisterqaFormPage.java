package com.demoqa.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterqaFormPage {
    public static String URL = "https://demoqa.com/automation-practice-form";
    public static final Target FIRST_NAME_INPUT = Target.the("").located(By.id("firstName"));
    public static final Target LAST_NAME_INPUT = Target.the("").located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("").located(By.id("userEmail"));
    public static final Target GENDER_BUTTON = Target.the("").locatedBy("//label[@for='gender-radio-1']");
    public static final Target MOBILE_NUMBER_INPUT = Target.the("").located(By.id("userNumber"));
    public static final Target BIRTHDAY_SELECT = Target.the("").located(By.id("dateOfBirthInput"));

    public static final Target MONT_SELECT_BIRTH = Target.the("").locatedBy("//select[@class='react-datepicker__month-select']");
    public static final Target MONT_OPTION_BIRTH = Target.the("").locatedBy("//*[@value='2' and text()='March']");

    public static final Target YEAR_SELECT_BIRTH = Target.the("").locatedBy("//*[@class='react-datepicker__year-select']");
    public static final Target YEAR_OPTION_BIRTH = Target.the("").locatedBy("//*[@value='1986' and text()='1986']");

    public static final Target DAY_SELECT_BIRTH = Target.the("").locatedBy("//*[@class='react-datepicker__day react-datepicker__day--001' and text()='1']"
    );
    public static final Target SUBJECTS_LIST_INPUT = Target.the("").locatedBy("//input[@id='subjectsInput']");
    public static final Target HOBBIES_BUTTON = Target.the("").locatedBy("//label[@for='hobbies-checkbox-1']");
    public static final Target SELECT_PICTURE = Target.the("").located(By.id("uploadPicture"));
    public static final Target CURRENT_ADDRESS_INPUT = Target.the("").located(By.id("currentAddress"));
    public static final Target SELECT_STATE_INPUT = Target.the("").locatedBy("//*[@id='react-select-3-input' and @type='text']");
    public static final Target SELECT_CITY_INPUT = Target.the("").locatedBy("//*[@id='react-select-4-input' and @type='text']");
    public static final Target SUBMIT_BUTTON_REGISTER = Target.the("").located(By.id("submit"));

    public static final Target VALIDATIONS_REGISTER = Target.the("").locatedBy("//*[@id='example-modal-sizes-title-lg' and text()='Thanks for submitting the form']");
    public static final Target CLOSE_BUTTON_FORM = Target.the("").locatedBy("//*[@id='closeLargeModal' and @type='button']");

}