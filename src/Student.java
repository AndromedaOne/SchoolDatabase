import java.util.Date;

public class Student extends Person {

    private Grade m_grade;

    public Student(Name name, Date birthday, PostalAddress address,
        Grade grade) 
    {
        super(name, birthday, address);
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
