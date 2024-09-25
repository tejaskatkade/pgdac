import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    static int findReverse(int rev, int num) {
        if(num%10 < 1)
            return rev;
        System.out.println("rev : "+rev);
        System.out.println("num : "+num);
        return findReverse((rev*10) + (num%10) ,num/10);
    }

    static boolean isPalindrome(int num){
        if (findReverse(0, num) == num)
            return true;
        return false;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.print("Enter number : ");
        Integer num = Integer.parseInt(br.readLine()); 
        System.out.println(isPalindrome(num));
    }
}
