package LAB_5;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String number;
        boolean isHex = true;
        System.out.print("Enter a number: ");
        number = new Scanner(System.in).next();
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);

            if (!((ch >= '0' && ch <= '9') ||
                    (ch >= 'A' && ch <= 'F') ||
                    (ch >= 'a' && ch <= 'f'))) {
                isHex = false;
                break;
            }
        }

        if (isHex)
            System.out.println("Hexadecimal Number");
        else
            System.out.println("Not a Hexadecimal Number");

        System.out.println("Program Ended");
    }
}
