import java.util.Scanner;

public class from28problem {
    // // # 28 problem
    // multiplication table

    // public static void main(String[] args) {

    // Scanner scan = new Scanner(System.in);
    // System.out.println("Enter the number you want multiplication of: ");
    // int num =scan.nextInt();
    // multiplicationTable(num);
    // }
    // public static void multiplicationTable(int num){
    // int i = 1;
    // while (i <= 10) {
    // int sum = num * i; ;
    // System.out.println(num + "*" + i + "=" + sum );
    // i++;
    // }
    // }

    // // # 29 problem
    // sum of all odd number

    // public static void main(String[] args) {

    // Scanner scan = new Scanner(System.in);
    // System.out.println("Enter the number you want to sum their odd of: ");
    // int num =scan.nextInt();
    // int sum = sumOfOdd(num);
    // System.out.println("sum of all odd number upto " + num + " : " + sum);
    // }
    // public static int sumOfOdd( int num){
    // int sum = 0;
    // int i = 1;
    // while (i <= num) {
    // sum += i;
    // i += 2;
    // }
    // return sum;

    // # 30 problem
    // factorial

    // public static void main(String[] args) {

    // Scanner scan = new Scanner(System.in);
    // System.out.println("Enter the number you want the factorial of: ");
    // int num =scan.nextInt();
    // long sum = factorial(num);
    // System.out.println("sum of factorial of num " + num + " is: " + sum);
    // }
    // public static long factorial( int num){
    // if (num < 2) {
    // return 1;
    // }
    // long sum = 1;
    // int i = 2;
    // while (i <= num) {
    // sum *= i ;
    // i++;
    // }
    // return sum;

    // }

    // // # 31 problem
    // sum of all digit

    // public static void main(String[] args) {

    // Scanner scan = new Scanner(System.in);
    // System.out.println("Enter the number you want the sumofdigit of: ");
    // int num =scan.nextInt();
    // int sum = sumOfDigit(num);
    // System.out.println("your sum of digit : " + sum);
    // }
    // public static int sumOfDigit(int num){
    // int sum = 0;
    // while (num > 0) {
    // sum += num % 10 ;
    // num /= 10 ;
    // System.out.println(num);
    // }
    // return sum;
    // }

    // // # 32 problem
    // lcm

    // public static void main(String[] args) {

    // Scanner scan = new Scanner(System.in);
    // System.out.println("Enter the number : ");
    // int num =scan.nextInt();
    // System.out.println("Enter the number : ");
    // int num1 =scan.nextInt();
    // int lcm= lcm( num , num1);
    // System.out.println("Least common multiple of two number is : " + lcm);
    // }
    // public static int lcm(int num ,int num1){
    // int i = 1;
    // // while (i <= num1) { this is also but return 0 will be never reached
    // because program will finish in if
    // while (true) {
    // int factor = num * i ;
    // if (factor % num1 == 0) {
    // return factor;
    // }
    // i++;
    // }
    // }

    // # 33 problem
// finding GCD

//     public static void main(String[] args) {

//     Scanner scan = new Scanner(System.in);
//     System.out.println("Enter the number : ");
//     int num =scan.nextInt();
//     System.out.println("Enter the number : ");
//     int num1 =scan.nextInt();
// int gcd =gcd(num , num1);
// System.out.println("Greatest common Divisor of the number is : " + gcd);
//     }

//     public static int gcd(int num1, int num2){
// int gcd = 1;
// int i = 2; 
// int least =least(num1, num2);
// while (i <= least) {
//     if (num1 % i == 0 && num2 % i == 0) {
//         gcd = i;
        
//     }
//     i++;
// }
// return gcd;
//     }
    
//     public static int least(int num1, int num2){
//     if (num1 < num2) {
//         return num1;
//     }
//     else{
//         return num2;
//     }
// }


    // // # 34 problem
    // prime number checker

    // public static void main(String[] args) {

    // Scanner scan = new Scanner(System.in);
    // System.out.println("Enter the number : ");
    // int num =scan.nextInt();
    // boolean isPrime = isPrime(num);
    // if (isPrime) {
    // System.out.println("your number is prime");
    // }
    // else{
    // System.out.println(" your number is not prime");
    // }
    // }

    // public static boolean isPrime(int num){
    // int i = 2 ;
    // while (i < num) {
    // if (num % i == 0) {
    // return false;
    // }
    // i++;

    // }
    // return true;
    // }

    // # 35 problem
    // reversing a digit

    // public static void main(String[] args) {

    // Scanner scan = new Scanner(System.in);
    // System.out.println("Enter the number : ");
    // int num =scan.nextInt();
    // int reverse = reverse(num);
    // System.out.println("your number in reverse is: " + reverse);
    // }

    // public static int reverse(int num){
    // int newnum = 0 ;
    // while ( num > 0) {
    // int digit = num % 10 ;
    // newnum = newnum * 10 + digit;
    // num /= 10;
    // }
    // return newnum;
    // }

    // // # 36 problem
    // // printing fibonacci series

    // public static void main(String[] args) {

    // Scanner scan = new Scanner(System.in);
    // System.out.println("Enter the number : ");
    // int num = scan.nextInt();
    // System.out.println("here is your fibonacci series");
    // printFibonacci(num);
    // }

    // public static void printFibonacci(int num) {
    // if (num < 0)
    // return;
    // System.out.print("0 ");
    // if (num == 0)
    // return;
    // System.out.print("1 ");
    // int first = 0, second = 1;
    // while (first + second <= num) {
    // int third = first + second;
    // System.out.print(third + " ");
    // first = second;
    // second = third;

    // }
    // }

    // # 37 problem
    // checking if the number is armstrong number

    // public static void main(String[] args) {

    // Scanner scan = new Scanner(System.in);
    // System.out.println("Enter the number : ");
    // int num = scan.nextInt();
    // boolean isArmstrong =isArmstrong(num);
    // if (isArmstrong) {
    // System.out.println("your number is Armstrong");
    // }
    // else{
    // System.out.println("your number is not Armstrong");
    // }
    // }

    // public static boolean isArmstrong(int num){
    // int noOfDigits = noOfDigits(num);
    // System.out.println("No. of digits: " + noOfDigits);
    // int numcopy = num ;
    // int finalNumber = 0;
    // while (num > 0) {
    // int lastDigits = num % 10 ;
    // num /= 10 ;
    // finalNumber += power(lastDigits, noOfDigits);
    // }
    // System.out.println("final number is :" + finalNumber + " numcopy is :" +
    // numcopy);
    // return finalNumber == numcopy;
    // }

    // public static int power(int num1 , int num2){
    // int result = num1;
    // int i = 1;
    // while (i < num2) {
    // result *= num1;
    // i++;
    // }
    // System.out.println("power of " + num1 + " is: " + result);
    // return result;
    // }

    // public static int noOfDigits(int num){
    // int digit = 0;
    // while (num > 0) {
    // digit++;
    // num /= 10 ;
    // }
    // return digit;
    // }

    // # 38 problem
    // checking number is palindrone number

    // public static void main(String[] args) {

    // Scanner scan = new Scanner(System.in);
    // System.out.println("Enter the number : ");
    // int num =scan.nextInt();
    // int reverse = reverse(num);
    // if (reverse == num) {
    // System.out.println("your number is palindrone number ");
    // }
    // else{
    // System.out.println("your number is not palindrone number ");
    // }
    // }

    // // return num == reverse(num); it is directly taking the value fron another
    // class

    // public static int reverse(int num){
    // int newnum = 0 ;
    // while ( num > 0) {
    // int digit = num % 10 ;
    // newnum = newnum * 10 + digit;
    // num /= 10;
    // }
    // return newnum;
    // }

    // # 39 problem
    // making pattern by loop

    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.print("Enter the number the no of rows you want to make a pyramid: ");
    //     int rows = scan.nextInt();
    //     first(rows);
    //     System.out.println();
    //     second(rows);
    // }

    // public static void first(int maxrows) {
    //     int rows = 0;
    //     while (rows < maxrows) {
    //         System.out.print("*");
    //         int i = 0;
    //         while (i < rows) {
    //             System.out.print(" *");
    //             i++;
    //         }
    //         System.out.println();
    //         rows++;
    //     }
    // }

    // public static void second(int maxrows) {
    //     int rows = maxrows;
    //     while (rows > 0) {
    //         System.out.print("*");
    //         int i = 1;
    //         while (i < rows) {
    //             System.out.print(" *");
    //             i++;
    //         }
    //         System.out.println();
    //         rows--;
    //     }
    // }
}

