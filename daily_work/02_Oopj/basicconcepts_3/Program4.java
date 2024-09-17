public class Program4 {


    public static void main(String[] args) {
        
        int num = 10; //OK
        //int num1 = new int(10); // Not OK
        //Integer num2 = new Integer(10); // OK

        System.out.println(num);
    
        String s1 = new String("Tejas");
        //s1 =  object reference / referance
        // new String("Tejas");  = Intance
        System.out.println(s1);

        String s2 = "Tejas";
        //s2 =object reference
        //"tejas"  = string constant / String literal

        //we can create string object with or without new operator
        
        System.out.println(s2);
    }
}
