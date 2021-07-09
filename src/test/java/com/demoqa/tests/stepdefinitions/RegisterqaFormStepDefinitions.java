package com.demoqa.tests.stepdefinitions;

import com.demoqa.automation.interactions.OpenBrowser;
import com.demoqa.automation.tasks.FillAllFieldsConfigDi;
import com.demoqa.automation.tasks.FillAllFieldsExcel;
import com.demoqa.automation.tasks.FillAllFieldsFaker;
import com.demoqa.automation.tasks.ValidationExcelForm;
import com.demoqa.automation.ui.RegisterqaFormPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class RegisterqaFormStepDefinitions {

    @Managed
    private WebDriver driver;

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Isabel").can(BrowseTheWeb.with(driver));
    }
// Excel
    @Given("^that a web user wants to practice register form in demoqa$")
    public void thatAWebUserWantsToPracticeRegisterFormInDemoqa() {
       theActorInTheSpotlight().attemptsTo(OpenBrowser.on(RegisterqaFormPage.URL));
    }
    @When("^he fills all the requested fields in register section whit excel$")
    public void heFillsAllTheRequestedFieldsInRegisterSectionWhitExcel() {
        theActorInTheSpotlight().attemptsTo(FillAllFieldsExcel.dataInjectionSheet());
    }
    @Then("^he should see him data$")
    public void heShouldSeeHimData() {
        theActorInTheSpotlight().attemptsTo(ValidationExcelForm.compareText());
        Serenity.takeScreenshot();
    }
//Faker
    @When("^he fills all the requested fields in register form whit faker$")
    public void heFillsAllTheRequestedFieldsInRegisterFormWhitFaker() {
    theActorInTheSpotlight().attemptsTo(FillAllFieldsFaker.dataInjectionFaker());
}
    @Then("^he should see him data down in form$")
    public void heShouldSeeHimDataDownInForm() {
        theActorInTheSpotlight().attemptsTo(ValidationExcelForm.compareText());
        Serenity.takeScreenshot();
    }
//Data Injection Config

    @When("^he fills all the requested fields in register form section whit config$")
    public void heFillsAllTheRequestedFieldsInRegisterFormSectionWhitConfig() {
        theActorInTheSpotlight().attemptsTo(FillAllFieldsConfigDi.dataInjectionConfig());
    }
    @Then("^he should see him data down in practice$")
    public void heShouldSeeHimDataDownInPractice() {
        theActorInTheSpotlight().attemptsTo(ValidationExcelForm.compareText());
        Serenity.takeScreenshot();
    }
}
