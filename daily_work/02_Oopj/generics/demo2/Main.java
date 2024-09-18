package demo2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Box<Date> box = new Box<>();
        
        Date date = new Date();
        box.setObject(date);
        // Date date1 = (Date)box.getObject();
        // System.out.println(date1);
        System.out.println(box.getObject());
    }
}
