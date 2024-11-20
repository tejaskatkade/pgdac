public class abc {

     

public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int l1 = nums1.length;
    int l2 = nums2.length;

    int total = l1+ l2;
    System.out.println("Total :"+total);

    int mid = (l1+l2)/2;
    if(total%2 == 0){
        mid = mid+1;
    }

    System.out.println("Mid "+ mid);


// 1 2 3 5 
// 4 6 7 
// 7

// 1 2 3 4 5 6 7 8
    
        int i = 0;
        int j = 0;
        int k = 0;
        double mid1=0;
        double mid2=0;

        while(i<=mid && j < l1 && k < l2){
            if(nums1[j] < nums2[k]){
                mid2 = mid1;
                mid1= nums1[j];
                j++;
            }else{
                mid2 = mid1;
                mid1= nums2[k];
                k++;
            }
            i++;
        }
        // while(j<l1){
        //     mid2 = mid1;
        //     mid1= nums1[j];
        //     j++;
        //     i++;
        // }
        // while(k<l2){
        //     mid2 = mid1;
        //     mid1= nums2[k];
        //     k++;
        //     i++;
        // }

        System.out.println("mid1 : "+mid1);
        System.out.println("mid2 : "+mid2);
    if(total%2 == 0){
        return  (mid1 + mid2)/2;   
    }else{
        return mid1;
    }
}

public static void main(String[] args) {
    
    int arr1[] = {1,2};
    int arr2[] = {3,4};

    System.out.println(findMedianSortedArrays(arr1,arr2));
}
}