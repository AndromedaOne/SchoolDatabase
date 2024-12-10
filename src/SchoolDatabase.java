import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;

import Pay.Hourly;
import Pay.Salary;
import People.Administrator;
import People.Person;
import People.Staff;
import People.Student;
import People.SupportingClasses.Grade;
import People.SupportingClasses.Name;
import People.SupportingClasses.NameSuffix;
import People.SupportingClasses.PostalAddress;
import People.SupportingClasses.StaffPosition;
import People.SupportingClasses.Title;

public class SchoolDatabase {
    public static void main(String[] args) throws Exception 
    {
        Vector<Person> m_people = new Vector<Person>();

        Name newName = new Name("Joe", "Sameer", "Shmoo", NameSuffix.JR);
        long greg  = new GregorianCalendar(2007, 4, 15).getTimeInMillis();
        Date newDate = new Date(greg);
        PostalAddress newAdd = new PostalAddress("123 Sesame Str", 
                "Shirley", "MA", "01464");
        Student newStu = new Student(newName, newDate, newAdd, Grade.Freshman);
        m_people.add(newStu);

        m_people.add(new Student(new Name("Jane", "Doe"),
                new Date(new GregorianCalendar(2005, 11, 30).getTimeInMillis()),
                new PostalAddress("Cupboard Under the Stairs", 
                        "4 Privet Drive",
                        "Ayer", "MA", "01432"),
                Grade.Junior));
        m_people.add(new Staff(new Name("Xiao", "Ronald", "Whynot",
                NameSuffix.III),
                new Date(new GregorianCalendar(1972, 10, 21).getTimeInMillis()),
                new PostalAddress("221b Baker St", "Ayer", "MA", 
                        "01465"), StaffPosition.FoodService, 
                        new Hourly(41.35)));
        m_people.add(new Student(new Name("Alicia", "Augello", "Keys"),
                new Date(new GregorianCalendar(2004, 6, 12).getTimeInMillis()),
                new PostalAddress("1313 Mockingbird Lane", "Shirley",
                        "MA",
                        "01464"), Grade.Senior));
        m_people.add(new Student(new Name("Bartholomew", "Jojo", "Simpson"),
                new Date(new GregorianCalendar(2005, 8, 2).getTimeInMillis()),
                new PostalAddress("742 Evergreen Terrace", "Ayer", 
                        "MA", "01432"), Grade.Junior));
        m_people.add(new Staff(new Name("Alexander", "Julio", "Doe"),
                new Date(new GregorianCalendar(1956, 1, 29).getTimeInMillis()),
                new PostalAddress("301 Cobblestone Way", "Bedrock", "Jurassic", 
                        "70777"), StaffPosition.Maintenance, new Hourly(52.38)));
        m_people.add(new Administrator(new Name("Justin","Smith"), 
                new Date(new GregorianCalendar(1983, 8, 11).getTimeInMillis()),
                new PostalAddress("19 mountain road", "Ayer", "MA", "01432"),
                Title.VicePriceipal, new Salary(100000.0)));
        m_people.sort(new Person.SortByName());
        // dump everyone
        System.out.println("--- Everyone in databasae...\n");
        for(Person person : m_people) 
        {
            System.out.println(person.asString());
            System.out.println();
        }
        System.out.println("--- Done with everyone...\n");

        System.out.println("\n--- Students...\n\n");
        // dump just students
        for(Person student : m_people)
        {
            if(student.getClassification().equals("Student"))
            {
                System.out.println(student.asString());
                System.out.println();
            }
        }
        System.out.println("--- Done with students...\n");
        // dump staff
        System.out.println("\n--- Staff...");
        for(Person staff : m_people)
        {
            if(staff.getClassification().equals("Staff"))
            {
                System.out.println(staff.asString());
                System.out.println();
            }
        }
        System.out.println("--- Done with staff...\n");
        // dump Administrator
        for(Person admin : m_people) {
                if(admin.getClassification().equals("Administrator")){
                    System.out.println(admin.asString());
                    System.out.println();
                }
        }
        System.out.println("--- Done with administrators...\n");
    }
}
