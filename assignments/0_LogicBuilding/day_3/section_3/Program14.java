//  *                       //1
//  **                      //2
//  ***                     //3    
//  *****                   //5
//  *******                 //7
//  *********               //9

public class Program14 {
    public static void main(String[] args) {
        int n=5;
        for(int i= 1; i<n*2; i++) {
            if(i%2!=0 || i==2) {
                for(int j=1; j<n*2;j++) {
                    if (j<=i) {
                        System.out.print("*");    
                    }   
                }
                System.out.println();    
            }    
        }
    }
}
