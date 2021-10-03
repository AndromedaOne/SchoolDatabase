import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;

import Pay.Hourly;

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
        new Date(new GregorianCalendar(2005, 11, 30).getTimeInMillis()),
        new PostalAddress("Cupboard Under the Stairs", "4 Privet Drive", 
            "Ayer", "MA", 1465),
        Grade.Junior));
        m_people.add(new Staff(new Name("Xiao", "Ronald", "Whynot", 
            NameSuffix.III), 
            new Date(new GregorianCalendar(1972, 10, 21).getTimeInMillis()),
            new PostalAddress("221b Baker St", "Ayer", "MA", 1465),
            "Custodian", new Hourly(41.35)));
        for(Person person : m_people) 
        {
            System.out.println(person.asString());
            System.out.println();
        }
    }
}
