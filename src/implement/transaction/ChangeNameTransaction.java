package implement.transaction;

import implement.entity.Employee;

public class ChangeNameTransaction extends ChangeEmployeeTransaction {
	private String name;

    public ChangeNameTransaction(){}

    public ChangeNameTransaction(long empID,String name){
        super((int) empID);
        this.name = name;
    }
	@Override
	public void change(Employee e) {
		// TODO Auto-generated method stub
		 e.setName(name);
	}

}
