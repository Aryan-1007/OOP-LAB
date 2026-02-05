package LAB_2;

import java.util.Scanner;

class Account {
    int account;
    double balance;
    double charges;
    double credits;
    double creditlimit;

    Account(int account, double balance, double charges, double credits, double creditlimit) {
        this.account = account;
        this.balance = balance;
        this.charges = charges;
        this.credits = credits;
        this.creditlimit = creditlimit;
    }
}

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int account = sc.nextInt();

        System.out.print("Enter beginning balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter total charges this month: ");
        double charges = sc.nextDouble();

        System.out.print("Enter total credits this month: ");
        double credits = sc.nextDouble();

        System.out.print("Enter credit limit: ");
        double creditLimit = sc.nextDouble();

        Account ac = new Account(account, balance, charges, credits, creditLimit);
        ac.balance = ac.balance + ac.charges - ac.credits;

        System.out.println("New balance: " + ac.balance);

        if (ac.balance > ac.creditlimit) {
            System.out.println("Credit limit exceeded!");
        }
        sc.close();
    }
}
