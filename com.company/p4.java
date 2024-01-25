import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double km;
        double miles;
        System.out.println("enter a number of kilometers");
        km = scan.nextDouble();
        miles = km * 0.6;
        System.out.println("your km in miles :" + miles);
    }
}
