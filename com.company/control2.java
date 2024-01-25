import java.util.Scanner;

public class control2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a, b, c, perc;
        System.out.println("ENTER THE MARK OF FIRST SUNJECT");
        a = scan.nextFloat();
        System.out.println("ENTER THE MARK OF 2 SUB");
        b = scan.nextFloat();
        System.out.println("enter the mark of 3 sub");
        c = scan.nextFloat();
        perc = (a + b + c) * 100.0f / 300.0f;
        if (perc >= 40 && a >= 33 && b >= 33 && c >= 33) {
            System.out.println("you are pass");
        } else {
            System.out.println("your are fail");
        }

    }
}
