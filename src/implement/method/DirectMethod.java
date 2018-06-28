package implement.method;

import implement.payday.Paycheck;

public class DirectMethod implements PaymentMethod{
	private String bank;
    private double account;
    
    public DirectMethod(){}
    public DirectMethod(String bank, double account) {
        this.bank = bank;
        this.account = account;
    }
	@Override
	public void pay(Paycheck payCheck) {
		// TODO Auto-generated method stub
		payCheck.setFields("Dispostion","Direct");
//		payCheck.setFields(bank,"account");
	}

}
