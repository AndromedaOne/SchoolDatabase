package People;
import java.util.Date;

import People.SupportingClasses.DateOfBirth;
import People.SupportingClasses.Grade;
import People.SupportingClasses.Name;
import People.SupportingClasses.PostalAddress;

public class Student extends Person {

    private Grade m_grade;

    public Student(Name name, DateOfBirth dob, PostalAddress address,
        Grade grade) 
    {
        super(name, dob, address);
        m_grade = grade;    
    }
    
    public String asString()
    {
        String student = getPersonAsString() + "\nGrade: " + 
            m_grade.toString();
        return(student);
    }

    public String getClassification()
    {
        return(this.getClass().getSimpleName());
    }
}
