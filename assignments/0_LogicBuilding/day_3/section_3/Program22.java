// *********
//  *******
//   *****
//    ***
//     *
//    ***
//   *****
//  *******
// *********
public class Program22 {
    public static void main(String[] args) {
        int n=5;
        int num = n+(n-1);

        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                
                if(i<n) {
                    if(j>=num-i){
                        break;
                    }
                    if(j<i){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else{
                    if(j>i){
                        break;
                    }

                    if(j<num-(i+1)){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }

                }
            }
            System.out.println();
        }
    }   
}
