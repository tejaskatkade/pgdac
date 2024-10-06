package problem11;

public class Heap{
    
    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];  // root
        arr[a] = arr[b];    // left child
        arr[b] = temp;      // right child
    }

    public void heapify(int[] arr, int n, int i) {
        int root = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < n && arr[left] > arr[root]){
            root = left;
        }

        if(right < n && arr[right] > arr[root]){
            root = right;
        }

        if (root != i) {
            swap(arr,root, i);
            heapify(arr,n, root);
        }
    }

    void display(int[] arr) {
        for (int i=0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public void heapSort(int[] arr) {

        int n = arr.length;

        // Building Max heap
        for (int i = n/2-1; i>=0 ; i--) {
            heapify(arr,n,i);   // Max heap
        }

        //one by one extract elements from the heap
        for (int i = n-1; i > 0; i-- ) {
           
            //replace root node with last element
            swap(arr, i, 0);
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        int[] arr = {5,3,7,4,9,2,4,11,8};
        heap.display(arr);
        heap.heapSort(arr);
        heap.display(arr);
    }
}