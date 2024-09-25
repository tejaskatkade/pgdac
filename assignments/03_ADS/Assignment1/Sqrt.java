import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sqrt {
    static int findSqrt(int i,int num){
        if(i*i >= num){
            return i;
        }
        return findSqrt(++i, num);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.print("Enter number : ");
        Integer num = Integer.parseInt(br.readLine()); 
        System.out.println(findSqrt(1, num));
    }
}
