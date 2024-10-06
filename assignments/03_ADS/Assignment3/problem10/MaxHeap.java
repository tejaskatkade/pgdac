package problem10;

public class MaxHeap{
    
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];  // root
        arr[a] = arr[b];    // left child
        arr[b] = temp;      // right child
    }

    public static void heapify(int[] arr, int n, int i) {
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
        for (int i=0; i <arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int extractMax(int[] arr) {
        //one by one extract elements from the heap
        int res = arr[0];
        swap(arr, arr.length-1, 0);
        heapify(arr, arr.length -1, 0);
        return res;
    }


    
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap();
        int[] arr = {12,7,15,5};
        
        int n = arr.length;
        // Building Max heap
        for (int i = n/2-1; i>=0 ; i--) {
            heapify(arr,n,i);   // Max heap
        }
        System.out.println("Max : "+ extractMax(arr));
        
        heap.display(arr);
    }
}