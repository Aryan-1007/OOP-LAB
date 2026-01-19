import java.util.Scanner;

public class ParkingCharges {

    public static double calculateCharges(double hours) {
        double charge = 2.00;

        if (hours > 3) {
            charge += (hours - 3) * 0.50;
        }

        if (charge > 10.00) {
            charge = 10.00;
        }

        return charge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter hours parked for customer " + i + ": ");
            double hours = sc.nextDouble();

            double charge = calculateCharges(hours);
            total += charge;

            System.out.println("Charge: $" + charge);
        }

        System.out.println("Total receipts: $" + total);
        sc.close();
    }
}
