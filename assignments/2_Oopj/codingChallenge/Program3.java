// A
// B C D
// E F G H I
// J K L M N O P
// Q R S T U V W X Y

public class Program3 {
    public static void main(String[] args) {
        int n = 5;
        int m = (2*n-1);
        char ch = 'A';
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++){

                if(j >= n+i)
                    break;
                if(j <= n-i){
                    System.out.print("  ");
                    
                }else{
                    
                    System.out.print(" "+ch++);
                    
                }
            }
            System.out.println();
        }   
    }
}
