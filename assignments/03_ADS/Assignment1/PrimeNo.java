import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class PrimeNo {

    //static int count = 0;
    static boolean isPrime(int i, int num,int count){
        if(i > num){
            return true;
        }
        if(count == 1)
            return false;
        
        if(num%i == 0 ) {
            count++;
        }
        return isPrime(++i, num, count);
        
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter number");
        int num = Integer.parseInt(br.readLine());
        //for (int i = 2; i <= 100; i++) {
          //  System.out.println(i+" : "+isPrime(2,i,0));  
            System.out.println(isPrime(2,num,0));  
        //}
    }
}
