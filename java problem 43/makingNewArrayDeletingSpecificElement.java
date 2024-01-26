import java.util.Scanner;

/**
 * makingNewArrayDeletingSpecificElement
 */
public class makingNewArrayDeletingSpecificElement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to array deletion");
int[] array = ArrayUtility.Array();
System.out.println("enter the number you want to delete : ");
int deleteNumber = scan.nextInt();
int[] newArray =deleteNumber(array, deleteNumber);
System.out.println("this is your new array");
ArrayUtility.displayArray(newArray);
    }

    public static int[] deleteNumber( int[] array , int deleteNumber){
        int occ = OccurrencesArray.noOfOccurrences(array, deleteNumber);
        if(occ == 0){
            return array;
        }
        int newSize = array.length - occ;
        int[] newArray = new int[newSize];

        int i=0 , j=0;
        while (i < array.length) {
            if (array[i] != deleteNumber) {
              newArray[j] = array[i];  
              j++;
            }
            i++;
        }
return newArray;
    }
}