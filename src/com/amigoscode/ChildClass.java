package com.amigoscode;

public class ChildClass extends ParentClass {
    public static void staticMethod() {
        System.out.println("Static Method of Child is called");
    }

    public void nonStaticMethod() {
        System.out.println("Non-Static Method of Child is called");
    }

}
