package com.demoqa.automation.models;

import com.github.javafaker.Faker;
import com.github.javafaker.File;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-Us"));
    private String name, lastName, email, mobileNumber, birthDay, subjects, Picture, CurrentAddress, State, City, filepath, selectPicuture, sheetName;

    public String getName() {
        return name;
    }

    public String getLastName() { return lastName; }
    public String getEmail() { return email;}
    public String getMobileNumber() {return mobileNumber;    }
    public String getBirthDay() {return birthDay;}
    public String getSubjects() {return subjects;}
    public String getFilepath() {return filepath;}
    public String getSheetName() {
        return sheetName;
    }
    public String getPicture() { return selectPicuture; }
    public String getCurrentAddress() { return CurrentAddress;}
    public String getState(){return State;}
    public String getCity(){return City;}

    public DataInjection(){
        this.name=faker.name().name();
        this.lastName=faker.name().lastName();
        this.email=faker.internet().emailAddress();
        this.mobileNumber=Integer.toString(faker.number().numberBetween(1000000000,1999999999));
        this.birthDay=faker.date().birthday().toString();
        this.subjects="Arts";
        this.selectPicuture="C:\\Users\\Isabel\\Downloads\\perfil.png";
        this.CurrentAddress=faker.address().fullAddress();
        this.State="NCR";
        this.City="Delhi";
        this.filepath="resources/ExceldemoqaIsabel.xlsx";
        this.sheetName="mipracticademoqa";



    }



}