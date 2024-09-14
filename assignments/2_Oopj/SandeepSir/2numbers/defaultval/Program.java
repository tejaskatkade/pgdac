package defaultval;

/**
 * Declare variables of each primitive type as fields of a class and check their default
 * values. (Note: Default values depend on whether the variables are instance variables or
 * static variables).
 */
public class Program {
    boolean status;
    static boolean bstatus;
    

    byte  byteNum;
    static byte  sbyteNum;
    
    short shortNum;
    static short sshortNum;
    
    char ch;
    static char sch;
    
    int num;
    static int snum;

    float fNum;
    static float sfNum;

    double dNum;
    static double sdNum;

    long lNum;
    static long slNum;

    public static void main(String[] args) {
        
        Program p = new Program();

        System.out.println("boolean");
        System.out.println("instance : "+p.status);
        System.out.println("static : "+Program.bstatus);

        System.out.println("byte");
        System.out.println("instance : "+p.byteNum);
        System.out.println("static : "+Program.sbyteNum);
        
        System.out.println("short");
        System.out.println("instance : "+p.shortNum);
        System.out.println("static : "+Program.sshortNum);  
        
        System.out.println("char");
        System.out.println("instance : "+p.ch);
        System.out.println("static : "+Program.sch); 

        System.out.println("integer");
        System.out.println("instance : "+p.num);
        System.out.println("static : "+Program.snum);


        
        System.out.println("float");
        System.out.println("instance : "+p.fNum);
        System.out.println("static : "+Program.sfNum);


        
        System.out.println("double");
        System.out.println("instance : "+p.dNum);
        System.out.println("static : "+Program.sdNum);


        System.out.println("long");
        System.out.println("instance : "+p.lNum);
        System.out.println("static : "+Program.slNum);

    }
}
