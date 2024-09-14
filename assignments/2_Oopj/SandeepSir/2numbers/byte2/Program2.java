package byte2;

/**
 * Write a program to find the minimum and maximum values of byte using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Byte
 * MIN_VALUE and Byte.MAX_VALUE).
 */

public class Program2 {
    public static void main(String[] args) {
        byte min = Byte.MIN_VALUE;
        byte max = Byte.MAX_VALUE;

        System.out.println("Minimum byte value : "+min);
        System.out.println("Maximum byte value : "+max);
    }
}

/*
 * Minimum byte value : -128
 * Maximum byte value : 127
 */
