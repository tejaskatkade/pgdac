//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
public class Program18 {
    public static void main(String[] args) {
        int n=4;
        int var = 1;
        int num = (n+(n-1));

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=num; j++) {
                if (i<=n) {
                    if (j>=n+i) {
                        break;
                    }

                    if(j<=n-i){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else{
                    if(j>num-var){
                        break;
                    }
                    if(j<=var){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
            }
            if(i>n){
                var++;
            }
            System.out.println();
        }
    }
}
