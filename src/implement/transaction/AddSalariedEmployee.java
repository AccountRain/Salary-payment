package implement.transaction;

import implement.classification.PaymentClassification;
import implement.classification.SalariedClassfication;
import implement.schedule.MonthlySchedule;
import implement.schedule.PaymentSchedule;

public class AddSalariedEmployee extends AddEmployeeTransaction {
	private double monthlyPay;
	
	public AddSalariedEmployee(long id,String name,String address,double monthlyPay){
        super(id,name,address);
        this.monthlyPay = monthlyPay;
    }
	@Override
	protected PaymentSchedule getSchdule() {
		// TODO Auto-generated method stub
		return new MonthlySchedule();
	}

	@Override
	protected PaymentClassification getClassification() {
		// TODO Auto-generated method stub
		return new SalariedClassfication(monthlyPay);
	}

}
