package implement.transaction.Method;

import implement.entity.Employee;
import implement.method.PaymentMethod;
import implement.transaction.ChangeEmployeeTransaction;

public abstract class ChangeMethodTransaction extends ChangeEmployeeTransaction {
	public ChangeMethodTransaction(){}

    public ChangeMethodTransaction(int empId){
        super(empId);
    }
    
	@Override
	public void change(Employee e) {
		// TODO Auto-generated method stub
		e.setPaymentMethod(getPaymentMethod());
	}
	protected abstract PaymentMethod getPaymentMethod();
}
