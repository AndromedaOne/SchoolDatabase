package People;

import java.util.Date;

import Pay.Salary;
import People.SupportingClasses.Name;
import People.SupportingClasses.PostalAddress;
import People.SupportingClasses.Title;

public class Administrator extends Person{

    private Title m_title;

    private Salary m_salary;

    public Administrator(Name name, Date birthday, PostalAddress address, Title title, 
        Salary salary)
    {
        super(name, birthday, address);
        m_title = title;
        m_salary =salary;
    }
    @Override
    public String asString() {
        String administrator = getPersonAsString() + "\nTitle: " + 
            m_title.toString() + "\nSalary: " + m_salary.toString();
        return administrator;
    }

    @Override
    public String getClassification() {
        return(this.getClass().getSimpleName());
    }
    
}
