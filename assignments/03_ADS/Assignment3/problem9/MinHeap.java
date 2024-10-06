package problem9;

public class MinHeap{
    
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];  // root
        arr[a] = arr[b];    // left child
        arr[b] = temp;      // right child
    }

    public static void heapify(int[] arr, int n, int i) {
        int root = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < n && arr[left] < arr[root]){
            root = left;
        }

        if(right < n && arr[right] < arr[root]){
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


    public void heapSort(int[] arr) {

        

        
    }

    public static int extractMin(int[] arr) {
        //one by one extract elements from the heap
        int res = arr[0];
        swap(arr, arr.length-1, 0);
        heapify(arr, arr.length -1, 0);
        return res;
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap();
        int[] arr = {10,15,20,17};
        
        int n = arr.length;
        for (int i = n/2-1; i>=0 ; i--) {
            heapify(arr,n,i);   
        }
        System.out.println("Min : "+ extractMin(arr));
        heap.display(arr);
    }
}