package com.demoqa.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterFormQuestions implements Question {
    private Target target;
    public RegisterFormQuestions(Target target) {this.target=target;}

    @Override
    public Object answeredBy(Actor actor) {
        return target.resolveFor(actor).getText().trim();
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
   public static RegisterFormQuestions in (Target target) {return new RegisterFormQuestions(target);}

}
