// 1
// 1*2
// 1*2*3
// 1*2*3*4
// 1*2*3*4*5 

public class program19 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>i){
                    break;
                }
                if(j>1){
                    System.out.print("*");
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
