package LAB_6;

import com.LAB6.Bank;
import java.util.Scanner;

public class Q5 {
    static void main(String[] args) {
        int choice;
        int amount;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bank Management System");

        System.out.println("Enter the amount you want to balance:");
        amount = input.nextInt();
        Bank.setBalance(amount);
        do {

            System.out.println("Please enter your choice");
            System.out.println("1. Deposit Amount\n2. Withdraw Amount\n3. Get Current Balance\n4. To exit\n");

            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Your Deposit Amount ");
                    amount = input.nextInt();
                    Bank.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter Your Withdraw Amount ");
                    amount = input.nextInt();
                    Bank.withdraw(amount);
                    break;
                case 3:
                    Bank.getBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using Bank Management System");
                    System.exit(0);
            }
        }while(true);
    }
}
