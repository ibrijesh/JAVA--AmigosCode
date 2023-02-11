package com.amigoscode;


import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        // OOPs-Encapsulation

        BankAccount account = new BankAccount("Amigos", BigDecimal.TEN, false);
        System.out.println(
                account.withdraw(new BigDecimal("9.0"))
        );

        System.out.println(account.balance); // 1.0

        System.out.println(
                account.withdraw(new BigDecimal("1.0"))
        );

        System.out.println(account.balance); //0.0

        /* but system is manipulated */
        account.balance = new BigDecimal("100.0");

        System.out.println(account.balance);


    }

}