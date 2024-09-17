class Test{
    int num1 =  10;
    static int num2 =  50;

    static{
        System.out.println("Inside static block");
        //num1 = 5; // not ok
        num2 = 60;
    }

    {
        System.out.println("Instance Initailization block 1");
        this.num1 = 20;

    }

    public Test() {
        System.out.println("Inside constructor ");
        this.num1 = 30;
    }

    {
        System.out.println("Initialization block 2");
    }
}


public class Program {
    public static void main(String[] args) {
        //new Test(); // Anonymous Object 
        Test t = new Test(); 
        System.out.println(t.num1);
        System.out.println(t.num2);
        System.out.println(Test.num2);
    }
}
