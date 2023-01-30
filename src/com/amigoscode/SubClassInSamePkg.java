package com.amigoscode;

// SubClass, Derived Class, Extend Class in Same Package //

public class SubClassInSamePkg extends Main{
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

        // calling public main method.
            Main.main(null);
    }
}
