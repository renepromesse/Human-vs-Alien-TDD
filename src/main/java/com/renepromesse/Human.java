package com.renepromesse;

public class Human extends Species {
    private String country;
    private String language;

    public Human(String name, int age, String height, String weight, String country, String language) {
        super(name, age, height, weight);
        this.country = country;
        this.language = language;
    }

    public void study(String subject) {
        System.out.println("I'm studying " + subject);
    }

    public void drive(String carName) {
        System.out.println("I'm driving " + carName);
    }

    public void swim(String style) {
        System.out.println("I'm performing a " + style + " swim.");
    }

    // getters and setters

    public String getCountry() {
        return this.country;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
