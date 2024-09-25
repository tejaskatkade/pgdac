package demo13;

interface Printable{
    void print(String str);
}

public class Program {

    // static method
    public static void show(String str){
        System.out.println(str);
    } 

    // Non static method
    public int display(String str){
        System.out.println(str);
        return 1;
    }

    public static void main(String[] args) {
        
        // Lambda Expression
        // Printable p = str -> System.out.println(str);
        // p.print("welcome to CDAC");

        // Method Reference :
            //1. Using static Method
        
        Printable p = Program::show;
        p.print("Welcome to CDAC");
            
            //2. Using non static Method
        
        Program program = new Program();
        Printable p1 = program::display;
       // Printable p2 = new Program()::display;
        p1.print("Welcome to CDAC");

        
    }
    
}
