import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to 2D Array Search");
        int[][] array = ArrayUtility.Array2D();
        System.out.print("Enter the number you want to search : ");
        int number = scan.nextInt();
        boolean search = Search(array, number);
        if (search) {
            System.out.println("your number was found");
        }
        else{
            System.out.println("your number was not found");
        }

    }

    public static boolean Search(int[][] array , int number){
        int i=0;
        while (i< array.length) {
            int j =0;
            while (j < array[i].length) {
                if (array[i][j] == number) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
