import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


System.out.print("Enter point 1 (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter point 2 (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Enter point 3 (x3, y3): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double side1 = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        double side2 = (x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2);
        double side3 = (x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3);

        double s = (side1 + side2 + side3) / 2;

        double area = calculateSquareRoot(s * (s - side1) * (s - side2) * (s - side3));

        System.out.println("Area: " + area);
 }

    public static double calculateSquareRoot(double value) {
        double guess = value / 2;
        while (true) {
            double betterGuess = (guess + value / guess) / 2;
            if (guess - betterGuess < 0.0001 && guess - betterGuess > -0.0001) {
                return betterGuess;
            }
            guess = betterGuess;
        }
    }
}
