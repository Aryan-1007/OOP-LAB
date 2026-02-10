package LAB_4;

import java.util.HashSet;
import java.util.Scanner;

public class PerfectString {

    public static boolean isPerfect(String s) {
        HashSet<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (set.contains(c))
                return false;
            set.add(c);
        }
        return true;
    }

    public static void main(String[] args) {
        String s;
        System.out.println("Enter the string: ");
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        System.out.println(isPerfect(s)?"It is perfect string!":"It is not perfect string!");
    }
}
