import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();

        double pi = Math.PI;

        double diameter = 2 * radius;
        double circumference = 2 * pi * radius;
        double area = pi * radius * radius;

        System.out.println("Diameter of the circle: " + diameter);
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);

        sc.close();
    }
}
