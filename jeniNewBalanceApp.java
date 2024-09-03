import java.util.Scanner;

public class jeniNewBalanceApp {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter beginning balance: ");
        int beginningBalance = scanner.nextInt();

      System.out.print("Enter charges: ");
        int charges = scanner.nextInt();

      System.out.print("Enter credit limit: ");
        int creditLimit = scanner.nextInt();

        System.out.print("Enter credit: ");
        int credit = scanner.nextInt();

        int newBalance = beginningBalance + charges - credit;

        System.out.print("New balance is: " + newBalance);

        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        }
       }
       }


