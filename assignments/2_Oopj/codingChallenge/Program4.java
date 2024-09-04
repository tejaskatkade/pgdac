// 1
// 1 2
// 1   3
// 1     4
// 1 2 3 4 5

public class Program4 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                if(i<n && j>1  && j<i){
                    System.out.print("  ");
                }else{
                    System.out.print(" "+j);

                }
            }
            System.out.println();
        }
    }
}
