// Question 1: Grade Classification
// Write a program to classify student grades based on the following criteria:
//  If the score is greater than or equal to 90, print "A"
//  If the score is between 80 and 89, print "B"
//  If the score is between 70 and 79, print "C"
//  If the score is between 60 and 69, print "D"
//  If the score is less than 60, print "F" 


package task2;

public class Problem1 {
    public static void main(String[] args) {
        int score = 79;
        if(score >= 90) {
            System.out.println("A");
        }else if(score >= 80) {
            System.out.println("B");
        }else if(score >= 70){
            System.out.println("c");
        }else if(score >= 60){
            System.out.println("c");
        }else{
            System.out.println("F");
        }
    }
    
}
