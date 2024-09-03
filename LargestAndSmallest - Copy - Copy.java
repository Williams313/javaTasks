import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MINIMUM_VALUE;
        int smallest = Integer.MAXIMUM_VALUE;

        for (int count = 0; count < 5; count++) {
            System.out.print("Enter integer " + (count + 1) + ": ");
            int num = scanner.nextInt();

            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Largest integer: " + largest);
        System.out.println("Smallest integer: " + smallest);
    }
}
