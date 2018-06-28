package implement.transaction.addEmployee;

import implement.classification.PaymentClassification;
import implement.entity.Employee;
import implement.schedule.PaymentSchedule;
import implement.transaction.ChangeEmployeeTransaction;

public abstract class ChangeClassificationTransaction extends ChangeEmployeeTransaction {
	public ChangeClassificationTransaction(){}

    public ChangeClassificationTransaction(int empId){
        super(empId);
    }
	@Override
		public void change(Employee e) {
	        e.setPaymentclassification(getClassification());
	        e.setPaymentSchedule(getSchedule());

	    }

	    protected abstract PaymentSchedule getSchedule();

	    protected abstract PaymentClassification getClassification();
}
