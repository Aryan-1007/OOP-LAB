package com.LAB6;

import static java.lang.Math.abs;

public class Bank {
    static int balance=0;
    public static void deposit(int amount)
    {
        balance=balance+abs(amount);
        System.out.println("\n\n\n");
    }
    public static void withdraw(int amount)
    {
        balance=balance-abs(amount);
        if(balance<0)
        {
            System.out.println("Insufficient balance");
        }
        else {
            System.out.println("Amount Withdrawn is "+amount);
        }
        System.out.println("\n\n\n");
    }
    public static void setBalance(int amount)
    {
        balance=abs(amount);
        System.out.println("\n\n\n");
    }
    public  static void getBalance()
    {
        System.out.println("Your current account balance is "+balance);
        System.out.println("\n\n\n");
    }
}
