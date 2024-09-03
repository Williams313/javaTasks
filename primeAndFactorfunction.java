 
import java.util.Scanner;

 public class primeAndFactorfunction {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 System.out.println("Check if number are prime: ");
  int number = input.nextInt();
  
 if(isPrime(number)) {

System.out.print(number + " :is a prime number");
System.out.print("factors of " + number + " are 1," + number);
 }else{ 
System.out.print(number + " :is not prime number");
System.out.print("factors of " + number + ": are: ");
	printFactors(number);

}
}

public static boolean isPrime( int number) {

for(int count =2; count <= number / 2; count++) {
if(number % count == 0){
return false;

 }
}
return true;
 }

public static void printFactors(int number) {

for(int count=1; count <= number; count++) {
 if(number %count == 0){ 
System.out.print(count + " ");



}
}
}
}
