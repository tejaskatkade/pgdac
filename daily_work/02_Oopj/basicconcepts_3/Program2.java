public class Program2 {
    int num1;               // non static field = > Instance variable
    static int num2;        // Static field     = > Class vaiable
    
    public static void main(String[] args) {
        //System.out.println(num1); // Not OK
        //System.out.println(Program2.num1); // Not OK
        

        Program2 p = new Program2();
        // p => object reference 
        //      reference

        // new Program2() => instance

        System.out.println(p.num1); // OK // 0
               
        System.out.println(num2);   // 0
        System.out.println(Program2.num2);   // 0

        //System.out.println(num3);   // error: variable num3 might not have been initialized

        // int num4 = 10; // initialization


        // int num5;      // declaration
        // num5 = 19;     // assignment  / definition
    
    
    }
}
