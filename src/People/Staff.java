package People;
import java.util.Date;

import Pay.Pay;
import People.SupportingClasses.Name;
import People.SupportingClasses.PostalAddress;

public class Staff extends Person {

    private String m_jobName;
    private Pay m_pay;
    
    public Staff(Name name, Date birthday, PostalAddress address,
        String jobName, Pay pay) {
        super(name, birthday, address);
        m_jobName = jobName;
        m_pay = pay;
    }

    @Override
    public String asString() {
        String staff = getPersonAsString() + "\nJobName: " + m_jobName +
            "\nPay: " + m_pay.asString();
        return(staff);
    }

    @Override
    public String getClassification() {
        return(this.getClass().getSimpleName());
    }
    
}
