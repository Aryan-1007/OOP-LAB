package LAB_7;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter principal amount: ");
            double principal = sc.nextDouble();

            if (principal <= 0)
                throw new IllegalArgumentException("Principal must be positive.");

            System.out.print("Enter annual interest rate (in decimal, e.g., 0.05): ");
            double rate = sc.nextDouble();

            if (rate < 0)
                throw new IllegalArgumentException("Interest rate cannot be negative.");

            System.out.print("Enter number of months: ");
            int months = sc.nextInt();

            if (months < 0)
                throw new IllegalArgumentException("Months cannot be negative.");

            double years = months / 12.0;
            double totalInterest = principal * rate * years;
            double balance = principal + totalInterest;

            System.out.println("Total Interest: " + totalInterest);
            System.out.println("Final Balance: " + balance);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}