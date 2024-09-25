import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class ListDemo1{


    public static void display(Collection<?> c) {
        if(c == null) return;

        for (Object object : c) {
            System.out.println(object);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        // order remain same as added :

        list.add(3);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(4);

        System.out.println("Elements");
        System.out.println(list);
        


        // Collections --> class
        // Collection  --> interface


        // void sort(List <T> list)  --> <T extends comparatable>
        // void sort(List <T> list, Compartor comp)

        System.out.println("Sort");
        Collections.sort(list);
        display(list);

        System.out.println("Sufful");

        Collections.shuffle(list);
        display(list);

        System.out.println("Max : "+ Collections.max(list));

        System.out.println("Reverse ");
        Collections.sort(list,Collections.reverseOrder());

        display(list);

    }
}