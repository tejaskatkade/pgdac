// 1 
// 2 4
// 3 6 9
// 4 8 12 16
// 5 10 15
// 6 12
// 7
public class Program10 {
    public static void main(String[] args) {
        int n = 4;
        int m = (2*n-1);
        
        for(int i=1; i<=m; i++) {
            for(int j=1; j<=i; j++){
                if (i<=n) {
                    System.out.print(i*j+" ");    
                } else {
                    System.out.print(i*j+" ");
                    if (j == (m+1)-i) {
                        break;
                    }
                    
                }    
            }
            System.out.println();
        }   
    }
}
