public class MonteCarloSimulation {
    public static void main(String[] args) {

        int trials = 1000000;
        int oddCount = 0;

        for (int i = 0; i < trials; i++) {

            double x = Math.random() * 2 - 1;
            double y = Math.random() * 2 - 1;

            if (x < 0 || (x > 0 && y < x && y > -x)) {
                oddCount++;
            }
        }

        double probability = (double) oddCount / trials;
        System.out.println("The probability is " + probability);
    }
}
