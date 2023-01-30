package com.amigoscode;

public class Foo {

    public static void main(String[] args) {
        // for foo (static data member), we do not need to create object.
        System.out.println(
                Main.foo
        );

        // for fuu (non-static data member). we have to create object of class
        Main main = new Main();

        System.out.println(
                main.fuu
        );
    }
}
