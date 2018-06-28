package implement.transaction.changeAffiliation;

import implement.affiliation.Affiliation;
import implement.affiliation.UnionAffiliation;
import implement.database.PayrollDatabase;
import implement.entity.Employee;

public class AddMemberTransaction  extends ChangeAffiliationTransaction{
	private int memberId;
    private double dues;//会费

    public AddMemberTransaction(long empId,int memberId,double dues){
        super((int) empId);
        this.memberId = memberId;
        this.dues = dues;
    }
	@Override
	protected Affiliation getAffiliation() {
		// TODO Auto-generated method stub
		return new UnionAffiliation(memberId,dues);
	}

	@Override
	protected void adddMemberShip(Employee e) {
		// TODO Auto-generated method stub
		PayrollDatabase.getPayrollDatabase().addUnionMember(memberId,e);
	}

}
