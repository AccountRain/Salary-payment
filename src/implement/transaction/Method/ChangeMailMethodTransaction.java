package implement.transaction.Method;

import implement.method.MailMethod;
import implement.method.PaymentMethod;

public class ChangeMailMethodTransaction extends ChangeMethodTransaction {
	private String mailAdress;

    public ChangeMailMethodTransaction(){}

    public ChangeMailMethodTransaction(int empId,String mailAdress){
        super(empId);
        this.mailAdress = mailAdress;
    }
	@Override
	protected PaymentMethod getPaymentMethod() {
		// TODO Auto-generated method stub
		return new MailMethod(mailAdress);
	}

}
