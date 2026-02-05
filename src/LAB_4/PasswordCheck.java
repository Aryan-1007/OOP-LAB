package LAB_4;

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
        System.out.println(isValid("abc11sec"));
        System.out.println(isValid("a123123"));
    }
}
