// Question 5: Student Pass/Fail Status with Nested Switch
// Write a program that determines whether a student passes or fails based on their grades in three subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or more subjects, print the number of subjects they failed in. 

package task2;

public class Problem5 {

    public static void main(String[] args) {
        int phy = 49;
        int chem = 39;
        int math = 59;

        int failCount = 0;

        if(phy < 40){
            failCount++;
        }
        if(chem < 40){
            failCount++;
        }
        if(math < 40){
            failCount++;
        }

        switch (failCount) {
            case 0:
                System.out.println("Pass");
                break;
            case 1:
                System.out.println("Failed in 1 subject");
                break;
            case 2:
                System.out.println("Failed in 2 subject");
                break;
            case 3:
                System.out.println("Failed in 3 subject");
                break;
        
            default:
                break;
        }
    }
    
}
