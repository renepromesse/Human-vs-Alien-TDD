package com.renepromesse;

public class Specy {
    private String name;
    private int age;
    private String height;
    private String weight;

    public Specy(String name, int age, String height, String weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String speak() {
        return "Hey there, we can discuss if you want...";
    }

    public void walk(String meters) {
        System.out.println("I have walked " + meters);
    }

    public void jump(String meters) {
        System.out.println("I have jumped " + meters);
    }

    public void sleep(int minutes) {
        System.out.println("I have slept for " + minutes + " minutes long.");
    }

    // getters and setters

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getHeight() {
        return this.height;
    }

    public String getWeight() {
        return this.weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
