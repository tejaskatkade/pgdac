package demo1;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
     
        List<Student> list = new ArrayList<>();
        
        list.add(new Student(101,"Tejas",22));
        list.add(new Student(102,"Virat",32));
        list.add(new Student(103,"Dhoni",42));
        list.add(new Student(104,"Yuvraj",40));
    

        System.out.println(list);

        System.out.println("Shuffle");
        Collections.shuffle(list);
        System.out.println(list);
    }
}
