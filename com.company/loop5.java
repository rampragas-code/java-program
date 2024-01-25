public class loop5 {
    public static void main(String[] args) {
        // what is factotial n= n*n-1*n-2.......1
        //5!=5*4*3*2*1
        int  n=5 ,i=1;
        int factorial=1;
        while (i<=n) {
            factorial *=i;
            i++;
        }
        System.out.println("the factorial of 5 is:"+factorial);
    }
}
