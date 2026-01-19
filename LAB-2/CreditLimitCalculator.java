import java.util.Scanner;

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

        double newBalance = balance + charges - credits;

        System.out.println("New balance: " + newBalance);

        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded!");
        }
        sc.close();
    }
}
