
 // Definition for singly-linked list.
  class Node {
     int val;
     Node next;
     Node(int x) {
         val = x;
          next = null;
      }
  }
 
public class problem3 {
    public boolean hasCycle(Node head) {
        if(head == null){
            return false;
        }
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
