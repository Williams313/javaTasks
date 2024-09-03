import java.util.Random
import java.util.scanner

public class GuessNumberBreak { 
    public static void main(String[] args) {
Random random = new Random();

int numberOfTrials = 0;
        int maximumTrials = 3;
        int numberToGuess = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Guess the number (between 1 to 10): ");
            int userGuess = scanner.nextInt();
            numberOfTrials++;

            if (userGuess == numberToGuess) {
         System.out.println("hi williams You guessed the number in " + numberOfTrials + " trials.");
             
                break;
            } else if (numberOfTrials < maximumTrials) {
                System.out.println("number too low. The number was " + numberToGuess + ".");
                numberToGuess = random.nextInt(10) + 1;
                maximumTrials += 3;
                System.out.println("You have 3 more trials.");
                numberOfTrials = 0);
            } else {
               default;
                System.out.println("Try again!");
            }
        }

        
    }
}


}