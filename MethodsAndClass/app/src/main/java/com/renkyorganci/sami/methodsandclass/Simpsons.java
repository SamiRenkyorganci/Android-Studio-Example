package com.renkyorganci.sami.methodsandclass;

/**
 * Created by sami on 13.05.2018.
 */

public class Simpsons {

    private String name;
    private String occupation;
    private int age;

    public Simpsons(String name, String occupation, int age) {
        this.name = name;
        this.occupation = occupation;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
