
// Merge two sorted linked lists.
public class Program4 {

    public static LinkedListDemo mergeList(LinkedListDemo l1, LinkedListDemo l2){
        LinkedListDemo l3 = new LinkedListDemo();
        LinkedListDemo.Node head1 = l1.head;
        LinkedListDemo.Node head2 = l2.head;
        while (head1 != null && head2 != null) {
            if(head1.data < head2.data) {
                l3.insert(head1.data);
                head1 = head1.next;
            }else{
                l3.insert(head2.data);
                head2 = head2.next;
            }

        }

        while (head1 != null) {
            l3.insert(head1.data);
            head1 = head1.next;
        }

        while (head2 != null) {
            l3.insert(head2.data);
            head2 = head2.next;
        }
        
        return l3;
    }
    public static void main(String[] args) {
        LinkedListDemo l1 = new LinkedListDemo();
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.insert(50);

        LinkedListDemo l2 = new LinkedListDemo();
        l2.insert(5);
        l2.insert(25);
        l2.insert(35);
        l2.insert(45);
        l2.insert(55);
        l2.insert(65);

        LinkedListDemo l3 = mergeList(l1,l2);
        l3.print(l3.head);


    }
}
