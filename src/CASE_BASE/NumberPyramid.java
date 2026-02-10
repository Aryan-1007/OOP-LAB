package CASE_BASE;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        int maxNumber = (int) Math.pow(2, rows - 1);
        int width = String.valueOf(maxNumber).length() + 1;

        for (int i = 1; i <= rows; i++) {

            for (int s = rows - i; s > 0; s--) {
                System.out.printf("%" + width + "s", "");
            }

            int num = 1;

            for (int j = 1; j <= i; j++) {
                System.out.printf("%" + width + "d", num);
                num *= 2;
            }

            num /= 4;
            for (int j = 1; j < i; j++) {
                System.out.printf("%" + width + "d", num);
                num /= 2;
            }

            System.out.println();
        }

        input.close();
    }
}
