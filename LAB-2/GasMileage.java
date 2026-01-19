import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalMiles = 0, totalGallons = 0;

        while (true) {
            System.out.print("Enter miles driven (-1 to quit): ");
            double miles = sc.nextDouble();
            if (miles == -1)
                break;

            System.out.print("Enter gallons used: ");
            double gallons = sc.nextDouble();

            double mpg = miles / gallons;
            System.out.println("Miles per gallon: " + mpg);

            totalMiles += miles;
            totalGallons += gallons;
        }

        if (totalGallons != 0) {
            System.out.println("Combined MPG: " + (totalMiles / totalGallons));
        }
        sc.close();
    }
}
