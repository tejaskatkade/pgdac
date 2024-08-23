// 5
// 5*4
// 5*4*3
// 5*4*3*2
// 5*4*3*2*1

public class Program20 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=5; j>0; j--){
                if(j<n-i){
                    break;
                }
                if(j<5){
                    System.out.print("*");
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
