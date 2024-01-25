public class p11 {
    public static void main(String[] args) {
        String st="RamPragas Mahato";
        st=st.toLowerCase();
        System.out.println(st);
        System.out.println(st.toLowerCase());
        System.out.println(st.toUpperCase());
        System.out.println(st.replace( ' ', '_'));
       String sta="Dear <|name|> , Thanks a lot";
       System.out.println(sta.replace("<|name|>", "Rampragas Mahato"));
       String s= "this  contain    space";
       System.out.println(s.indexOf("  "));
       System.out.println(s.indexOf("   "));
       String sa="Dear RAmpragas,\n \t welcome!";
       System.out.println(sa);
    }
}
