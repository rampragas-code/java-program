import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s1, s2, s3, perc, gpa;
        System.out.println("ENTER THE NUMBER OF FIRST SUBJECT");
        s1 = scan.nextInt();
        System.out.println("ENTER THE NUMBER OF SECOND SUBJECT");
        s2 = scan.nextInt();
        System.out.println("ENTER THE NUMBER OF THIRD SUBJECT");
        s3 = scan.nextInt();
        perc = (s1 + s2 + s3) * 100 / 300;
        System.out.println("total percentage is :" + perc);
        gpa = perc / 25;
        System.out.println("your gpa is :" + gpa);
    }
}
