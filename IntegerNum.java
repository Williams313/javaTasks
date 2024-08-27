public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number from 1 to 10: ");
        int number = scanner.nextInt();

        String[] words = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        if (number >= 1 && number <= 10) {
            System.out.println(words[number]);
        } else {
            System.out.println("Invalid input. Please enter a number from 1 to 10.");
        }
    }
}



