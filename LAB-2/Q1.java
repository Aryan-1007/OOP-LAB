import java.util.Scanner;

class DrivingCost {
    double miles;
    double gasoline;
    double fees;
    double toll;    

    DrivingCost(double miles, double gasolline, double fees, double toll) {
        this.toll = toll;
        this.fees = fees;
        this.miles = miles;
        this.gasoline = gasolline;
    }

}

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of miles travelled in a day(in double): ");
        double miles = sc.nextDouble();
        System.out.println("Enter the price of gasoline per gallon(in double): ");
        double gasoline = sc.nextDouble();
        System.out.println("Enter the fees of travelling of the day(in double): ");
        double fees = sc.nextDouble();
        System.out.println("Enter the toll fees of the day(in double): ");
        double toll = sc.nextDouble();
        DrivingCost a = new DrivingCost(miles, gasoline, fees, toll);

    }
}
