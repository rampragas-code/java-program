/**
 * Arraysortingcheck
 */
public class Arraysortingcheck {

    public static void main(String[] args) {
            System.out.println("welcome to array sorting check");
            int[] array = ArrayUtility.Array();
            boolean inc = isIncreasing(array);
            boolean dec = isDecreasing(array);
            if (dec || inc) {
                System.out.println("your array is sorted");

            }
            else{
                System.out.println("your array is not sorted");

            }

    }

    public static boolean isIncreasing(int[] array){
int i = 1;
while (i < array.length) {
    if (array[i] < array[i-1]) {
        return false;
    }
    i++;
}
        return true;
    }

    public static boolean isDecreasing(int[] array){
        int i = 1;
        while (i < array.length) {
            if (array[i] > array[i-1]) {
                return false;
            }
            i++;
        }
        return false;
    }
}
