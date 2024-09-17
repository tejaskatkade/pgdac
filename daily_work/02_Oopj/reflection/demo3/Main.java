package demo3;


public class Main {
    public static void main(String[] args) {

       Class<?> c = Thread.class;
       Package p1 =  c.getPackage();
       System.out.println(p1);  // package java.lang
       String name  = c.getPackageName();
       System.out.println(name);    // java.lang
    


       
    }
}
