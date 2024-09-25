import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrong{
    public static int countDigit(int num) {
        return (int)Math.log10(num)+1;
    }
    public static int calculate(int num, int lenght) {
        if(num%10 == num )
            return num;
        return (int)Math.pow(num%10, lenght) + calculate(num/10, lenght);

    }
    public static boolean isArmstrong(int num) {
        int lenght = countDigit(num);
        int result = calculate(num, lenght);
        return result ==  num;
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.print("Enter number : ");
        Integer num = Integer.parseInt(br.readLine()); 
        System.out.println(num);
        //System.out.println(countDigit(num));
        System.out.println(isArmstrong(num));
    }    
}