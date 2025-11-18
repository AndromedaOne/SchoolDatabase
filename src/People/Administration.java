package People;

import java.util.Date;

import Pay.Salary;
import People.SupportingClasses.Name;
import People.SupportingClasses.PostalAddress;
import People.SupportingClasses.Title;

public class Administration extends Person {

    private Title m_title;
    private Salary m_salary;

    public Administration(Name name, Date birthday, PostalAddress address, 
        Title title, Salary salary){
            super(name, birthday, address);
            m_title = title;
            m_salary = salary;
        }

    @Override
    public String asString() {
        throw new UnsupportedOperationException("Unimplemented method 'asString'");
    }

    @Override
    public String getClassification() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getClassification'");
    }
    
}
