package implement.transaction;

import implement.database.PayrollDatabase;
import implement.entity.Employee;

public class DeleteEmployeeTransaction extends ChangeEmployeeTransaction {
	private long id;

    public DeleteEmployeeTransaction(){}

    public DeleteEmployeeTransaction(long id){
        this.id = id;
    }

	@Override
	public void change(Employee e) {
		// TODO Auto-generated method stub
		PayrollDatabase.getPayrollDatabase().deleteEmployeeById(id);
	}

}
