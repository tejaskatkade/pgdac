package linkedlist;

import linkedlist.NodeDemo.Node;

public class Main {
    static void display(NodeDemo ll) {
        Node temp = ll.head;

        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next; 
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NodeDemo ll = new NodeDemo();
        ll.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        ll.head.next = second;
        second.next = third;

        display(ll);

        ll.addAtFirst(5);
        ll.addAtFirst(2);

        display(ll);

    }
}
