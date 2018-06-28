package implement.entity;

import java.util.Date;

public class ServiceCharge {
	private Date date;
    private double amount;

    public ServiceCharge(){}

    public ServiceCharge(Date date,double amount){
        this.amount = amount;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }
}
