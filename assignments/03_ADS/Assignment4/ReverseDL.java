public class ReverseDL {
    
}


class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        if(head == null) {
            return head;
        }
        
        while(head.next != null) {
            head = head.next;
        }
        
        DLLNode newHead = head;
        
        while(head != null){
            DLLNode temp = head.next;
            head.next = head.prev;
            head.prev = temp;
            
            head = head.next;
        }
        
        return newHead;
    }
}