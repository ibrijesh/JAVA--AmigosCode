package com.amigoscode;

public class Main {

    public static void main(String[] args) {
        // Override

        /* Child class reference and Object */
        ChildClass childClass = new ChildClass();
        childClass.nonStaticMethod();
        childClass.staticMethod();
        System.out.println('\n');


        /* Parent class reference and Object  */

        ParentClass parentClass = new ParentClass();
        parentClass.nonStaticMethod();
        parentClass.staticMethod();
        System.out.println('\n');


        /* Parent class reference but Child Class Object  */

        ParentClass parentChildClass = new ChildClass();
        parentChildClass.nonStaticMethod();    // override by child class
        parentChildClass.staticMethod(); // static method can not override by child class.
        System.out.println('\n');


        /* Child Class reference but Parent Class Object, but not possible */

    }

}