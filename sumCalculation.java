import java.util.Scanner;

public class sumCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int result = 1;
        for (int count = 0; count < exponent; count++) {
            result *= base;
        }

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close();
    }
}
