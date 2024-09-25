import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gcd {

    static int findGcd(int num1,int num2 ) {

        if(num1 == 0)
            return num2;
        if(num2 == 0)
            return num1;

        if(num1 > num2){
            return findGcd(num1%num2, num2);
        }else{
            return findGcd(num1, num2%num1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.print("Enter number 1 : ");
        Integer num1 = Integer.parseInt(br.readLine());
        System.out.print("Enter number 2 : ");
        Integer num2 = Integer.parseInt(br.readLine()); 
        System.out.println(findGcd(num1,num2));
    }
}
