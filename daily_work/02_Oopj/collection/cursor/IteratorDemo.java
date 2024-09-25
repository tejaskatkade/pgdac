package cursor;

import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> strList = new LinkedList<>();
        strList.add("Tejas");
        strList.add("virat");
        strList.add("mahi");

        // 1. for each
        
        for (String str : strList) {
            System.out.println(str);
        }

        // 2. Using Iterator

        Iterator iterator = strList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            
        }

        // 3. using ListIterator 
        // can come reverse order also

        ListIterator iterator2 = strList.listIterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
       
        while (iterator2.hasPrevious()) {
            System.out.println(iterator2.previous());
        }

        // 4 .  Using Enumeration

        System.out.println("Enumration");

        Enumeration<String> iterator3 = Collections.enumeration(strList);
        while (iterator3.hasMoreElements()) {
            System.out.println(iterator3.nextElement());
        }


   }

    

}
