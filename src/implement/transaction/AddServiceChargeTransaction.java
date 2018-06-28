package implement.transaction;

import java.util.Date;

import implement.affiliation.Affiliation;
import implement.affiliation.UnionAffiliation;
import implement.database.PayrollDatabase;
import implement.entity.Employee;
import implement.entity.ServiceCharge;

public class AddServiceChargeTransaction implements Transaction {
	private long memberId;
    private Date date;
    private double amount;
    
    public AddServiceChargeTransaction(){}

    public AddServiceChargeTransaction(long memberId, Date date, double amount){
        this.memberId = memberId;
        this.date = date;
        this.amount = amount;
    }

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Employee e = PayrollDatabase.getPayrollDatabase().getEmployeeByMemberId(memberId);
        ServiceCharge charge = new ServiceCharge(date,amount);

        Affiliation affiliation = e.getAffiliation();
        if (affiliation instanceof UnionAffiliation){
            ((UnionAffiliation)affiliation).addServiceCharge(new ServiceCharge(date,amount));
        }
	}
}
