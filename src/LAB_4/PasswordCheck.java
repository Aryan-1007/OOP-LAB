package LAB_4;

import java.util.Scanner;

public class PasswordCheck {

    public static boolean isValid(String pwd) {
        if (pwd.length() < 5 || pwd.length() > 12)
            return false;

        boolean hasLower = false, hasDigit = false;

        for (int i = 0; i < pwd.length(); i++) {
            char c = pwd.charAt(i);

            if (Character.isUpperCase(c) || !Character.isLetterOrDigit(c))
                return false;

            if (Character.isLowerCase(c))
                hasLower = true;

            if (Character.isDigit(c))
                hasDigit = true;

            for (int len = 1; len <= pwd.length() / 2; len++) {
                for (int j = 0; j + 2 * len <= pwd.length(); j++) {
                    String sub1 = pwd.substring(j, j + len);
                    String sub2 = pwd.substring(j + len, j + 2 * len);
                    if (sub1.equals(sub2))
                        return false;
                }
            }

        }

        return hasLower && hasDigit;
    }

    public static void main(String[] args) {
        String s;
        System.out.println("Enter Password: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println(isValid(s));
    }
}
