package implement.transaction;

import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import implement.database.PayrollDatabase;
import implement.entity.Employee;
import implement.payday.Paycheck;

public class PayDayTransaction implements Transaction{
	private Date date;
    private Hashtable<Integer,Paycheck> paychecks = new Hashtable<Integer, Paycheck>();

    public PayDayTransaction(){}

    public PayDayTransaction(Date date){
        this.date = date;
    }
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		List<Employee> employees = PayrollDatabase.getPayrollDatabase().getAllEmployees();
		for (Employee e : employees){
            if (e != null){
                if (e.isPayDate(date)){
                    Date startDate = e.getPayPeriodStartDate(date);
                    Paycheck payCheck = new Paycheck(startDate,date);
                    paychecks.put(e.getEmpId(),payCheck);
                    e.payDay(payCheck);
                }
            }
        }
	}
	public Paycheck getPayCheck(int empId){
        return paychecks.get(empId);
    }

}
