import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightPounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInches = input.nextDouble();

        // Conversions
        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;

        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.println("BMI is " + bmi);

        input.close();
    }
}
