package implement.schedule;

import java.util.Calendar;
import java.util.Date;

public class BiweeklySchedule implements PaymentSchedule {

	@Override
	public boolean isPayDate(Date date) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY && calendar.get(Calendar.WEEK_OF_MONTH)%2 == 0;
	}

	@Override
	public Date getPayPeriodStartDate(Date date) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,-13);
        return calendar.getTime();
	}

}
