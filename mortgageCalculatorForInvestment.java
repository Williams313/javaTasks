
import java.util.Scanner;

public class mortgageCalculatorForInvestment { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble() / 100;

        System.out.print("Enter duration of years: ");
        int years = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 12;
        double futureInvestmentValue = investmentAmount;

        for (int i = 0; i < years * 12; i++) {
            futureInvestmentValue *= (1 + monthlyInterestRate);
        }

        System.out.print("Future investment value: " + futureInvestmentValue);
}
}