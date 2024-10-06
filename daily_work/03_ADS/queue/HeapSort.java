package queue;
public class HeapSort {

    void heapify(int arr[], int n, int i){
        int largest = i;      // root node index
        int left = 2*i + 1;   // left node
        int right =  2*i + 2; // right node
        
        if(left < n  && arr[left] < arr[largest]){
            largest = left;
        }
        
        // within array => righr < n

        if(right < n  && arr[right] < arr[largest]){
            largest = right;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }

    }

    void heapSort(int[] arr) {
        int n = arr.length;

        // Building max heap
        for (int i = n/2-1; i >=0; i--) {
            heapify(arr, n, i);
        }
        
        // one by one extract element from the heap
        for (int i = n-1; i >= 0; i--) {

            // replace root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, n, 0);
        }

    }

    void display(int arr[] ) {
        int n = arr.length;
        for(int i=0; i<n; i++ ) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HeapSort h = new HeapSort();

        int arr[] = {99,66,77,44,33,88,11};
        h.display(arr);
        h.heapSort(arr);
        h.display(arr);

    }
}
