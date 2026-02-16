package LAB_5;

//import static LAB_5.Tax.calculateNetPay;

import java.util.Scanner;
import static java.lang.Math.abs;

class Tax {
    static double calculateTax(double grossPay) {
        return grossPay * 0.15;
    }

    static double calculateNetPay(int hoursWorked) {
        double gross = hoursWorked * 12;
        return gross - calculateTax(gross);
    }
}
public class Q5 {
    public static void main(String[] args) {
        System.out.println("Enter number of hours worked:");
        int hours ;
        Scanner input = new Scanner(System.in);
        hours = input.nextInt();
        System.out.println("Net Pay: $" + Tax.calculateNetPay(abs(hours)));
        input.close();
    }
}