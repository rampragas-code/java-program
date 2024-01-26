public class mergingTwoSortedArray {
    public static void main(String[] args) {
        System.out.println("welcome to merging sorted array");
        int[] array = ArrayUtility.Array();
        int[] array1 = ArrayUtility.Array();
        int[] mergedArray = merge(array, array1);
        System.out.println(" your merge array is: ");
        ArrayUtility.displayArray(mergedArray);
    }

    public static int[] merge(int[] array, int[] array1){
int newArraySize = array.length + array1.length;
int[] lArray = new int[newArraySize];
 int i=0, j=0, k=0;
 while (i < array.length || j < array1.length) {
    if (j == array1.length || (i < array.length && array[i] < array1[j])) {
        lArray[k] = array[i];
        i++;
        k++;
    }
    else{
        lArray[k] = array1[j];
        k++;
        j++;
    }
 }
 return lArray;
    }
}
