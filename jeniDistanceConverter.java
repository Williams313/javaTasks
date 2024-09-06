

public class jeniDistanceConverter {
    public static double mileToKilometer(double mile) {
        return mile * 1.60934;
    }

    public static double kilometerToMile(double kilometer) {
        return kilometer / 1.60934;
    }
}


Here's an explanation of the code:

- The mileToKilometer method takes a distance in miles as input and returns the equivalent distance in kilometers. It uses the conversion factor 1 mile = 1.60934 kilometers.
- The kilometerToMile method takes a distance in kilometers as input and returns the equivalent distance in miles. It uses the conversion factor 1 kilometer = 1/1.60934 miles.

You can use this class in your program like this:


public class Main {
    public static void main(String[] args) {
        double miles = 10.0;
        double kilometers = DistanceConverter.mileToKilometer(miles);
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers");

        kilometers = 20.0;
        miles = DistanceConverter.kilometerToMile(kilometers);
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles");
    }
}


