import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = input.nextInt();

        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        System.out.print("Enter third integer: ");
        int c = input.nextInt();

        int sum = a + b + c;
        int product = a * b * c;
        double average = sum / 3.0;

        int largest = Math.max(a, Math.max(b, c));
        int smallest = Math.min(a, Math.min(b, c));

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        input.close();
    }
}
