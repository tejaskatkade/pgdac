package codingChallenge;

public class Program1 {
    public static void main(String[] args) {
        int n = 5;
        int m = (2*n-1);
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++){

                if(j >= n+i)
                    break;
                if(j <= n-i){
                    System.out.print("  ");
                    
                }else{
                    if(j == n-i+1) {
                        System.out.print(" *");
                    }
                    if(j == n+i-1){
                        System.out.print(" *");
                    }

                    
                    //System.out.print(" "+j);
                }
            }
            System.out.println();
        }
    }
}
