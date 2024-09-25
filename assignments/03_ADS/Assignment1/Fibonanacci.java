import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Fibonanacci {
    static Map<Integer, Integer> map = new HashMap<>();
    static int fibo(int num) {
    
        if (num < 2) {
            return num;
        }
        if(map.containsKey(num))
            return map.get(num);
        int val1 = fibo(num-1);
        int val2 = fibo(num-2);
        map.put(num-1, val1 );
        map.put(num-2, val2);
        return val1 + val2;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.print("Enter number : ");
        Integer num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            System.out.print(fibo(i)+" ");
        } 
    }
}
