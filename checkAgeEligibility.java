import java.util.Scanner;

 public class checkAgeEligibility{
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

System.out.print("Enter ur age :");
int age = scanner.nextInt();

 if (age < 18)
 System.out.println
 ("Cannot get a driver's license");
else
 System.out.println
 ("Can get a driver's license");

}
}