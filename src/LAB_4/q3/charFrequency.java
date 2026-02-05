package LAB_4.q3;

import java.util.HashMap;
import java.util.Map;

public class charFrequency {
    public static void main(String[] args) {
        String str = "aabcdeaabcjlkjerwlaaabbsadfdsf";
        int n = 3;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() > n)
                System.out.println(e.getKey());
        }
    }
}