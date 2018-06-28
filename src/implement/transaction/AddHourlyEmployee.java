package implement.transaction;

import implement.classification.HourlyClassification;
import implement.classification.PaymentClassification;
import implement.schedule.PaymentSchedule;
import implement.schedule.WeeklySchedule;

public class AddHourlyEmployee extends AddEmployeeTransaction {
	private double hourlyPay;
	
	public AddHourlyEmployee(long id,String name,String address,double hourlyPay){
        super(id,name,address);
        this.hourlyPay = hourlyPay;
    }
	@Override
	protected PaymentSchedule getSchdule() {
		// TODO Auto-generated method stub
		 return new WeeklySchedule();
	}

	@Override
	protected PaymentClassification getClassification() {
		// TODO Auto-generated method stub
		return new HourlyClassification(hourlyPay);
	}

}
