public class Program6 {
    public static void main(String[] args) {
        double num = 10.55;
        double num1 = 10.55d;
        System.out.println(num1);

        // int num3 = num; //NOT OK
        // Type mismatch: cannot convert from double to int
    
        int num3 = (int)num; // ok
        // Narrrowing

        System.out.println(num3);
    
    }
}
