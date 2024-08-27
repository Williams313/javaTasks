ppublic class IntegerNum {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number between 1 and 10");
int num = scanner.nextint();

int sum = 0;
while (num > 0){
 num /=10;
System.out.print("sum of number is"+sum);
}
}
}