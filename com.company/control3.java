import java.util.Scanner;

public class control3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER YOUR SALARY");
        float income=scan.nextFloat();
        float tax=0;
        if (income<2.5f) {
            tax=tax+0;
        }
        else if (income>=2.5f && income<5f) {
            tax=tax+0.05f*(income-2.5f);
        }
        else if (income>=5f && income<10f) {
            tax=tax+0.05f*(5f-2.5f);
            tax=tax+0.2f*(income-5f);
        }
        else if (income>=10f) {
            tax=tax+0.05f*(5f-2.5f);
            tax=tax+0.2f*(10f-5f);
            tax=tax+0.3f*(income-10f);
        }
        System.out.println("the total tax of employee is : "+tax);
}
}