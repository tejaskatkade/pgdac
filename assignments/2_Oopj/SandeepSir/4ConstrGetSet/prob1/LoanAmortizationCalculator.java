package prob1;

public class LoanAmortizationCalculator {

	private double principal;
	private double rateOfInterest;
	private float loanTerm;
	
	LoanAmortizationCalculator() {
		
	}
	LoanAmortizationCalculator(double principal, double rateOfInterest, float loanTerm){
		this.principal = principal;
		this.rateOfInterest = rateOfInterest;
		this.loanTerm = loanTerm;
	}
	
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	
	public double getPrincipal() {
		return principal;
	}
	
	public void setLoanTerm(float loanTerm) {
		this.loanTerm = loanTerm;
	}
	
	public float getLoanTerm() {
		return loanTerm;
	}
	
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}
	
	@Override
	public String toString() {
		return "Principal : "+this.principal+"Interest Rate : "+this.rateOfInterest+"Loan Term "+this.loanTerm;
	}
	
	public double calculateMonthlyPayment() {
		double monthlyInterestRate = rateOfInterest / 12 / 100;
		double numberOfMonths = loanTerm * 12;
		double monthlyPayment = principal * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfMonths))
				/ (Math.pow((1 + monthlyInterestRate), numberOfMonths) - 1);
		//System.out.println("Monthly Payement : " + monthlyPayment);
		return monthlyPayment;
	}

	

	
				

	
}
