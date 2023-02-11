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
        super.sayHi();
        System.out.println(this.name + ": Writing Some Code");
    }

    @Override
    public void sayHi() {
        var msg = """
                Hello  my name is %s
                I am invoked by Programmer Class
                """.formatted(this.name);
        System.out.println(msg);
    }
}
