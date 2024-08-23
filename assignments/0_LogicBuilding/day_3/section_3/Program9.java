//Write a program to find and print the largest digit in the number 4825.
public class Program9 {
    public static void main(String[] args) {
        int num = 4825;
        int largest = Integer.MIN_VALUE;
        while (num!=0) {
            int rem = num %10;

            if(rem > largest){
                largest = rem;
            }

            num = num/10;
        }
        System.out.println(largest);
    }
}
