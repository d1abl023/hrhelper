package com.d1abl023.alien.model;

import com.d1abl023.alien.tables.UserGeneralData;
import com.d1abl023.alien.tables.UserNameData;

import java.io.Serializable;
import java.util.Date;

public class JSUser implements Serializable {

    private String id;

    private String firstName;

    private String secondName;

    private String lastName;

    private String email;

    private Date date;

    private String sex;

    private long number;

    private String country;

    private String city;

    private String placeOfWork;

    private String position;

    private String education;

    private int amountOfMentions;

    public JSUser() {
    }

    public JSUser(String id, String firstName, String secondName, String lastName, String email, Date date,
                  String sex, long number, String country, String city, String placeOfWork, String position,
                  String education, int amountOfMentions) {
        this.id = id;
        this.email = email;
        this.date = date;
        this.sex = sex;
        this.number = number;
        this.country = country;
        this.city = city;
        this.placeOfWork = placeOfWork;
        this.position = position;
        this.education = education;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.amountOfMentions = amountOfMentions;
    }

    public JSUser(UserGeneralData userGeneralData, UserNameData userNameData) {
        this.id = Long.toString(userGeneralData.getId());
        this.email = userGeneralData.getEmail();
        this.date = userGeneralData.getDate();
        this.sex = userGeneralData.getSex();
        this.number = userGeneralData.getPhoneNumber();
        this.country = userGeneralData.getCountry();
        this.city = userGeneralData.getCity();
        this.placeOfWork = userGeneralData.getPlaceOfWork();
        this.position = userGeneralData.getPosition();
        this.education = userGeneralData.getEducation();
        this.firstName = userNameData.getFirstName();
        this.secondName = userNameData.getSecondName();
        this.lastName = userNameData.getLastName();
        this.amountOfMentions = userGeneralData.getAmountOfMentions();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getAmountOfMentions() {
        return amountOfMentions;
    }

    public void setAmountOfMentions(int amountOfMentions) {
        this.amountOfMentions = amountOfMentions;
    }
}
