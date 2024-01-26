// import java.util.Scanner;

import java.util.Scanner;

public class Arrayproblems40 {

// # 40 sum and average

    //     public static void main(String[] args) {
//     //  ArrayUtility();
//     int[] array=Arrayutility.ArrayUtility(); 
//     long sum= sum(array);
//     double average=average(array);
//     System.out.println("sum of given array is : " +sum);
//     System.out.println("average of given array is : "+average);


//     }

//     public static long sum (int[] array){
// long add= 0;
// int i= 0;
// while (i < array.length) {
//     add += array[i];
//     i++;
// }        
// return add;
//     }

//     public static double average (int[] array){
// double sum = sum(array);
//         return  (sum / array.length);
//     }
// }

// //         this is a program which take input  and let number put array index

// //     public static int[] ArrayUtility(){
// //         Scanner scan = new Scanner(System.in);
// //         System.out.print("Enter the number of elements: ");
// //         int size = scan.nextInt();
// //         int[] number =new int[size];
// //         int i = 0 ;
// //         while (i < size) {
// //             System.out.print("Enter element no " + (i + 1) + " element value : " );
// //             number[i] = scan.nextInt();
// //             i++;
// //         }
// //         return number;
// //     }

// // // # 41 number of occurance

// public static void main(String[] args) {
// Scanner scan =new Scanner(System.in);
// int[] array = Arrayutility.ArrayUtility();
// System.out.print("Enter the number of you want to find in array: ");
// int num = scan.nextInt();
// int occurance=numOccurance(array, num);
// System.out.println("your element was found " + occurance + " times in array");
// }

// public static int numOccurance(int[] array , int num){
// int occurance =0;
// int i= 0;
// while (i < array.length) {
//     if (array[i] == num) {
//         occurance++;

//     }
//     i++;
// }
//     return occurance;
// }

// # 42 maximum and minimum element 

// public static void main(String[] args) {
//  //   System scan =new Scanner(System.in);
//     int[] array = Arrayutility.ArrayUtility();
// int maximum = maximum(array);
// int minimum = minimum(array);
// System.out.println("Your max number is : " + maximum);
// System.out.println("Your min number is : " + minimum);
// }

// public static int maximum(int[] array){
// if (array.length == 0) {
//     return Integer.MIN_VALUE;
// }
// int max = array[0];
// int i = 1;
// while (i < array.length) {
//     if (max < array[i]) {
//         max = array[i];
//     }
//     i++;
// }
// return max;
// }

// public static int minimum(int[] array){
//     int min =  Integer.MAX_VALUE;
//     int i = 0;
//     while (i < array.length) {
//         if (min > array[i]) {
//             min = array[i];
//         }
//         i++;
//     }
//     return min;
//     }

// # 43 sorting check

// public static void main(String[] args) {
//     int[] array = Arrayutility.ArrayUtility();
// boolean isIncreasing = isIncreasing(array);
// boolean isDecreasing = isDecreasing(array);
// if (isDecreasing || isIncreasing) {
//     System.out.println("your array is sorted ");

// }
// else{
//     System.out.println("your array is not sorted ");
// }
// }

// public static boolean isIncreasing(int[] array){
//     int i = 1;
//     while (i < array.length) {
//         if (array[i] < array[i-1]) {
//             return false;
//         }
//         i++;
//     }
//     return true;
// }

// public static boolean isDecreasing(int[] array){
//     int i = 1;
//     while (i < array.length) {
//         if (array[i] > array[i-1]) {
//             return false;
//         }
//         i++;
//     }
//     return true;

// }

// # 44 deleting from array

// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// int[] array = Arrayutility.ArrayUtility();
// // int[] arr = Arrayutility.ArrayUtility();
// System.out.println("Now enter the number you want to delete : ");
// int delete = scan.nextInt();
// int[] newArray = delNum(array, delete);
// System.out.println("here is your array");
// Arrayutility.displayArray(newArray);
// }

// public static int[] delNum(int[] array, int num){
// int occ = numOccurance(array , num);
// if (occ == 0) {
//     return array;
// }
// int newArraySize = array.length - occ;
// int[] newArray = new int[newArraySize];

// int i=0, j=0;
// while (i < array.length) {
//     if (array[i] != num) {
//         array[j] = array[i];
//         j++;
//     }
//     i++;
// }
// return newArray; 
// }

// # 45 

// public static void main(String[] args) {
//     int[] array = Arrayutility.ArrayUtility();
//     reverse(array);
//     System.out.println("your reversed array is");
//     Arrayutility.displayArray(array);
// }

// public static void reverse(int[] array){
//     int i=0;
//     while (i< array.length / 2) {
//        int swap = array[i];
//        array[i] = array[(array.length - 1) - i] ;
//        i++;
//     }
// }
// 

//  46 PalindromeArray

public static void main(String[] args) {
    int[] array = Arrayutilit.ArrayUtility();
boolean isPalindrone = isPalindrone(array);
if (isPalindrone) {
    System.out.println("your array is palindrone");
}
else{
    System.out.println("your array is palindrone");

}
}
 public static boolean isPalindrone(int[] array){
    int i = 0;
    while (i < array.length/2) {
        if (array[i] != array[array.length -1 -i]) {
            return false;
        }
        i++;
    }
    return true;
 
}
}