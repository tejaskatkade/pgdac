public class Program3 {
    
    int num1 = 100;
    static int num2 = 200;

    public void methodOne(){
        System.out.println("In non static method");
    }
    public static void methodTwo(){
        System.out.println("In static method");
    }

    public static void main(String[] args) {
        
        System.out.println("Num1 : "+ num1); // NOT OK
                                             // Cannot make a static reference to the non-static field

        System.out.println("Num2 : "+ num2);
        System.out.println("Num2 : "+ Program3.num2);


        Program3 p = new Program3();
        System.out.println("Num 1 : "+ p.num1);


        //////////////////////////////////////

        //methodOne();    // Not OK
        p.methodOne();

        methodTwo();
        Program3.methodTwo();
    }
}
