

import java.util.Scanner;

public class jeniTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter citizen name: ");
            String name = scanner.nextLine();

            System.out.println("Enter earnings: ");
            double earnings = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left-over

            double tax;
            if (earnings <= 30000) {
                tax = earnings * 0.15;
            } else {
                tax = 30000 * 0.15 + (earnings - 30000) * 0.20;
            }

            System.out.println("Citizen: " + name);
            System.out.println("Earnings: $" + earnings);
            System.out.println("Total tax: $" + tax);
            System.out.println();
        }

        scanner.close();
    }
  }

