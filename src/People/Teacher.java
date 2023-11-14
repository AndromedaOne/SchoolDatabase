package People;

import java.util.Date;

import Pay.Salary;
import People.SupportingClasses.Classes;
import People.SupportingClasses.Department;
import People.SupportingClasses.Name;
import People.SupportingClasses.PostalAddress;

public class Teacher extends Person {
 
    private Salary m_salary;
    private Department m_department;
    private Classes m_classes;

    public Teacher(Name name, Date birthday, PostalAddress address, 
        Salary salary, Department department, Classes classes)

{

    super(name, birthday, address);
    m_salary = salary;
    m_department = department; 
    m_classes = classes; 

}
    
    @Override
    public String asString()
    {
        String teacher = getPersonAsString() + 
            "\nSalary: " + m_salary.toString() +
            "\nDepartment: " + m_department.toString()+
            "\nClasses: " + m_classes.toString();
        return(teacher);
    }

    @Override
    public String getClassification() 
    {
        return(this.getClass().getSimpleName());
    }
    
}
