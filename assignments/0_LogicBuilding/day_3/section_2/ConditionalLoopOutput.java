package section_2;

public class ConditionalLoopOutput {
    public static void main(String[] args) {
            int num = 1;
        for (int i = 1; i <= 4; i++) {
                if (i % 2 == 0) {
                    num += i;
                } else {
                    num -= i;
                }
            }
            System.out.println(num);
        }
   }
   
