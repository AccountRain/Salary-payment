package implement.entity;

import java.util.Date;

public class SalesReceipt {
    private Date date;
    private int amount;
   
    public Date getDate() {
    	return date;
    }

	public int getAmount() {
		return amount;
	}
	
	public SalesReceipt(){}
	
	public SalesReceipt(Date date,int amount){
       this.date = date;
       this.amount = amount;
   }

}
