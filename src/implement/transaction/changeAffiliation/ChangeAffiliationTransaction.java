package implement.transaction.changeAffiliation;

import implement.affiliation.Affiliation;
import implement.entity.Employee;
import implement.transaction.ChangeEmployeeTransaction;

public abstract class ChangeAffiliationTransaction extends ChangeEmployeeTransaction {
	public ChangeAffiliationTransaction(){}

    public ChangeAffiliationTransaction(int empId){
        super(empId);
    }
	@Override
	public void change(Employee e) {
		// TODO Auto-generated method stub
		adddMemberShip(e);
        e.setAffiliation(getAffiliation());
	}
	protected abstract Affiliation getAffiliation();

    protected abstract void adddMemberShip(Employee e);
}
