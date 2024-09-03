import java.util.Scanner;
public class NumberComparison{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int square = number * number;

        System.out.println("Number: " + number);
        System.out.println("Square: " + square);

        System.out.println("Number is " + (number > 100 ? "greater" : number == 100 ? "equal" : "less") + " than 100.");
        System.out.println("Square is " + (square > 10000 ? "greater" : square == 10000 ? "equal" : "less") + " than 10000.");
    }
}


