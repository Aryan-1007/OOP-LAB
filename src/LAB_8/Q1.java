package LAB_8;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String text = sc.nextLine().trim();

        if (text.isEmpty()) {
            System.out.println("Invalid input: Empty string");
            return;
        }

        System.out.print("Enter word to find: ");
        String word = sc.next().trim();

        if (word.isEmpty()) {
            System.out.println("Invalid word");
            return;
        }

        int first = text.indexOf(word);
        int last = text.lastIndexOf(word);

        if (first == -1) {
            System.out.println("Word not found");
        } else if (first == last) {
            System.out.println("Only one occurrence, nothing in between");
        } else {
            String result = text.substring(first + word.length(), last);
            System.out.println("Between text: " + result);
        }
    }
}
