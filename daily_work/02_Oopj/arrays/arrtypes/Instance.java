package arrtypes;

import java.util.Arrays;

public class Instance {

    public static void main(String[] args) {
        // Array of instance

        Complex[] array = new Complex[3];

        array[0] = new Complex(0, 1);
        array[1] = new Complex(0, 2);
        array[2] = new Complex(0,3);

        System.out.println(Arrays.toString(array));


        for (int i = 0; i < array.length; i++) {
            array[i] = new Complex();
        }

        System.out.println(Arrays.toString(array));


    }
}
