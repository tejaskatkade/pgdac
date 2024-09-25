import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

    private static int factorial(Integer num) {
        if(num == 1)
            return 1;
        return num * factorial(--num);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.print("Enter number : ");
        Integer num = Integer.parseInt(br.readLine()); 
        System.out.println(factorial(num));
    }

    
}
