public class methodss {
        // methods is used for less repatation of code
        

            static int logic(int x, int y){
                int z;
                if(x>y){
                    z = x+y;
                }
                else {
                    z = (x +y) * 5;
                }
                
                return z;
            }
        
        
            public static void main(String[] args) {
                int a = 5;
                int b = 7;
                int c;
                // Method invocation using Object creation
                //cwh_31_methods obj = new cwh_31_methods();
                //c = obj.logic(a, b);
                c = logic(a, b);
                System.out.println(c);
                int a1 = 2;
                int b1 = 1;
                int c1;
                c1 = logic(a1, b1);
                System.out.println(c1);
            }
        }
        //another example
      /*  class calculate{
     int sum(int a,int b){
        return a+b;
    }

public static void main(String[] args) {
         
        calculate obj = new calculate();
        int c = obj.sum(5,4);
        System.out.println(c);
    }
}
*/ 
    

