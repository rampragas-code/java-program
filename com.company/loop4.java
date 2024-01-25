import java.util.Scanner;

public class loop4 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number you want the multiplication table");
        int n= scan.nextInt();
        for(int i=10; i>=1; i--){
            System.out.println(n+"*"+i+ "=" +n*i);
        }
    }
}
/*
for infinte multiplication of any number
 public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number you want the multiplication table");
        int n= scan.nextInt();
        for(int i=10; i>=1; i++){
            System.out.println(n+"*"+i+ "=" +n*i);
        }
    }
 */