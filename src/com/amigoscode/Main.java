package com.amigoscode;


public class Main {

    public static void main(String[] args) {
       // Strings //

        /* These are String Literal , they are referenced in String Pool */

        String name1="Jamila";
        String name2="Jamila";

        // both are pointing(referencing) to same memory location in String Pool.  (see photos)
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());


        name2="Alex";

        // now both are pointing(referencing) to Different memory location in String Pool. (see photos)
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());

    }


}