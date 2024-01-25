import java.util.Scanner;

public class percentagecalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the mark of subject 1:");
        int a = scan.nextInt();
        System.out.println("Enter the mark of subject 2:");
        int b = scan.nextInt();
        System.out.println("Enter the mark of subject 3:");
        int c = scan.nextInt();
        System.out.println("Enter the mark of subject 4:");
        int d = scan.nextInt();
        System.out.println("Enter the mark of subject 5:");
        int e = scan.nextInt();
        System.out.println("Enter the mark of subject 6:");
        int f = scan.nextInt();
        int perc = (a + b + c + d + e + f) * 100 / 600;
        System.out.println("your percentage is:" + perc);
    }
}
