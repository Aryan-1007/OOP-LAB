package CASE_BASE;

import java.util.Scanner;

import static java.lang.Math.abs;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightPounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInches = input.nextDouble();

        // Conversions
        double weightKg = abs(weightPounds) * 0.45359237;
        double heightMeters =abs( heightInches) * 0.0254;

        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.println("BMI is " + bmi);

        input.close();
    }
}
