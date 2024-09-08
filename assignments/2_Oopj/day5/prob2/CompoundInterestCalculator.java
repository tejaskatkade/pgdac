package prob2;

public class CompoundInterestCalculator {

	private double principal;
	private float annualInterestRate;
	private float numberOfCompounds;
	private float years;

	
	
	public CompoundInterestCalculator() {

	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public float getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(float annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public float getNumberOfCompounds() {
		return numberOfCompounds;
	}

	public void setNumberOfCompounds(float numberOfCompounds) {
		this.numberOfCompounds = numberOfCompounds;
	}

	public float getYears() {
		return years;
	}

	public void setYears(float years) {
		this.years = years;
	}

	public double calculateFutureValue() {
		double rate = this.annualInterestRate / 100;
		//System.out.println("Rate :"+rate);
		double futureValue = this.principal * Math.pow(1 + (rate / this.numberOfCompounds), this.numberOfCompounds * this.years);
		//System.out.println(futureValue);
		//System.out.printf("Future Value: %.2f%n", futureValue);
		return futureValue;
	}

	@Override
	public String toString() {
		return "CompoundInterestCalculator [principal=" + principal + ", annualInterestRate=" + annualInterestRate
				+ ", numberOfCompounds=" + numberOfCompounds + ", years=" + years + "]";
	}

}
