package implement.classification;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

import implement.entity.SalesReceipt;
import implement.payday.Paycheck;

public class CommissionedClassfication implements PaymentClassification {
     	private double salaryBase;
     	private double commissionRate;
     	
     	private ConcurrentHashMap<Date,SalesReceipt> salesReceipts=new ConcurrentHashMap<Date,SalesReceipt>();
     	
     	public CommissionedClassfication(double salaryBase,double commissionRate) {
     		this.salaryBase=salaryBase;
     		this.commissionRate=commissionRate;
     	}

     	public void addSalesReceipt(SalesReceipt salesReceipt) {
     		salesReceipts.put(salesReceipt.getDate(),salesReceipt);
     	}
     	
     	public SalesReceipt getSalesReceipt(Date date) {
            return salesReceipts.get(date);
        }
     	
     	public double calculatePay(Paycheck payCheck) {
            double salesTotal = 0.0;
            return 0;
        }
}
