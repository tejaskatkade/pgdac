package demo5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(15);
        array.add(20);  //array.add(Integer.valueOf(10));
        array.add(25);

        for (Integer integer : array) {
            System.out.print(integer + " ");
        }
    }
}
