import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatedChar {

    static void repeatedStr(String str){
        if(str.length() < 2)
            return;
        String rStr1 = str.substring(0,1);
        //System.out.println(rStr1);
        String rStr2 = str.substring(1); 
        //System.out.println(rStr2);

        if(rStr2.contains(rStr1)){
            System.out.print(rStr1+" ");
            rStr2 = rStr2.replace(rStr1,"");
        }
        repeatedStr(rStr2);
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.print("Enter String : ");
        String str = br.readLine(); 
        repeatedStr(str);
    }
}
