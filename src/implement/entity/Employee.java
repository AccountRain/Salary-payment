package implement.entity;

import java.util.Date;

import implement.affiliation.Affiliation;
import implement.affiliation.NoAffiliation;
import implement.classification.PaymentClassification;
import implement.method.PaymentMethod;
import implement.payday.Paycheck;
import implement.schedule.PaymentSchedule;

public class Employee {
   private int id;
   private String name;
   private String address;
   
   PaymentMethod paymentMethod;
   PaymentSchedule paymentSchedule;
   PaymentClassification paymentclassification;
   Affiliation affiliation;
   
   public Employee(long id,String name,String address) {
	   this.id=(int)id;
	   this.name=name;
	   this.address=address;
	   affiliation=new NoAffiliation();
   }
   
   public PaymentClassification getPaymentclassification() {
		return paymentclassification;
	}
   
   public PaymentSchedule getPaymentSchedule() {
	   return paymentSchedule;
   }
   
   public PaymentMethod getPaymentMethod() {
       return  paymentMethod;
   }

   public void setPaymentMethod(PaymentMethod paymentMethod) {
	   this.paymentMethod = paymentMethod;
   }

   public void setPaymentSchedule(PaymentSchedule paymentSchedule) {
	   this.paymentSchedule = paymentSchedule;
   }

   public void setPaymentclassification(PaymentClassification paymentclassification) {
	   this.paymentclassification = paymentclassification;
   }

   public Affiliation getAffiliation() {
	   return affiliation;
   }

   public void setAffiliation(Affiliation affiliation) {
	   this.affiliation = affiliation;
   }

   public String getName() {
	   return name;
   }

   public void setName(String name) {
	   this.name = name;
   }

   public String getAddress() {
	  return address;
   }

   public void setAddress(String address) {
	  this.address = address;
   }
   
   public void payDay(Paycheck payCheck) {
	  double grosspay=paymentclassification.calculatePay(payCheck);   
	  double deductions=affiliation.calculateDeductions(payCheck);
	  double netpay=grosspay-deductions;
	  payCheck.setGrossPay(grosspay);
	  payCheck.setDetuctions(deductions);   
      payCheck.setNetPay(netpay);
      paymentMethod.pay(payCheck);
   } 
   
   public boolean isPayDate(Date data) {
	   return paymentSchedule.isPayDate(data);
   }
   
   public Integer getEmpId() {
	   return id;
   }
   
   public Date getPayPeriodStartDate(Date date) {
	   return paymentSchedule.getPayPeriodStartDate(date);
   }
   
 }
