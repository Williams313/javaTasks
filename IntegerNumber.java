 import java.util.Scanner;

public class IntegerNumber {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter number one: ");
        int numberOne = scanner.nextInt();
System.out.print("Enter number two");
int numberTwo = scanner.nextInt();

if (numberOne > numberTwo) {
     System.out.print("numberOne is greater");

} else if (numberTwo > numberOne){
    System.out.print("numberTwo is greater");

} else  {
System.out.print("numberTwo is greater");

}
}
}