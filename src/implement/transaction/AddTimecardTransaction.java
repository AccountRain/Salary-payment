package implement.transaction;

import java.util.Date;

import implement.classification.HourlyClassification;
import implement.classification.PaymentClassification;
import implement.database.PayrollDatabase;
import implement.entity.Employee;
import implement.entity.TimeCard;
import implement.schedule.PaymentSchedule;

public class AddTimecardTransaction implements Transaction {
	private Date date;
    private double hours;
    private long empId;
    
    PayrollDatabase payrollDatabase = PayrollDatabase.getPayrollDatabase();

    public AddTimecardTransaction(){}

    public AddTimecardTransaction(Date date, double hours, long empId){
        this.date = date;
        this.hours = hours;
        this.empId = empId;
    }

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Employee e = payrollDatabase.getEmployeeById(empId);
		HourlyClassification hourlyClassification = (HourlyClassification) e.getPaymentclassification();
        TimeCard timeCard = new TimeCard(date,hours);
        hourlyClassification.addTimeCard(timeCard);
	}
	
}
