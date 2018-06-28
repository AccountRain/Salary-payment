package implement.classification;

import implement.payday.Paycheck;

public class SalariedClassfication implements PaymentClassification {
	private double monthlyPay;
	
	public SalariedClassfication(double monthlyPay) {
		this.monthlyPay=monthlyPay; 
	}
	
	public double calculatePay(Paycheck paycheck) {
		return monthlyPay;
	}
}
