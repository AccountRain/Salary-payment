package implement.payday;

import java.util.Date;
import java.util.Hashtable;

public class Paycheck {
   private Date payDate;
   private final Date payPeriodStartDate;
   private double grossPay;
   private Hashtable<String,String> fields = new Hashtable<String, String>();
   private double detuctions;
   private double netPay;
   
   public Paycheck(Date payPeriodStartDate,Date payDate){
       this.payDate = payDate;
       this.payPeriodStartDate = payPeriodStartDate;
   }
   public double getGrossPay() {
       return grossPay;
   }
   public void setGrossPay(double grossPay) {
       this.grossPay = grossPay;
   }
   public double getNetPay() {
       return netPay;
   }
   public void setNetPay(double netPay) {
       this.netPay = netPay;
   }

   public Date getPayDate() {
       return payDate;
   }
   public void setPayDate(Date payDate) {
       this.payDate = payDate;
   }

   public Date getPayPeriodStartDate() {
       return payPeriodStartDate;
   }
   public Date getPayPeriodEndDate() {
       return payDate;
   }
   
   public void setFields(String fieldName,String value) {
       fields.put(fieldName,value);
   }
   public Hashtable<String, String> getFields() {
       return fields;
   }

   public double getDetuctions() {
       return detuctions;
   }

   public void setDetuctions(double detuctions) {
       this.detuctions = detuctions;
   }
}
