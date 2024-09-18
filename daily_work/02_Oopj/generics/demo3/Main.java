package demo3;

public class Main {
    
public static void main(String[] args) {
    Hashtable<Integer, String> ht = new Hashtable<Integer,String>(1, "Tejas Katkade");
    Integer i = ht.getKey();
    String s = ht.getValue();

    System.out.println("key : "+i);
    System.out.println("Value : "+s);
}
}
