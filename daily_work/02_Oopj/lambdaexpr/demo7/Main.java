
public class Main{      // Main.class
    public static void main(String[] args) {
    
        Addable add1 = (int a, int b) -> {
            return (a+b);
        };

        Addable add2 = (int a, int b) -> a+b;

        Addable add3 = ( a,b) -> a+b;
        Addable add4 =  (a,b) -> (a+b);

        System.out.println(add3.add(5, 6));
    
    }
}