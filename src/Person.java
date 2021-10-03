import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Person {
    
    private Name m_name;
    private Date m_birthDay;
    private PostalAddress m_address;

    public Person(Name name, Date birthday, PostalAddress address)
    {
        m_name = name;
        m_birthDay = birthday;
        m_address = address;
    }

    public abstract String asString();

    public abstract String getClassification();

    protected String getPersonAsString()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/y");
        String person = "Name: " + m_name.toString() + "\nClassification: " +
            getClassification() + "\nBirthday: "
            + dateFormat.format(m_birthDay) + "\nAge: " + getAge() + 
            "\nAddress: " + m_address.asString();
        return(person);
    }

    public int getAge()
    {
        Calendar bDay = Calendar.getInstance();
        bDay.setTime(m_birthDay);
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
