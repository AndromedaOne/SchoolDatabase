package People;

import java.util.Date;
import java.util.List;

import People.SupportingClasses.Classes;
import People.SupportingClasses.Department;
import People.SupportingClasses.Name;
import People.SupportingClasses.PostalAddress;

public class Teacher extends Person {

    private Department m_department;
    private List<Classes> m_classesTaught;

    public Teacher (Name name,Date dob, PostalAddress addr,
    Department dept, List<Classes> classes )
    {
        super(name,dob,addr);
        m_department=dept;
        m_classesTaught=classes;
        
    }

    @Override
    public String asString() {
        String teacher = getPersonAsString() + "\nDepartment: " +
                m_department.toString() + "\nclassesTaught: " +
                m_classesTaught.toString();
        return (teacher);
    }

    @Override
    public String getClassification() {
       return(this.getClass().getSimpleName());
    }

}
