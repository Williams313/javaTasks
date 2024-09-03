import java.util.Scanner;

public class kata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number you wish to perform calculation with:");
        System.out.println("1 -> Check if number is prime or not");
        System.out.println("2 -> Divide 2 numbers");
        System.out.println("3 -> Check if number is even");
        System.out.println("4 -> Check if number is palindrome");
        System.out.println("5 -> Check for square of number");
        System.out.println("6 -> Check for number's factorial");
        System.out.println("7 -> Subtract 2 numbers");
        System.out.println("8 -> Check if number gives square multiple");
        int choice = input.nextInt();
        int number = input.nextInt();

        switch (choice) {
            case 1:
                if (isPrime(number)) {
                    System.out.println(number + " is a prime number");
                } else {
                    System.out.println(number + " is not a prime number");
                }
                break;
            case 2:
                System.out.println("Divide " + number + " by: ");
                int divisor = input.nextInt();
                System.out.println("Result: " + divide(number, divisor));
                break;
            case 3:
                System.out.println("Is " + number + " even? " + isEven(number));
                break;
            case 4:
                System.out.println("Is " + number + " a palindrome? " + isPalindrome(number));
                break;
            case 5:
                System.out.println("Square of " + number + ": " + squareOf(number));
                break;
            case 6:
                System.out.println("Factorial of " + number + ": " + factorialOf(number));
                break;
            case 7:
                System.out.println("Subtract from " + number + ": ");
                int subtrahend = input.nextInt();
                System.out.println("Result: " + subtract(number, subtrahend));
                break;
            case 8:
                System.out.println("Is " + number + " a square number? " + isSquare(number));
                break;
            default:
                System.out.println("Invalid choice");
        }
        }

     public static boolean isPrime(int number) {
        for (int count = 2; count <= number / 2; count++) {
            if (number % count == 0) {
                return false;
            }
            }
        return true;
      }

    public static void printFactors(int number) {
        for (int count = 1; count <= number; count++) {
            if (number % count == 0) {
                System.out.print(count + " ");
        }
        }
       }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static float divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return (float) a / b;
    }

    public static boolean isSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static long factorialOf(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }

    public static long squareOf(int num) {
        return (long) num * num;
    }

}









