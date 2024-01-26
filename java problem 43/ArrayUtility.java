import java.util.Scanner;

/**
 * ArrayUtility
 */
public class ArrayUtility {

    public static int[] Array() {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the number of elements : ");
        int size = scan.nextInt();
        int[] array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("please enter element no " +(i+1)+ " : ");
            array[i]=scan.nextInt();
            i++;
        }
        return array;
    }


    public static void displayArray(int[] newArray ){
int i = 0;
while (i < newArray.length) {
    System.out.print(newArray[i] + " ");
    i++;
}
System.out.println();
    }
}

