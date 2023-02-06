package com.amigoscode;


public class Main {

    public static void main(String[] args) {
        // Throw and Throws

        System.out.println(divide1(18, 3));

        //  divide2() function may throw Checked Exception, therefore we have cannot run program without handling exception at compile time.
        try {
            System.out.println(divide2(4, 0));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(divide3(40, 4));

    }

    public static int divide1(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divide by Zero");
        }
        return a / b;
    }

    // may throw Checked exception

    public static int divide2(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Divide by Zero");
        }
        return a / b;
    }

    public static int divide3(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Divide by Zero");
        }
        return a / b;
    }


}