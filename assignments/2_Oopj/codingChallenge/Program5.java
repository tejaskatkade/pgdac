//         1
//       1 2 1
//     1 2 3 2 1
//   1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1

public class Program5 {
    public static void main(String[] args) {
        int n = 5;
        int m = (2*n-1);
        //int num = 1;

        for(int i=1; i<=n; i++) {
            int num = 1;
            for(int j=1; j<=m; j++){

                if(j >= n+i)
                    break;
                if(j <= n-i){
                    System.out.print("  ");
                    
                }else{
                    if(j >= n){
                        System.out.print(" "+num--);
                    }else{
                        System.out.print(" "+num++);

                    }
                    
                }
            }
            System.out.println();
        }   
    }
}
