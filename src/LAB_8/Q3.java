package LAB_8;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];

        System.out.println("Enter 10 names:");

        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine().trim();

            if (names[i].isEmpty()) {
                System.out.println("Invalid input. Enter again:");
                i--;
                continue;
            }

            if (names[i].length() <= 3) {
                System.out.println("Name too short, must be >3 chars. Enter again:");
                i--;
                continue;
            }

            names[i] = names[i].substring(3);
        }

        Arrays.sort(names);

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
