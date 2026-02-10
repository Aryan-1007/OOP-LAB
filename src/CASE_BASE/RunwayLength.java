package CASE_BASE;

import java.util.Scanner;
import static java.lang.Math.abs;

public class RunwayLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double v = input.nextDouble();
        v=abs(v);
        double a = input.nextDouble();

        double length = (v * v) / (2 * a);

        System.out.println("The minimum runway length for this airplane is " + length);
        input.close();
    }
}
