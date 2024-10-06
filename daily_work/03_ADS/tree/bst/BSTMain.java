public class BSTMain {
    public static void main(String[] args) {
        System.out.println("BST");

        BSearchT bst = new BSearchT(37);
        
        //bst.root = bst.insert(bst.root, 37);
        System.out.println("Root : "+bst.root.data);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 47);
        bst.insert(bst.root, 34);
        bst.insert(bst.root, 33);
        bst.insert(bst.root, 74);
        bst.insert(bst.root, 56);
        bst.insert(bst.root, 67);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 21);

        System.out.print("\nInorder : ");
        bst.inOrder(bst.root);

        bst.delete(null, 56);

        System.out.print("\nInorder : ");
        bst.inOrder(bst.root);

    }
}
