package com.amigoscode;

// Sub Class or Child Class
public class Programmer extends Employee {

    private String[] programmingLanguages;

    public Programmer(String name, int age, String address, String experience) {
        super(name, age, address, experience);
    }

    public Programmer(String name, int age, String address, String experience, String[] programmingLanguages) {
        super(name, age, address, experience);
        this.programmingLanguages = programmingLanguages;
    }

    public void writeSomeCode() {
        System.out.println("Programmer Writing Some Code");
    }
}
