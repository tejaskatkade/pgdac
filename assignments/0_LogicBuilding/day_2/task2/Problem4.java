// Question 4: Discount Calculation
// Write a program to calculate the discount based on the total purchase amount. Use the following
// criteria:
//  If the total purchase is greater than or equal to Rs.1000, apply a 20% discount.
//  If the total purchase is between Rs.500 and Rs.999, apply a 10% discount.
//  If the total purchase is less than Rs.500, apply a 5% discount.
// Additionally, if the user has a membership card, increase the discount by 5%

package task2;

public class Problem4 {
    public static void main(String[] args) {
        boolean isMemeberShipCard = false;
        float amount = 1000;
        float discount;

        if(isMemeberShipCard) {
            if(amount >= 1000 ) {
                discount = 25;
            }else if(amount >= 500){
                discount = 15;
            }else{
                discount = 10;
            }
        }else{
            if(amount >= 1000 ) {
                discount = 20;
            }else if(amount >= 500){
                discount = 10;
            }else{
                discount = 5;
            }
        }
        float finalAmount = (amount - (amount*(discount/100)));
        System.out.println(finalAmount);
    }

    
    
}
