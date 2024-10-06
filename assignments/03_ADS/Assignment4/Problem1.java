
/**
 * Implement a singly linked list with basic
 * operations: insert, delete, search.
 */


public class Problem1 {
    public static void main(String[] args) {
        LinkedListDemo ll = new LinkedListDemo();
        ll.insert(3);
        ll.insert(7);
        ll.insert(5);
        ll.delete(7);
        if(ll.search(5))
            System.out.println("Found");
        else
            System.out.println("Not Found");

        ll.print(ll.head);
    }
}
