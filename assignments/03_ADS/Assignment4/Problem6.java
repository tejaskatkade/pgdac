// Remove duplicates from a sorted linked list.

public class Problem6 {

    public void removeDuplicate(LinkedListDemo ll) {
        LinkedListDemo.Node temp = ll.head;
        while (temp.next != null) {
            if(temp.data == temp.next.data ){
                ll.deleteNode(temp.next);
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListDemo l1 = new LinkedListDemo();
        l1.insert(10);
        l1.insert(20);
        l1.insert(20);
        l1.insert(30);
        l1.insert(30);
        l1.insert(40);
        l1.insert(40);
        l1.insert(50);
        l1.insert(55);
        l1.insert(55);

        l1.print(l1.head);


    }
}
