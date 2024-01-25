public class evennumber {
    public static void main(String[] args) {
        //sum of first four even number
        int sum=0;
        int num=4;
        for(int i=0; i<num; i++){
            sum=sum+(2*i);
        }
        System.out.print("sum of even num is: "+sum);
    }
}
