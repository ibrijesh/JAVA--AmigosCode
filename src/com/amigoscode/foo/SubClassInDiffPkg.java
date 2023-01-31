package com.amigoscode.foo;

import com.amigoscode.Main;

// SubClass, Derived Class, Extend Class in Different Package //

public class SubClassInDiffPkg extends Main {
    public static void main(String[] args) {

        // for foo (static data member), we do not need to create object.
            System.out.println(
                    Main.foo
            );

                // OR  //

            System.out.println(
                    foo
            );


        // calling public main method.
            Main.main(null);

    }

}
