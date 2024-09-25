package demo8;

public class Main {
    public static void show(Object object) {
        System.out.println(object);
    }
    
    public static <T> void display(T object) {
        System.out.println(object);
    }
    public static <T extends Number> void print(T object) {
        System.out.println(object);
    }
    
    public static void main(String[] args) {
        // Main.show("Tejas");
        // Main.show(24);
        // Main.show(7.07f);
        // Main.show(7L);
        // Main.show(7.00000d);

        // Main.display("Tejas");
        // Main.display(24);
        // Main.display(7.07f);
        // Main.display(7L);
        // Main.display(7.00000d);

        //Main.print("Tejas");  //Not Ok
        Main.print(24);
        Main.print(7.07f);
        Main.print(7L);
        Main.print(7.00000d);
        //Main.print(true);        // Not ok
    }
}
