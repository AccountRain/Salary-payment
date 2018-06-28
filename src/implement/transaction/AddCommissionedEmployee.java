package implement.transaction;

import implement.classification.CommissionedClassfication;
import implement.classification.PaymentClassification;
import implement.schedule.BiweeklySchedule;
import implement.schedule.PaymentSchedule;

public class AddCommissionedEmployee extends AddEmployeeTransaction {

	private double monthlyPay;
    private double commissionRate;
    
    public AddCommissionedEmployee(long id,String name,String address,double monthlyPay,double commissionRate){
        super(id,name,address);
        this.commissionRate = commissionRate;
        this.monthlyPay = monthlyPay;
    }
	@Override
	protected PaymentSchedule getSchdule() {
		// TODO Auto-generated method stub
		return new BiweeklySchedule();
	}

	@Override
	protected PaymentClassification getClassification() {
		// TODO Auto-generated method stub
		return new CommissionedClassfication(monthlyPay,commissionRate);
	}

}
