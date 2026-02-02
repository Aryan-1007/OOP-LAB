package q5;

public class PatternInRange {

    public static void main(String[] args) {
        int a = 0, b = 100;
        String pattern = "13";
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (String.valueOf(i).contains(pattern))
                count++;
        }

        System.out.println("Occurrences: " + count);
    }
}
