package LAB_5;
import java.util.Scanner;

public class Q7 {
    static char[] correctAnswers = {'C', 'A', 'B', 'D', 'B','C','C','A'};
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = correctAnswers.length;

        char[] studentAnswers = new char[n];

        System.out.println("Enter student answers (Enter X if unanswered):");

        for (int i = 0; i < n; i++) {
            System.out.print("Question " + (i + 1) + ": ");
            studentAnswers[i] = Character.toUpperCase(sc.next().charAt(0));
        }

        int correct = 0;
        int wrong = 0;
        int unanswered = 0;

        System.out.println("\nQUESTION  SUBMITTED  CORRECT  RESULT");
        System.out.println("-------------------------------------");

        for (int i = 0; i < n; i++) {

            String result;

            if (studentAnswers[i] == 'X') {
                result = "UNANSWERED";
                unanswered++;
            }
            else if (studentAnswers[i] == correctAnswers[i]) {
                result = "CORRECT";
                correct++;
            }
            else {
                result = "WRONG";
                wrong++;
            }

            System.out.printf("   %d         %c         %c      %s%n",
                    i + 1,
                    studentAnswers[i],
                    correctAnswers[i],
                    result);
        }

        System.out.println("\nNo. of correct answers: " + correct);
        System.out.println("No. of wrong answers: " + wrong);
        System.out.println("No. of questions unanswered: " + unanswered);

        sc.close();
    }
}
