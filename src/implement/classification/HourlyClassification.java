package implement.classification;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import implement.entity.TimeCard;
import implement.payday.Paycheck;
import implement.util.DateUtil; 

public class HourlyClassification implements PaymentClassification {
	private double hourlyPay;
	private ConcurrentHashMap<Date,TimeCard> cards=new ConcurrentHashMap<Date, TimeCard>();
	
	public HourlyClassification(double hourlyRate) {
		this.hourlyPay=hourlyRate;
	}
	
	public double getHourlyPay() {
	        return hourlyPay;
	}
   	
	public void addTimeCard(TimeCard timeCard) {
		cards.put(timeCard.getDate(),timeCard);
	}
	
	public TimeCard getTimeCard(Date date) {
		return cards.get(date);
	}
	
	public double calculatePay(Paycheck paycheck) {
		double totalPay=0.0;
		for(TimeCard timeCard:cards.values()) {
			if(DateUtil.IsInPayPeriod(timeCard.getDate(),paycheck.getPayPeriodStartDate(),paycheck.getPayPeriodEndDate())){
				totalPay+=calculatePayForTimeCard(timeCard);
			}
		}
		return totalPay;
	}
	
	private double calculatePayForTimeCard(TimeCard timeCard) {
		double overtimeHours = Math.max(0.0,timeCard.getHours()-8);
        double normalHours = timeCard.getHours() - overtimeHours;
        return hourlyPay*normalHours + hourlyPay*1.5*overtimeHours;

	}	
}
