package linkedlist.singlyll;

import linkedlist.singlyll.LinkedListDemo.Node;

public class Main {
    public static void main(String[] args) {
        LinkedListDemo l1 = new LinkedListDemo();
        l1.addFirst(90);
        l1.addFirst(70);
        l1.addFirst(30);
        l1.addFirst(10);
        LinkedListDemo.display(l1.head);

        LinkedListDemo l2 = new LinkedListDemo();
        l2.addFirst(80);
        l2.addFirst(60);
        l2.addFirst(20);
        LinkedListDemo.display(l2.head);
        
        Node temp = MergeList.mergeSortedList(l1.head,l2.head);
        
        LinkedListDemo.display(temp);
    }
}
