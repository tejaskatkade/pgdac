//         1 x 8 + 1 = 9
//        12 x 8 + 2 = 98
//       123 x 8 + 3 = 987
//      1234 x 8 + 4 = 9876
//     12345 x 8 + 5 = 98765
//    123456 x 8 + 6 = 987654
//   1234567 x 8 + 7 = 9876543
//  12345678 x 8 + 8 = 98765432
// 123456789 x 8 + 9 = 987654321
public class Program9 {
    public static void main(String[] args) {
        int n =9;
        
        for (int i = 1; i <= n; i++) {
            int var = 1;
            int num = n;
            for (int j = 1; j <= n; j++) {
                if(j<=n-i){
                    System.out.print(" ");
                }else{
                    System.out.print(var++);
                }
            }
            
            System.out.print(" x 8 + "+i+" = ");

            for (int j=1; j <=i ; j++) {
                System.out.print(num--);
            }


            System.out.println();
        }
    }
}