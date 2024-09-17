class Test{
    private int num1 =  10;
    private static int num2 =  50;


    static{
        System.out.println("Inside static block");
    }
    
    {
        System.out.println("Initialization block 2");
    }

    public Test() {
        System.out.println("Inside constructor ");
    }

    public static void staticMethod(){
        System.out.println("Inside static method");
        //System.out.println(num1); 
        // Cannot make a static reference to the non-static field 
    }

    public void nonStaticMethod(){
        System.out.println("Inside Non static method");
        System.out.println(num1);
        System.out.println(num2);
    }

}


public class Program1 {
    public static void main(String[] args) {
        Test test = new Test();
        Test.staticMethod();
        test.nonStaticMethod();
    }
}

