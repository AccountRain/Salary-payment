package implement.transaction.addEmployee;

import implement.classification.PaymentClassification;
import implement.classification.SalariedClassfication;
import implement.schedule.MonthlySchedule;
import implement.schedule.PaymentSchedule;

public class ChangeSalariedTransaction extends ChangeClassificationTransaction {
	private double monthlyPay;

    public ChangeSalariedTransaction(){}

    public ChangeSalariedTransaction(double empId,double monthlyPay){
        super((int) empId);
        this.monthlyPay = monthlyPay;
    }

	@Override
	protected PaymentSchedule getSchedule() {
		// TODO Auto-generated method stub
		return new MonthlySchedule();
	}

	@Override
	protected PaymentClassification getClassification() {
		// TODO Auto-generated method stub
		return new SalariedClassfication(monthlyPay);
	}

}
