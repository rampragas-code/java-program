public class sumAverageOf2DArray {
    public static void main(String[] args) {
        System.out.println("welcome to sum and average of 2DArray");
        int[][] array = ArrayUtility.Array2D();
        long sum = sum(array);
        double avg = average(array);
        System.out.println("your sum of 2DArray is : " + sum);
        System.out.println("your average of 2DArray is : " + avg);

    }

    public static long sum(int[][] array){
        long sum = 0;
        int i = 0;
        while (i < array.length) {
            int j = 0;
            while (j < array[i].length) {
                sum += array[i][j];
                j++;

            }
            i++;
        }
        return sum;
    }

    public static double average(int[][] array){
        if (array.length == 0) {
            return 0;
        }
        int rows = array.length;
        int cols = array[0].length;
        double size = rows * cols ;
        return sum(array) / size;
    }
}
