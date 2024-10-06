public class Problem2 {
    
    public static void main(String[] args) {
        LinkedListDemo ll = new LinkedListDemo();
        ll.insert(3);
        ll.insert(7);
        ll.insert(5);
        ll.insert(15);
        ll.insert(14);
        ll.print(ll.head);
        ll.reverse();
        ll.print(ll.head);
    }
}
