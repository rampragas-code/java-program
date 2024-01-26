public class DiagonalSumOf2DArray {
    public static void main(String[] args) {
      System.out.println("Welcome to sum of Diagonal of 2D array");
      int[][] array = ArrayUtility.Array2D();
      long sum = DiagonalSumOfArray(array);
      System.out.println(" Sum of diagonals is: " + sum); 
    }

    public static long DiagonalSumOfArray(int[][] array){
        long leftSum = DiagonalLeftSumOfArray(array);
        long rightSum = DiagonalSumRightOfArray(array);
        long sum = leftSum + rightSum;
        if (array.length % 2 != 0) {
            int midindex = array.length / 2;
            sum -= array[midindex][midindex];
            
        }
        return sum;
    }

    public static long DiagonalSumRightOfArray(int[][] array){
        long sum = 0;
        int i = 0;
        while (i < array.length) {
            int cols = array.length - 1 -i ;
            sum += array[i][cols];
            i++;
        }
        return sum;
    }

    public static long DiagonalLeftSumOfArray(int[][] array){
long sum = 0;
int i = 0;
while (i < array.length) {
    sum += array[i][i];
    i++;

}
        return sum;
    }
}
