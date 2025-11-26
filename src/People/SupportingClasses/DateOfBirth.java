package People.SupportingClasses;

import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateOfBirth {
    private Date m_dob;

    public DateOfBirth(Month month, int day, int year) {
        m_dob = new Date(new GregorianCalendar(year, month.ordinal() - 1, 
            day).getTimeInMillis());
    }

    public int getAge()
    {
        Calendar bDay = Calendar.getInstance();
        bDay.setTime(m_dob);
        Calendar now = Calendar.getInstance();
        int diff = now.get(Calendar.YEAR) - bDay.get(Calendar.YEAR);
        if((bDay.get(Calendar.MONTH) > now.get(Calendar.MONTH)) || 
            ((now.get(Calendar.MONTH) == bDay.get(Calendar.MONTH)) &&
            (bDay.get(Calendar.DATE) > now.get(Calendar.DATE))))
        {
            diff--;
        }
        return(diff);
    }
}