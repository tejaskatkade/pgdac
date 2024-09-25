import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioDemo2 {
    public static void main(String[] args) throws IOException {
        
        FileInputStream fis = new FileInputStream("myFile.txt");
        // FileInputStream is meant for reading streams of raw bytes such as 
        //image data. For reading streams of characters, consider using FileReader.

        FileChannel fChannelIn = fis.getChannel();
        // java.nio.channels.FileChannel
        //A channel for reading, writing, mapping, and manipulating a file.

        ByteBuffer byteBuffer = ByteBuffer.allocate((int)fChannelIn.size());
        // long java.nio.channels.FileChannel.size() throws IOException
    
        fChannelIn.read(byteBuffer);
        // int java.nio.channels.FileChannel.read(ByteBuffer dst) throws IOException
        // Reads a sequence of bytes from this channel into the given buffer.
    
        // Rewinds this buffer.  : - come pointer to first positon in buffer array
        byteBuffer.rewind();
        for (int i = 0; i < fChannelIn.size(); i++) {
           System.out.print((char)byteBuffer.get(i)); 
        }
        System.out.println();

        FileOutputStream fos = new FileOutputStream("myOutFile.txt");
        FileChannel fileChannelOut = fos.getChannel();

        // write to file
        byteBuffer.rewind();
        fileChannelOut.write(byteBuffer);


        fileChannelOut.close();
        fChannelIn.close();
        fis.close();
        fos.close();
        System.out.println("Program executed successfully ");
    }
}
