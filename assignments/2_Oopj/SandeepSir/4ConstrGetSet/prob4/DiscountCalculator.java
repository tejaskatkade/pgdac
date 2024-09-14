package prob4;

public class DiscountCalculator {
	
	private float originalPrice;
	private float discountRate;
	//private float discountAmount;
	
	DiscountCalculator(){

	}
	
	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}

	public float getOriginalPrice(){
		return this.originalPrice;
	}

	public void setDiscountRate(float discountRate){
		this.discountRate = discountRate;
	}

	public float getDiscountRate(){
		return this.discountRate;
	}

	public String toString(){
		return "Discount Calculator [ Original Price :"+ this.originalPrice +" Discount Rate :"+ this.discountRate+" ]";
	}

	public float calculateDiscount() {
		// final amout
		return this.originalPrice - (this.originalPrice * (this.discountRate / 100 ));	
	}
}
