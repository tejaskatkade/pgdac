
// Anonymous Inner class

public class Main{      // Main.class
    public static void main(String[] args) {

        Printable p = new Printable(){  // Printable$1.class

            public void print(){
                System.out.println("Anonymous Inner class");
            }
            
        };
        p.print(); 
    }
}