

import java.util.Scanner;

public class pizzaApp{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Lamberts Pizza!");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Pizza Size | Number Of Slices | Price Per Box | Price per One Slice");
        System.out.println("---------------------------------------------------------------");
        System.out.println("1->: Sapa Size   | 4  | 2,200 | 500");
        System.out.println("2->: Small money | 6  | 2,400 | 400");
        System.out.println("3->: Big boys    | 8  | 3,000 | 375");
        System.out.println("4->: Odogwu      | 12 | 4,200 | 350");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Select Your Preferred Pizza Order: ");

        int pizzaOrder = input.nextInt();
        System.out.print("Enter the number of guests: ");
        int numberOfGuests = input.nextInt();

        System.out.print("Enter the number of pizzas: ");
        int numberOfPizzas = input.nextInt();

        switch (pizzaOrder) {
            case 1:
                SapaSize(numberOfGuests, numberOfPizzas);
                break;
            case 2:
                SmallMoney(numberOfGuests, numberOfPizzas);
                break;
            case 3:
                BigBoys(numberOfGuests, numberOfPizzas);
                break;
            case 4:
                Odogwu(numberOfGuests, numberOfPizzas);
                break;
            default:
                System.out.println("Invalid pizza order");
        }
    }

    public static void SapaSize(int numberOfGuests, int numberOfPizzas) {
        int pricePerBox = 2200;
        int pricePerSlice = 500;
        int numberOfSlices = 4;
        calculatePriceAndLeftover(numberOfGuests, numberOfPizzas, pricePerBox, pricePerSlice, numberOfSlices);
    }

    public static void SmallMoney(int numberOfGuests, int numberOfPizzas) {
        int pricePerBox = 2400;
        int pricePerSlice = 400;
        int numberOfSlices = 6;
        calculatePriceAndLeftover(numberOfGuests, numberOfPizzas, pricePerBox, pricePerSlice, numberOfSlices);
    }

    public static void BigBoys(int numberOfGuests, int numberOfPizzas) {
        int pricePerBox = 3000;
        int pricePerSlice = 375;
        int numberOfSlices = 8;
        calculatePriceAndLeftover(numberOfGuests, numberOfPizzas, pricePerBox, pricePerSlice, numberOfSlices);
    }

    public static void Odogwu(int numberOfGuests, int numberOfPizzas) {
        int pricePerBox = 4200;
        int pricePerSlice = 350;
        int numberOfSlices = 12;
        calculatePriceAndLeftover(numberOfGuests, numberOfPizzas, pricePerBox, pricePerSlice, numberOfSlices);
    }

    public static void calculatePriceAndLeftover(int numberOfGuests, int numberOfPizzas, int pricePerBox, int pricePerSlice, int numberOfSlices) {
        int totalCost = numberOfPizzas * pricePerBox;
        int totalSlices = numberOfPizzas * numberOfSlices;
        int slicesPerGuest = totalSlices / numberOfGuests;
        int leftoverSlices = totalSlices - (numberOfGuests * slicesPerGuest);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Total Slices: " + totalSlices);
        System.out.println("Slices per Guest: " + slicesPerGuest);
        System.out.println("Leftover Slices: " + leftoverSlices);
    }
}
