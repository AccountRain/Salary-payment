package implement.schedule;

import java.util.Calendar;
import java.util.Date;

import implement.util.DateUtil;

public class WeeklySchedule implements PaymentSchedule {

	@Override
	public boolean isPayDate(Date date) {
		// TODO Auto-generated method stub
		return DateUtil.isWeekDay(date);
	}

	@Override
	public Date getPayPeriodStartDate(Date date) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,-6);
        return calendar.getTime();
	}

}
