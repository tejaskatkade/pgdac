public class Program6 {
    public static void main(String[] args) {
        int n=4;
        int len = 2*n-1;
        int var = n;
        for (int i = 1; i <= len; i++) {
            for(int j = 1; j <= len;j++) {
                if(i > n){
                    if(j >= n+i ){
                        break;
                    }
    
                    if(j <= n-i){
                        System.out.print("  ");
                    }else{
                        System.out.print(" *");
                    }
                }else{
                    if(j >= n+i ){
                        break;
                    }
    
                    if(j <= n-i){
                        System.out.print("  ");
                    }else{
                        System.out.print(" *");
                    }
                }

            }
            System.out.println();
        }
        
    }
}
