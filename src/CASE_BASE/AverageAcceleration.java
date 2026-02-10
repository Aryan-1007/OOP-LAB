package CASE_BASE;

import java.util.Scanner;

import static java.lang.Math.abs;

public class AverageAcceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t (enter velocity along with direction): ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double a = (v1 - v0) /abs(t) ;

        System.out.println("The average acceleration is " + a);
        input.close();
    }
}
