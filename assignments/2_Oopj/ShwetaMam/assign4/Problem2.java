
/*
     Create a program that demonstrates narrowing conversion from double to int and prints the result.
*/
public class Problem2 {
    public static void main(String[] args) {
        double d = 4.0;
        //int i = d; // Type mismatch: cannot convert from double to
        int i = (int)d; // Narrowing
        System.out.println(i);


    }
}
