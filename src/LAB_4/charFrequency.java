package LAB_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class charFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        System.out.println("Enter the string: ");
        str = input.nextLine();
        int n;
        System.out.println("Enter limit of characters: ");
        n=input.nextInt();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() > n)
                System.out.println(e.getKey());
        }
    }
}