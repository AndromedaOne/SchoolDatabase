package People;

import java.util.Date;
import java.util.List;

import People.SupportingClasses.Classes;
import People.SupportingClasses.Department;
import People.SupportingClasses.Name;
import People.SupportingClasses.PostalAddress;

public class Teacher extends Person {
    public Teacher (Name name,Date dob, PostalAddress addr,
    Department dept, List<Classes> classes )
    {
        super(name,dob,addr);
        m_department=dept;
        m_classesTaught=classes;
        
    }

    @Override
    public String asString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'asString'");
    }

    @Override
    public String getClassification() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getClassification'");
    }

    private Department m_department;
    private List<Classes> m_classesTaught;
}
