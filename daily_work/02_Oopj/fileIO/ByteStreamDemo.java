import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    public static void main(String[] args) throws IOException {
        File inf = new File("myFile.txt");

        File opf = new File("outFile.txt");

        if(!inf.exists()) {
            System.out.println("file not exist");
            return;
        }

        FileInputStream fis = new FileInputStream(inf);
        FileOutputStream fos = new FileOutputStream(opf);

        int ch;
        while ((ch = fis.read()) != -1) {
            System.out.println((char)ch);
            fos.write(ch);
        }
    }
}