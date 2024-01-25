import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        int a, b, c, sum;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 1 number");
        a = scan.nextInt();
        System.out.println("enter second number");
        b = scan.nextInt();
        System.out.println("enter third number");
        c = scan.nextInt();
        sum = a + b + c;
        System.out.println("THE SUM OF three NUMBER IS : " + sum);

    }
}
