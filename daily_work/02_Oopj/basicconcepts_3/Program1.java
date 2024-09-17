/**
 * Difference between 
 * print()
 * println()
 * printf()
 */
public class Program1 {

    public static void main(String[] args) {
        
        //print : void (return type)
        System.out.print("Hello   ");
        
        //println : void (return type)
        System.out.println("Hello");

        //printf : PrintStrem
        System.out.printf("%s%d%f\n","Tejas Katakde ",102345, 4500.50f);
        System.out.printf("%20s%15d%15f\n","Tejas Katakde ",102345, 4500.50f);
        System.out.printf("%-20s%-15d%-15f\n","Tejas Katakde ",102345, 4500.50f);
        System.out.printf("%-20s%-15d%-15.3f\n","Tejas Katakde ",102345, 4500.50f);
        System.out.print("Hello   ");
    }
     
}