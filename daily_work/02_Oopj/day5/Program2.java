import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        String pathname = "abc.txt";
        File file = new File(pathname);
        try (Scanner sc = new Scanner(file)) {
            int number = sc.nextInt();
            System.out.println(number);
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
