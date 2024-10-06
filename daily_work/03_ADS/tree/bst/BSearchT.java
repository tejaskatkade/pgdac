public class BSearchT{
    
    Node root;

    public BSearchT() {
        root = null;
    }
    
    public BSearchT(int data) {
        this.root = new Node(data);
    }

    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
        }
    }

    public Node insert(Node node, int data) {
        if(node == null) {
            node = new Node(data);
            return node;
        }

        if(data <= node.data) {
            node.left = insert(node.left, data);
        }else {
            node.right = insert(node.right, data);
        }
        return node;
    }

    public Node delete(Node root , int data ) {

        if(root == null)
            return root;
        
        if(data < root.data) {
            root.left = delete(root.left, data);
        }else if(data > root.data){
            root.right = delete(root.right, data);
        }else{
            if(root.left == null) {            //
                return root.right;             // Handles both case 1 and 2
            }else if( root.right == null) {    // 1. having no child (leaf node)
                return root.left;              // 2. having one child only (if left is null assign right and vice versa)
            
            }
            // case 3 : two child

            // find Inorder successor (min val in right subtree) & copy that val in the node that we want to delete
            root.data = minValue(root.right);

            // call delete to delete that InOrder successor   
            root.right = delete(root.right, data);
            // if there is only one node then it returns null and it need to assign to the right of that node which we have replaced with inorder successor


            // means : if we are deleting a node with two child then instead of deleting that node we replace it with inorder successor and we only delete that inorder successor

        }
        return root;
    } 

    int minValue(Node root) {
        int x = root.data;
        while (root.left != null) {
            x = root.left.data;
            root= root.left;
        }
        return x;
    }

    public void inOrder(Node root) {
        if(root == null) {
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }
}