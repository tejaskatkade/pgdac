


/***
 * Initialize a variable of each primitive type with a user-defined value and convert it into
 * String:
 *  1.	First, use the toString method of the corresponding wrapper class. (e.g.
 *              Integer.toString()).
 * 2.  Then, use the valueOf method of the String class. (e.g., String.valueOf()).

 */
class Program {

    public static void main(String[] args) {
        boolean status = true;
        byte  byteNum = 123;
        short shortNum = 1234;
        char ch = 'T';
        int num = 12345;
        float fNum = 12.5f;
        double dNum = 123.34;
        long lNum = 123457890;


        String boolStr = Boolean.toString(status);
        String byteStr = Byte.toString(byteNum);
        String shortStr = Short.toString(shortNum);
        String charStr = Character.toString(ch);
        String intStr = Integer.toString(num);
        String fStr = Float.toString(fNum);
        String dStr = Double.toString(dNum);
        String lStr = Long.toString(lNum);

        System.out.println(boolStr);
        System.out.println(byteStr);
        System.out.println(shortStr);
        System.out.println(charStr);
        System.out.println(intStr);
        System.out.println(fStr);
        System.out.println(dStr);
        System.out.println(lStr);


        String bool = String.valueOf(status);
        String b = String.valueOf(byteNum);
        String s = String.valueOf(shortNum);
        String i =String.valueOf(num);
        String f = String.valueOf(fNum);
        String d = String.valueOf(dNum);
        String l = String.valueOf(lNum);

    }
}