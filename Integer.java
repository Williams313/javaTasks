        import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("enter a number for ");
double radius = scanner.nextDouble();
 
 double areaNum = radius * radius * 3.14159;

System.out.printf("The area for the circle of radius " +  radius + " is "  + areaNum);

}
} 