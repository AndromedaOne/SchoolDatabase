package People;

import java.util.Date;

import Pay.Salary;
import People.SupportingClasses.Department;
import People.SupportingClasses.Name;
import People.SupportingClasses.PostalAddress;

public class Teacher extends Person {

    private Department m_department;
    private Salary m_salary;

    public Teacher (Name name,Date dob, PostalAddress addr,
    Department dept, Salary salary)
    {
        super(name,dob,addr);
        m_department=dept;
        m_salary=salary;
        
    }

    @Override
    public String asString() {
        String teacher = getPersonAsString() + "\nDepartment: " +
                m_department.toString() + "\nSalary: " +
                m_salary.asString();
        return (teacher);
    }

    @Override
    public String getClassification() {
       return(this.getClass().getSimpleName());
    }

}
