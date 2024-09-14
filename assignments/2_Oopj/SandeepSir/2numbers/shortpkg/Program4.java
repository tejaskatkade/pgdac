package shortpkg;

/**Declare a method-local variable strNumber of type String with some value and convert it to a
 * short value using the parseShort method. (Hint: Use Short.parseShort(String)). */


public class Program4 {
    public static void main(String[] args) {
        String strNumber = "3564";

        // string to primitive
        short number = Short.parseShort(strNumber); 
 

        //string to  wrapper
        Short number2 = Short.valueOf(strNumber);   

        System.out.println(number);
        System.out.println(number2);
    }    
}
