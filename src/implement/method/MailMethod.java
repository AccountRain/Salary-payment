package implement.method;

import implement.payday.Paycheck;

public class MailMethod implements PaymentMethod {
	private String mailAddress;
	public MailMethod(String mailAdress) {
        this.mailAddress = mailAdress;
    }
	@Override
	public void pay(Paycheck payCheck) {
		// TODO Auto-generated method stub
		payCheck.setFields("Dispostion","Mail");
	}

}
