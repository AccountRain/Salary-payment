package implement.transaction;

import implement.entity.Employee;

public class ChangeAddressTransaction extends ChangeEmployeeTransaction {
	long empId;
    String address;

    public ChangeAddressTransaction(){}

    public ChangeAddressTransaction(long empId,String address){
        super((int) empId);
        this.address = address;
    }
	@Override
	public void change(Employee e) {
		// TODO Auto-generated method stub
		 e.setAddress(address);
	}

}
