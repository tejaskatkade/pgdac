// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321

public class Program7 {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1; i <= n; i++) {
            int num = 1;

            for (int j = 1; j <= 2*n; j++) {
                if(j< i+1 || j > n+(n-i)){
                    System.out.print(num);
                    
                }else{
                    System.out.print(" ");
                }

                if(j < n){
                    num++;
                }else if(j > n){
                    num--;
                }
            }
            System.out.println();
        }
    }
}
