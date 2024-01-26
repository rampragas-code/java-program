import java.util.Scanner;

public class Arrayutilit {
    
        public static int[] ArrayUtility(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scan.nextInt();
        int[] number =new int[size];

        int i = 0 ;
        while (i < size) {
            System.out.print("Enter element no " + (i + 1) + " element value : " );
            number[i] = scan.nextInt();
            i++;
        }
        return number;
    }
    public static void displayArray(int[] array){
        int i =0 ;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
        }
        
    }

