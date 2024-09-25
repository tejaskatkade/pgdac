import java.util.Optional;
import java.util.stream.Stream;

class Student{

    private int roll;
    private String name;
    private int age;

    
} 

public class StreamDemo{
 
    public static void main(String[] args) {
    
        
        Integer arr[] = {3,4,5,6,7};

        Integer num = Stream.of(arr).max((a,b) -> a > b ? a : b).get();
        System.out.println(num);
    }
}