package LAB_7;

enum Result {
    CORRECT, WRONG, NOT_ANSWERED
}

public class Q7 {

    public static void main(String[] args) {

        char[] correctAnswers = {'C', 'A', 'B', 'D'};

        try {
            if (args.length != 4)
                throw new IllegalArgumentException("Provide exactly 4 answers as arguments.");

            char[] submitted = new char[4];
            Result[] results = new Result[4];
            int correctCount = 0, wrongCount = 0;

            for (int i = 0; i < 4; i++) {
                submitted[i] = Character.toUpperCase(args[i].charAt(0));

                if (submitted[i] == 'X') {
                    results[i] = Result.NOT_ANSWERED;
                } else if (submitted[i] == correctAnswers[i]) {
                    results[i] = Result.CORRECT;
                    correctCount++;
                } else {
                    results[i] = Result.WRONG;
                    wrongCount++;
                }
            }

            System.out.println("Q  SUBMITTED  CORRECT  RESULT");
            for (int i = 0; i < 4; i++) {
                System.out.println((i+1) + "     " + submitted[i] +
                        "         " + correctAnswers[i] +
                        "       " + results[i]);
            }

            System.out.println("\nCorrect: " + correctCount);
            System.out.println("Wrong: " + wrongCount);

            if (correctCount >= 2)
                System.out.println("Candidate Passed");
            else
                System.out.println("Candidate Failed");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
