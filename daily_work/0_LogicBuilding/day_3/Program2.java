public class Program2 {
    public static void main(String[] args) {
        
        int i = 1;
        while (i<=3) {
            int j = 1;
            while (j<=3) {
                if(j<= i){
                    System.out.print("* ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
        // while(i<=6) {
        //     if (i <= j) {
        //         System.out.println("*");
        //         j++;
        //     }else{
        //         System.out.println();
        //         j++;

        //     }
            
        //     i++;
        // }
    }
}
