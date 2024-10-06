package linkedlist.singlyll;


import linkedlist.singlyll.LinkedListDemo.Node;

public class MergeList {

    static Node mergeSortedList(Node h1, Node h2){

        
        if(h1 == null){
			return h2;
		}
		if(h2 == null){
			return h1;
		}
		
		if(h1.data < h2.data){
			h1.next = mergeSortedList(h1.next, h2);
			return h1;
			
		}else{
			h2.next = mergeSortedList(h1, h2.next);
			return h2;
		}
		
	}
    
}
