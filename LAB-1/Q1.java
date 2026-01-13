import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = input.nextInt();

        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        System.out.println("Sum: " + (a + b));
        System.out.println("Product: " + (a * b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Quotient: " + (a / b));
        input.close();
    }
}
