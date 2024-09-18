package demo7;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> getIntegerList(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        return arrayList;
    }
    public static ArrayList<Character> getCharacterList(){
        ArrayList<Character> arrayList = new ArrayList<>();
        arrayList.add('A');
        arrayList.add('B');
        arrayList.add('C');
        arrayList.add('D');
        arrayList.add('E');
        return arrayList;
    }

    // public static void printIntegerList(ArrayList<Integer> integers){
    //     for(Integer i : integers){
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    // }
    
    // public static void printCharacterList(ArrayList<Character> chars){
    //     for(Character ch : chars){
    //         System.out.print(ch + " ");
    //     }
    //     System.out.println();
    // }


    public static void print(ArrayList<?> obj) {
        for( Object i : obj){
            System.out.print(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
       ArrayList<Integer> integers = Main.getIntegerList();
       //Main.printIntegerList(integers);
       Main.print(integers);

       ArrayList<Character> character = Main.getCharacterList();
       //Main.printCharacterList(character);
       Main.print(character);
    }
}
