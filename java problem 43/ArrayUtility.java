import java.util.Scanner;

/**
 * ArrayUtility
 */
public class ArrayUtility {

    public static int[] Array() {
        Scanner scan = new Scanner(System.in);
        System.out.print("please enter the number of elements : ");
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

    public static int[][] Array2D() {
        Scanner scan = new Scanner(System.in);
        System.out.print("please enter the number of rows : ");
        int rows = scan.nextInt();
        System.out.print("please enter the number of colums : ");
        int colums = scan.nextInt();
        int[][] array2D = new int[rows][colums];
        int i = 0;
        while (i < rows) {
            int j= 0;
            while (j < colums) {
                System.out.print("please enter rows: " +(i+1)+ " , column: " + (j+1)+ " : ");
                array2D[i][j] = scan.nextInt();
                j++;
            }
            i++;
        }
        return array2D;
    }
}

