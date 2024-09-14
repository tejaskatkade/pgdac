package problem8;

/***
 * 
 * Modify the previous assignment to use getter and setter methods instead of
 * acceptRecord and printRecord.
 */

public class Main {
    public static void main(String[] args) {
        ArrayUtil  util = new ArrayUtil();
        util.acceptRecord();
        util.printRecord();
        ArrayUtil.releseResource();
    }
}
