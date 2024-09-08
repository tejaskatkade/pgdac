class Test{
    private int num1 =  10;
    private static int num2 =  50;

    {
        System.out.println("Instance block 1");
        this.num1 = 20;

    }

    public Test() {
        System.out.println("In constructor ");
        this.num1 = 30
    }

    {
        System.out.println("Initialization block 2");
    }
}


public class Program {
    public static void main(String[] args) {
        
    }
}
