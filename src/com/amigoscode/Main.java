package com.amigoscode;

import java.util.Arrays;

public class Main {

    // static var foo="bar";   var not allowed

    public static void main(String[] args) {
        // Type Inference with var keyword , it works with local variable only //

        var name = "Brijesh";
        var names = new String[]{"CR7", "CJ7", "Ram", "Bheem", "Raju"};
        var age=22;
        var balance =1_000_000.33;



        System.out.println(name);
        System.out.println(
                Arrays.toString(names)
        );
        System.out.println(age);
        System.out.println(balance);

    }

}