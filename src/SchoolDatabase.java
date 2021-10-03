import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;

public class SchoolDatabase {
    public static void main(String[] args) throws Exception 
    {
        Vector<Person> m_people = new Vector<Person>();

        m_people.add(new Student(new Name("Joe", "Sameer", "Shmoo", 
            NameSuffix.JR), 
            new Date(new GregorianCalendar(2007, 4, 15).getTimeInMillis()),
            new PostalAddress("123 Sesame Str", "Shirley", "MA", 1464),
            Grade.Freshman));
        m_people.add(new Student(new Name("Jane", "Doe"), 
        new Date(new GregorianCalendar(2005, 4, 15).getTimeInMillis()),
        new PostalAddress("Cupboard Under the Stairs", "4 Privet Drive", 
            "Ayer", "MA", 1465),
        Grade.Junior));
        for(Person person : m_people) 
        {
            System.out.println(person.asString());
            System.out.println();
        }
    }
}
