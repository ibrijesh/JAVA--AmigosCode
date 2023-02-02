package com.amigoscode;


public class Main {

    public static void main(String[] args) {
        // Strings //

        /* These are String Literal , they are referenced in String Pool (specially created by JVM) in Heap */

        String name1 = "Jamila";
        String name2 = "Jamila";

        // both are pointing(referencing) to same memory location in String Pool.  (see photos)
        if (name1 == name2)                   // reference to same memory location.
            System.out.println("Same");
        else
            System.out.println("Different");



        /* These are String  Object , they reference in normal Heap. */

        String name3 = new String("Brijesh");
        String name4 = new String("Brijesh");

        // now both are pointing(referencing) to Different memory location in normal  Heap. (see photos)
        if (name3 == name4)                   // reference to different memory location.
            System.out.println("Same");
        else
            System.out.println("Different");

    }


}