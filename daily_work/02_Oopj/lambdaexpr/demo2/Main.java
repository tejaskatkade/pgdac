
// Inner class

public class Main{      // Main.class
    public static void main(String[] args) {
        class PrintableImpl implements Printable{
            public void print(){
                System.out.println("Normal Inner class");
            }
        }

        PrintableImpl p = new PrintableImpl();
        p.print();  
    }
}