import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Test{
    private int num1 = 10; // Instance field initialization
    private int num2;
    private int num3;

    {// Instance Initializer block

        try {
			String pathName = "Sample.txt";
			File file = new File(pathName );
			Scanner sc = new Scanner( file );
			this.num2 = sc.nextInt();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

    }

    public Test(){

    }
}

public class Program3 {
    public static void main(String[] args) {
        
    }
}
