import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leap {
    static boolean isLeapYear(int year) {
        if(year%4 != 0)
            return false;

        if(year%400 == 0)
            return true;

        if(year%4 == 0)
            return isLeapYear(year/100);
        return false;

    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.print("Enter year : ");
        Integer year = Integer.parseInt(br.readLine()); 
        System.out.println(isLeapYear(year));
    }
}
