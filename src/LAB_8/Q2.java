package LAB_8;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String text = sc.nextLine().trim();

        if (text.isEmpty()) {
            System.out.println("Invalid input");
            return;
        }

        boolean found = false;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if ("aeiou".indexOf(ch) != -1) {
                System.out.println("Vowel: " + ch + " at position: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No vowels found");
        }
    }
}