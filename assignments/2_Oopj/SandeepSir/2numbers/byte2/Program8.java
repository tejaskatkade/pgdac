package byte2;
/***
 * Experiment with converting a byte value into other primitive types or vice
 * versa and observe the results. 
 * 
 * */
public class Program8 {
    public static void main(String[] args) {
        byte num = 99;
        
        short s = num;
        System.out.println(s);  //99

        //char c = num;           // Type mismatch: cannot convert from byte to 

        int i = num;
        System.out.println(i);    // 99

        float f = num;
        System.out.println(f);    //99.0

        double d = num;
        System.out.println(d);     // 99.0

        long l = num;
        System.out.println(l);      // 99


        // Wrapper to Primitive
        Byte numByte = 123;
        byte number = numByte.byteValue();
        System.out.println(number);         // 123

        int intNum = numByte.intValue();
        float floatNum = numByte.floatValue();
        long longNum = numByte.longValue();

        System.out.println(intNum);     // 123
        System.out.println(floatNum);   // 123.0
        System.out.println(longNum);   // 123
    }
}
