class Test{
    // int num1;
    // int num2;
    // static int num3;
    private int num1;   // Instance variable
    private int num2;
    private static int num3;
    

    public Test(){
        this.num1 = 0;
        this.num2 = 0;
    }

    public void setNum1(int num1) { // Instance method
        this.num1 = num1;
    }

    public void setNum2(int num2) { // Instance method
        this.num2 = num2;
    }
 
    public static void setNum3(int num3) {  // class level method
        Test.num3 = num3;
        //this.num1 = 20;  // NOT OK : Cannot use this in a static context
    }



    public void printRecord(){ // printRecord(Test this)
        System.out.println("Num1 :"+this.num1);
        System.out.println("Num2 :" +this.num2);
        System.out.println("Num3 :" +Test.num3);
    }
}
public class Program2 {
    public static void main(String[] args) {
        Test t = new Test();
        // t.num1 = 10;
        // t.num2 = 20;
        // Test.num3 = 30;

        t.printRecord(); // printRecord(t);
    }
}
