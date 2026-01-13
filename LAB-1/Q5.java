import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int temp = num;
        int divisor = 1;

        while (temp >= 10) {
            divisor *= 10;
            temp /= 10;
        }

        while (divisor > 0) {
            System.out.print(num / divisor + " ");
            num = num % divisor;
            divisor /= 10;
        }

        sc.close();
    }
}
