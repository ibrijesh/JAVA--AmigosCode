package com.amigoscode;


public class Main {

    public static void main(String[] args) {
        // Creating Custom Exceptions.

        // Unchecked Exception, can be run without ty and catch
        divide2(4, 0);


        //Checked Exception , cannot be run without try and catch
        try {
            divide1(4, 0);
        } catch (MyCheckedException e) {
            e.printStackTrace();
        }

    }


    public static int divide1(int a, int b) throws MyCheckedException {
        if (b == 0) {
            throw new MyCheckedException("Divide by Zero");
        }
        return a / b;
    }

    public static int divide2(int a, int b) throws MyUnCheckedException {
        if (b == 0) {
            throw new MyUnCheckedException("Divide By Zero");
        }
        return a / b;
    }


}