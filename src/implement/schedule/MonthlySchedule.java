package implement.schedule;

import java.util.Calendar;
import java.util.Date;

import implement.util.DateUtil;

public class MonthlySchedule implements PaymentSchedule {

	@Override
	public boolean isPayDate(Date date) {
		// TODO Auto-generated method stub
		return DateUtil.isMonthDay(date);
	}

	@Override
	public Date getPayPeriodStartDate(Date date) {
		// TODO Auto-generated method stub
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int month = calendar.get(Calendar.MONTH);
        while (calendar.get(Calendar.MONTH) == month){
            calendar.add(Calendar.DATE,-1);
        }
        return calendar.getTime();
	}

}
