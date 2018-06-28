package implement.transaction.addEmployee;

import implement.classification.CommissionedClassfication;
import implement.classification.PaymentClassification;
import implement.schedule.BiweeklySchedule;
import implement.schedule.PaymentSchedule;

public class ChangeCommissionedTransaction extends ChangeClassificationTransaction {
	private double salaryBase;
    private double commissionRate;
    
    public ChangeCommissionedTransaction(){}

    public ChangeCommissionedTransaction(long empId,double salaryBase,double commissionRate){
        super((int) empId);
        this.commissionRate = commissionRate;
        this.salaryBase = salaryBase;
    }
	@Override
	protected PaymentSchedule getSchedule() {
		// TODO Auto-generated method stub
		return new BiweeklySchedule();
	}

	@Override
	protected PaymentClassification getClassification() {
		// TODO Auto-generated method stub
		return new CommissionedClassfication(salaryBase,commissionRate);
	}

}
