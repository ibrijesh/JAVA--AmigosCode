package com.amigoscode;


public class Main {

    public static void main(String[] args) {
        // Throwing

        camila(); // camila have handled the exception already in its method.

        try {
            jamila();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            john();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // camila want to handle the Checked exception on its own.
    public static void camila() {
        try {
            jamila();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // jamila does not want to handle the Checked exception on its own.

    public static void jamila() throws Exception {
        john();
    }

    // john want to handle the Checked exception on its own.

    public static void john() throws Exception {
        divide(4, 0);
    }

    public static int divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Divide by Zero");
        }
        return a / b;
    }


}