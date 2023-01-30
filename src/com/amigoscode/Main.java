package com.amigoscode;

public class Main {

    public static String foo = "foo-bar";   // static data member, its part of class no Instance, therefore we can access it without  creating Object.

    public String fuu = "fuu-bar";    // non-static data member, its part of class Instance, therefore we have to   create Object to access it.

    public static void main(String[] args) {

        // for foo (static data member), we do not need to create object.
        System.out.println(
                Main.foo
        );

                   // OR  //

        System.out.println(
                foo
        );


        // for fuu (non-static data member). we have to create object of class
        Main main = new Main();

        System.out.println(
                main.fuu
        );

    }

}