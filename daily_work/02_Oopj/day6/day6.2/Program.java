
class  Test {
    private int num1; // non static  / instance var / get space after creating its instance
    private int num2;

    // if u want to share the value of  field in every instance of same class then such field is declared as static
    //private static int num3; // class variable 
    static int num3; // class variable 
    // static field get space once per class

    // getr space during class loading
    // where -> on method area
    
    public Test(){
        this.num1 = 0;
        this.num2 = 0 ;
        //this.num3 = 500;
    }
    
    public Test(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void printRecord(){
        System.out.println("Num1 : "+num1);
        System.out.println("Num2 : "+num2);
        System.out.println("Num3 : "+num3);
    }
    
    
    
    
}

public class Program {
 
    public static void main(String[] args) {
        Test test1 = new Test(10, 20);
        Test test2 = new Test(30, 40);
        Test test3 = new Test(50, 60);

        System.out.println(Test.num3);
    }
}
