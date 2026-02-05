package LAB_2;

import java.util.Scanner;

public class DrivingCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        double miles = sc.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = sc.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = sc.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parkingFees = sc.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tolls = sc.nextDouble();

        double dailyCost = (miles / milesPerGallon) * costPerGallon
                + parkingFees + tolls;

        System.out.println("Your daily driving cost is: $" + dailyCost);
        sc.close();
    }
}
