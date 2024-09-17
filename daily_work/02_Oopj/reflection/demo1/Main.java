package demo1;

import java.util.Date;

public class Main{
    public static void main(String[] args) {
        
        Date date = new Date();  // Concreate class - so instantiation is okay
        Class<?> c = date.getClass();  
        System.out.println(c);
        System.out.println(c.toString());        
    
    }
}