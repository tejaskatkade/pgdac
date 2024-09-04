package codingChallenge;

// ***********
//  *       *
//   *     *
//    *   *
//     * *
//      *
public class Program2 {
    public static void main(String[] args) {
        int n = 6;
        int m = 2*n;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++){

                if(j > m-i)
                    break;
                if(j < i){
                    System.out.print(" ");
                    
                }else if(i > 1 && j > i && j < m-i){
                    System.out.print(" ");
                    
                }else{
                    
                    System.out.print("*");
                    
                }
            }
            System.out.println();
        }   
    }
}
