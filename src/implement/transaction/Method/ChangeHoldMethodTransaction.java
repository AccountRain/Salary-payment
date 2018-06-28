package implement.transaction.Method;
import implement.method.HoldMethod;
import implement.method.PaymentMethod;


public class ChangeHoldMethodTransaction extends ChangeMethodTransaction {
	public ChangeHoldMethodTransaction(){}

    public ChangeHoldMethodTransaction(int empId){
        super(empId);
    }
	@Override
	protected PaymentMethod getPaymentMethod() {
		// TODO Auto-generated method stub
		return new HoldMethod();
	}

	
}
