package implement.transaction.addEmployee;

import implement.classification.HourlyClassification;
import implement.classification.PaymentClassification;
import implement.schedule.PaymentSchedule;
import implement.schedule.WeeklySchedule;

public class ChangeHourlyTransaction extends ChangeClassificationTransaction {
	private double hourlyRate;

    public ChangeHourlyTransaction(){}

    public ChangeHourlyTransaction(long empId,double hourlyRate){
        super((int) empId);
        this.hourlyRate = hourlyRate;
    }
	@Override
	protected PaymentSchedule getSchedule() {
		// TODO Auto-generated method stub
		return new WeeklySchedule();
	}

	@Override
	protected PaymentClassification getClassification() {
		// TODO Auto-generated method stub
		return new HourlyClassification(hourlyRate);
	}

}
