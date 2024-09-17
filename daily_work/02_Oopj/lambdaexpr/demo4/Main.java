
public class Main{      // Main.class
    public static void main(String[] args) {
        Printable p = () -> {
            System.out.println("Lambda expression ");
        };
        Printable p2 = () -> System.out.println("Lambda ");
        p2.print();
    }
}