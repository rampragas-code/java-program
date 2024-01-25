import java.util.Scanner;

public class loop6 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number you want the multiplication table");
        int n= scan.nextInt();
        int sum=0;
        for(int i=10; i>=1; i--){
            System.out.println(n+"*"+i+ "=" +n*i);
            sum +=n*i;
        }
        System.out.println("the sum of number you have entered: "+sum);
    }
}
