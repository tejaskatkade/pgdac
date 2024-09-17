// singly Linkd List

public class LL {

    // Node
    private class Node{
        int data;
        Node next;
    
        // public Node(){
        // }
        // public Node(int data){
        //     this.data = data;
        // }
        // public Node(int data, Node next){
        //     this.data = data;
        //     this.next = next;
        // }
        public Node(Node next){
            this.next = next;
        }
    }

    // Head Pointer pointing to the first node
    Node head = null;

    // creating node with next = null
    public Node createNode(){
        Node newNode = new Node(null);
        return newNode;
    }

    // adding node to the start of linked list 
    public void addFirst(int data){
        Node newNode = createNode();
        newNode.data = data;

        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    // adding node to the end of linked list 
    public void addLast(int data){
        Node newNode = createNode();
        newNode.data = data;

        if(head == null){
            head = newNode;
        }else{
            Node temp = head;

            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int length(){

        if(head == null){
            return 0;
        }
        if(head.next == null){
            return 1;
        }

        Node temp = head;
        int length = 0;

        while (temp.next != null) {
            length++;
            temp = temp.next;
        }
        return length+1;
    }

    // Adding at position
    public void addAtPosition(int data, int position){

        if(1 > position || position > length()+1 ){
            System.out.println("Invalid position");
            System.out.println("Length of linked List is "+ length());
        }else if(position == 1){
            addFirst(data);
        }else if (position == length()+1) {
            addLast(data);
        }else{

            Node newNode = createNode();
            newNode.data = data;
            
            Node temp = head;

            while (position - 2 != 0) {
                temp= temp.next;
                position--;    
            }
            newNode.next = temp.next;
            temp.next = newNode;
        } 
    }

    // Delete first node
    public void deleteFirst(){
        if(head == null){
            System.out.println("Linked List is Empty..!");
        }else if(head.next == null){
            head = null;
        }else{
            head = head.next;
        }
    }

    // Delete last node
    public void deleteLast(){
        if(head == null){
            System.out.println("Linked List is Empty..!");
        }else if(head.next == null){
            head=null;
        }else{
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;

        }
    }

     // Delete node at position
     public void deleteAtPosition(int position){

        if(1 > position || position > length()){
            System.out.println("Invalid position");
            System.out.println("Length of linked List is "+ length());
        }else if(position == 1){
            deleteFirst();
        }else if (position == length()) {
            deleteLast();
        }else{
            Node temp = head;

            while (position - 2 != 0) {
                temp= temp.next;
                position--;    
            }
            temp.next = temp.next.next;
        } 
    }

    // printing complete linked list
    public void printNode(){
        if(head == null){
            System.out.println("LinkedList is empty ..!");
        }else if(head.next == null){
            System.out.println("|"+head.data+"|");
        }else{
            Node temp = head;

            while(temp.next != null){
                System.out.print("|"+temp.data+"| => ");
                temp = temp.next;
            }
            System.out.println("|"+temp.data+"|");
        }
    }
    
    
}