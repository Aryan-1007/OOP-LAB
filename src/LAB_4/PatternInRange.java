package LAB_4;

import java.util.Scanner;

public class PatternInRange {

    public static void main(String[] args) {
        int a = 0, b = 100;
        String pattern;
        System.out.println("Enter the search pattern: ");
        Scanner sc = new Scanner(System.in);
        pattern = sc.nextLine();
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (String.valueOf(i).contains(pattern))
                count++;
        }

        System.out.println("Occurrences: " + count);
    }
}
