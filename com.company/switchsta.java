import java.util.Scanner;

public class switchsta {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number between 1 to 7");
        int a =scan.nextInt();
        switch (a) {
            case 1:
                System.out.println("sunday");
                break;
        case 2:
        System.out.println("monday");
        break;
        case 3:
        System.out.println("tueday");
        break;
        case 4:
        System.out.println("wednesday");
        break;
        case 5:
        System.out.println("thursday");
        break;
        case 6:
        System.out.println("friday");
        break;
        case 7:
        System.out.println("saturday");
        break;
        default:
        System.out.println("your value is incorrect");
  
    }
    }
}
