public class Program5 {

    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);

        int num2 = num1; // OK

        // widening
        double num3 = num2; // OK
        double num4 = (double)num2; //OK

        System.out.println(num3);
        System.out.println(num4);
    }
}
