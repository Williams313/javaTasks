import java.util.Scanner;

public class SquaredCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        int square1 = num1 * num1;
        int square2 = num2 * num2;

        int sumOfSquares = square1 + square2;
        int differenceOfSquares = square1 - square2;

        System.out.println("Square of first integer: " + square1);
        System.out.println("Square of second integer: " + square2);
        System.out.println("Sum of squares: " + sumOfSquares);
        System.out.println("Difference of squares: " + differenceOfSquares);
    }
}
