package People;
import java.util.Date;
import Pay.Pay;
import People.SupportingClasses.Name;
import People.SupportingClasses.PostalAddress;
import People.SupportingClasses.StaffPosition;

public class Staff extends Person {

    private StaffPosition m_position;
    private Pay m_pay;
    
    public Staff(Name name, Date birthday, PostalAddress address,
        StaffPosition position, Pay pay) {
        super(name, birthday, address);
        m_position = position;
        m_pay = pay;
    }

    @Override
    public String asString() {
        String staff = getPersonAsString() + "\nPosition: " + m_position +
            "\nPay: " + m_pay.asString();
        return(staff);
    }

    @Override
    public String getClassification() {
        return(this.getClass().getSimpleName());
    }
    
}
