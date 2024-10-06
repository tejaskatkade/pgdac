public class Program5 {
    
}

/**
 * Definition for singly-linked list.
 */ 
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
            int count = 0;
            ListNode temp = head;
            if(temp == null){
                return head;
            }

            while(temp != null){
                count = count +1;
                temp = temp.next;
            }

            int pos = count - n;
            if(pos == 0) {
                head = head.next;
                return head;
            }
            temp = head;
            while(pos-1 != 0){
                temp = temp.next;
                pos--;
            }

            if(temp.next != null){
                temp.next = temp.next.next;
            }
            return head;
    }
}
