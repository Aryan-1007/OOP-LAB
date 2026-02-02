package q4;

import java.util.HashSet;

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
        System.out.println(isPerfect("abshdkqwertyuioplmnvczx"));
        System.out.println(isPerfect("hello"));
    }
}
