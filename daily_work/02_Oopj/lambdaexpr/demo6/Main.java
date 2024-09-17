
public class Main{      // Main.class
    public static void main(String[] args) {
        
    //1  
        // Printable p = (int num) -> {
        //     return "The result is :"+ num;
        // };
        
    // 2
        // Printable p = (num) -> {
        //     return "The result is :"+ num;
        // };

    // 3
        // Printable p = (num) -> "The result is :"+ num;
    
    // 
        Printable p = num -> "The result is :"+ num;
    
        System.out.println(p.print(10));
    }
}