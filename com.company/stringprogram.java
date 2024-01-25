import java.util.Scanner;

public class stringprogram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your website");
        String st=scan.next();
        if (st.endsWith(".com")) {
            System.out.println("this is commerical website");
        } else if (st.endsWith(".org")) {
            System.out.println("this is oraganital website");
        }else if (st.endsWith(".in")) {
            System.out.println("this is indian website");
        }
    }
}