package LAB_8;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String text = sc.nextLine().trim();

        if (text.isEmpty()) {
            System.out.println("Invalid input");
            return;
        }

        String[] words = text.split("\\s+"); // handles multiple spaces
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }

        System.out.println("Result: " + result.toString().trim());
    }
}
