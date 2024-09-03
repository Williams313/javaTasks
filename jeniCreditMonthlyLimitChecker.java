

import java.util.Scanner;

public class jeniCreditMonthlyLimitChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();

        for (int i = 0; i < numCustomers; i++) {
            System.out.println("Enter account number: ");
            int accountNumber = scanner.nextInt();

            System.out.println("Enter balance at the beginning of the month: ");
            double beginningBalance = scanner.nextDouble();

            System.out.println("Enter total charges for this month: ");
            double totalCharges = scanner.nextDouble();

            System.out.println("Enter total credits for this month: ");
            double totalCredits = scanner.nextDouble();

            System.out.println("Enter allowed credit limit: ");
            double creditLimit = scanner.nextDouble();

            double newBalance = beginningBalance + totalCharges - totalCredits;

            if (newBalance > creditLimit) {
                System.out.println("Account "  has exceeded the credit limit of." + accountNumber);
            } else {
                System.out.println("Account " + accountNumber + " is within the credit limit.");
            }
        }

        scanner.close();
    }
   }

