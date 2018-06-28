package implement.transaction.Method;

import implement.method.DirectMethod;
import implement.method.PaymentMethod;

public class ChangebankTransaction extends ChangeMethodTransaction {
	private String bank;
    private double account;

    public ChangebankTransaction(){}

    public ChangebankTransaction(int empId,String bank,double account){
        super(empId);
        this.bank = bank;
        this.account = account;
    }
	@Override
	protected PaymentMethod getPaymentMethod() {
		// TODO Auto-generated method stub
		return new DirectMethod(bank,account);
	}

}
