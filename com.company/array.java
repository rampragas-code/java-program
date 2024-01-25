public class array {
    public static void main(String[] args) {
        String[] country = { "nepal", "india", "saudi", "usa", "canada" };
        int[] num = { 12, 21, 34, 42, 43, 54, 65, 54, };
        // finding the length of array
        System.out.println("num of country" + country.length);
        System.out.println("num of number" + num.length);
        // acccessing hte array
        System.out.println(country[4]);
        System.out.println(num[4]);
        // changing array elements
        country[2] = "australia";
        System.out.println(country[2]);
        num[4] = 40;
        System.out.println(num[4]);

        // multidimensional arrays
        

    }
}
