/***
 * 
 * To implement functional interface we can use 
 *  1.  Implement that interface by class
 *  2.  Simple Inner class
 *  3.  Anonymous Inner Class
 *  4.  Lambda functions
 *  
 * */ 



class PrintableImpl implements Printable{   // PrintableImpl.class

    public void print(){
        System.out.println("sub class");
    }
    
}

public class Main{      // Main.class
    public static void main(String[] args) {
        Printable p = new PrintableImpl();  //UPCASTING
        p.print();  // Dynamic Metyhod dispatch
    }
}