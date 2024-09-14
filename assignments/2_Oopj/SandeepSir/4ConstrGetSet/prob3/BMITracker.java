package prob3;

public class BMITracker {
	
	private float weight;
	private float height;
		
	public BMITracker() {
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}


	public float calculateBMI() {
		return this.weight / (this.height * this.height);
	}
	
	public String classifyBMI() {
		float bmi = calculateBMI();
		
		if(bmi < 18.5) {
			return "Underweight";
		}else if(bmi < 24.9){
			return "Normal Weight";
		}else if(bmi < 29.9) {
			return "Over Weight";
		}else {
			return "obese";
		}	
	}
}
