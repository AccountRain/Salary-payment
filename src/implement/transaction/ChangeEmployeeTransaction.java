package implement.transaction;

import implement.database.PayrollDatabase;
import implement.entity.Employee;

public abstract class ChangeEmployeeTransaction implements Transaction{
	private long empID;
	
	public ChangeEmployeeTransaction(int empID) {
        this.empID = empID;
    }
	
    public ChangeEmployeeTransaction(){}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Employee e = PayrollDatabase.getPayrollDatabase().getEmployeeById(empID);
        if (e != null){
            change(e);
        }
	}
	 public abstract void change(Employee e);
}
