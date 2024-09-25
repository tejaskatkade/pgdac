public class Search {

    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]  == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {11,13,15,51,71,56,48,8,99,110};
        System.out.println(search(arr,48));
    } 
}
