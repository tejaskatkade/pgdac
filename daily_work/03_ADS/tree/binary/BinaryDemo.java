public class BT{
	
	Node root; 	// starting point of tree

	static class Node {
		
		Node left;
		int data;
		Node right;
		
		Node(int data) {
			this.left = null;
			this.data = data;
			this.right = null;
		}
		
	}

	
	
	
	public BT() {
		this.root = null;
	}
	
	public BT(int data) {
		this.root = new Node(data);
	}

	
	
	
	
	public static void main(String[] args) {
			
		BT bt = new BT();
		bt.root = new Node(11);
		
	}
}