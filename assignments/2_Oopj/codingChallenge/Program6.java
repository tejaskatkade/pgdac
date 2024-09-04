//       1
//     1 2 1
//   1 2 3 2 1
// 1 2 3 4 3 2 1
//   1 2 3 2 1
//     1 2 1
//       1

public class Program6 {
    public static void main(String[] args) {
        int n=4;
        int len = 2*n-1;
        int var = 1;
        
        for (int i = 1; i <= len; i++) {
            int num = 1;
            for(int j = 1; j <= len;j++) {
                if(i <= n){
                    if(j >= n+i ){
                        break;
                    }
    
                    if(j <= n-i){
                        System.out.print("  ");
                    }else{
                        if(j<n){
                            System.out.print(" "+num++);
                        }else{
                            System.out.print(" "+num--);

                        }
                    }
                }else{
                    if(j > len-var ){
                        break;
                    }
                    //System.out.print(j);
                    if(j <= var){
                        System.out.print("  ");
                    }else{
                        if(j<n){
                            System.out.print(" "+num++);
                        }else{
                            System.out.print(" "+num--);
                        }
                    }
                    
                }
                

            }
            if(i>n){
                var++;
            }
            System.out.println();
        }
        
    }
}
