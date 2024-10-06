import java.io.IOException;

public class Test {
    public void display() throws IOException{
        System.out.println("Test");
    }
    
}

class Derived extends Test{

    public void display() throws IOException{
        System.out.println("Derived");
    }

    public static void main(String[] args) throws IOException{
        Derived obj = new Derived();
        obj.display();
        System.out.println("Tejas katkade here");
    }
}
