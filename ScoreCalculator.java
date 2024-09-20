
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ScoreCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10;
        double[] scores = new double[n];

        // Input scores
        for (int i = 0; i < n; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
        }

        // Define lambda functions
        Function<double[], Double> sum = (scores1) -> {
            double sum = 0;
            for (double score : scores1) {
                sum += score;
            }
            return sum;
        };

        BiFunction<double[], Integer, Double> sumEvenIndexes = (scores1, n1) -> {
            double sum = 0;
            for (int i = 1; i < n1; i += 2) {
                sum += scores1[i];
            }
            return sum;
        };

        Function<double[], Double> sumEvenNumbers = (scores1) -> {
            double sum = 0;
            for (double score : scores1) {
                if (score % 2 == 0) {
                    sum += score;
                }
            }
            return sum;
        };

        Function<double[], Double> countEvenNumbers = (scores1) -> {
            double count = 0;
            for (double score : scores1) {
                if (score % 2 == 0) {
                    count++;
                }
            }
            return count;
        };

        Function<double[], Double> sumValidScores = (scores1) -> {
            double sum = 0;
            for (double score : scores1) {
                if (score > 0) {
                    sum += score;
                }
            }
            return sum;
        };

        Function<double[], Double> countValidScores = (scores1) -> {
            double count = 0;
            for (double score : scores1) {
                if (score > 0) {
                    count++;
                }
            }
            return count;
        };

        // Calculate statistics
        double average = sum.apply(scores) / n;
        double averageEvenNumbers = sumEvenNumbers.apply(scores) / countEvenNumbers.apply(scores);
        double averageValidScores = sumValidScores.apply(scores) / countValidScores.apply(scores);

        // Print results
        System.out.println("Sum: " + sum.apply(scores));
        System.out.println("Average: " + average);
        System.out.println("Sum even indexes: " + sumEvenIndexes.apply(scores, n));
        System.out.println("Sum even numbers: " + sumEvenNumbers.apply(scores));
        System.out.println("Average even numbers: " + averageEvenNumbers);
        System.out.println("Sum valid scores: " + sumValidScores.apply(scores));
        System.out.println("Average valid scores: " + averageValidScores);
    }
}



