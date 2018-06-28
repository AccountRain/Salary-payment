package implement.transaction;

import java.util.Date;

import implement.classification.CommissionedClassfication;
import implement.database.PayrollDatabase;
import implement.entity.Employee;
import implement.entity.SalesReceipt;

public class AddSalesReceiptTransaction implements Transaction {
	private Date date;
    private int amount;
    private long id;
    
    public AddSalesReceiptTransaction(){}
    public AddSalesReceiptTransaction(Date date, int amount, long id) {
        this.date = date;
        this.amount = amount;
        this.id = id;
    }
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		SalesReceipt salesReceipt = new SalesReceipt(date,amount);
        Employee e = PayrollDatabase.getPayrollDatabase().getEmployeeById(id);
        CommissionedClassfication commissionedClassification = (CommissionedClassfication) e.getPaymentclassification();
        commissionedClassification.addSalesReceipt(salesReceipt);
	}
	
}
