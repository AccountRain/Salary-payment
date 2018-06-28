package implement.method;

import implement.payday.Paycheck;

public class HoldMethod implements PaymentMethod{

	@Override
	public void pay(Paycheck payCheck) {
		// TODO Auto-generated method stub
		 payCheck.setFields("Dispostion","Hold");
	}

}
