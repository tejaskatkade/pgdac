
// 0
// 505
// 45054
// 3450543
// 234505432
// 12345054321

public class Program8 {
    public static void main(String[] args) {
        int n = 6;
        int num = 1;
        int var = 6 ;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= num; j++) {
                System.out.print((var%6));
                if(j<(n+1)-i){
                    var++;
                }else{  
                  var--;
                }
            }
            var = i-1;
            num=num+2;
            System.out.println();
        }
    }
}
