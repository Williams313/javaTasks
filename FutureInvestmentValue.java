import java.util.Scanner;
public class InvestmentValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble() / 100;

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 12;
        double futureInvestmentValue = investmentAmount;

        for (int count = 0; count <years * 12; count++) {
            futureInvestmentValue = futureInvestmentValue * (1 + monthlyInterestRate);
}

System.out.println("akerele future intrest lalue is: " + FutureInvestmentValue);

}

}
