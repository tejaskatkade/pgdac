class Test{
    private int num1 =  10;
    private static int num2 =  50;

    static{
        System.out.println("Instance block 1");
        num2 = 20;

    }

    public Test() {
        System.out.println("In constructor ");
        this.num1 = 30;
    }

    static{
        System.out.println("Initialization block 2");
    }
}


public class Program1 {
    public static void main(String[] args) {
        
    }
}

