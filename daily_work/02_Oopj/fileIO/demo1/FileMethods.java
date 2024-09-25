package demo1;

import java.io.File;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) throws IOException{
        
        File f1 = new File("test");

        if(!f1.exists()) {
            System.out.println("File not exists");
            return;
        }

        if (f1.isDirectory()) {
            System.out.println("test is dirctory");
            String[] list = f1.list();
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}
