package interfaces;

interface Printable{
    int a = 10; //public static final int a

    void print(); // public abstract void print(); 
        
}
class PrintableImpl implements Printable{

    //void print() {   }  // Cannot reduce the visibility of the inherited method

        @Override
        public void print() {
            System.out.println("Printing");
        }

}
public class Program1 {
    public static void main(String[] args) {
        //Printable p = new Printable();  //  Cannot instantiate the type Printable
        PrintableImpl p = new PrintableImpl();  
        p.print();
    }
}
