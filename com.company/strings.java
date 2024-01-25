public class strings {
    public static void main(String[] args) {
        String st = "RAMPRAGAS MAHATO";
        String sta = "KUMAR";
        System.out.println("MY NAME IS "+st);
        // does same thing
        System.out.println(st + sta);
        System.out.println(st.concat(sta));
        //this method is used to find the length of a string
        System.out.println(st.length());
        // this method returns the first occurences of a specified character or text in string
        System.out.println(st.indexOf("PR"));
        System.out.println(st.indexOf("M"));
        //this is used to converts to lowercase character
 System.out.println(st.toLowerCase());
 // this is used to convert string to uppercase 
 System.out.println(st.toUpperCase());
    
    }
}
