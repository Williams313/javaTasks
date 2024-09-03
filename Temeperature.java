import java.util.Scanner;
public class Temeperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.print("Enter the amount of water in kilograms: ");
        double m = scanner.nextDouble();

        System.out.print("Enter initial temperature: ");
        double initialTemp = scanner.nextDouble();

        System.out.print("Enter the final temperature in degrees Celsius: ");
        double finalTemp = scanner.nextDouble();

        double q = m * (finalTemp - initialTemp) * 4184;

        System.out.println("Energy needed: " + q + " Joules");
    }
}


