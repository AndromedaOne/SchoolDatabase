package People.SupportingClasses;
import java.text.DecimalFormat;

public class PostalAddress {
    private String m_apartment;
    private String m_street;
    private String m_city;
    private String m_state;
    private int m_zipcode;

    // cannot take zipcode as an int because of zipcodes with leading zero
    // for example, Shirley is 01464 and to java the leading "0" means the
    // number is in octal (base 8), not decimal (base 10). to deal with this
    // take the zipcode as a string and convert it to an int
    public PostalAddress(String apartment, String street, String city, 
    String state, String zipcode)
    {
        m_apartment = apartment;
        m_street = street;
        m_city = city;
        m_state = state;
        // java profides a static method to convert a String into an 
        // integer called parseInt.
        m_zipcode = Integer.parseInt(zipcode);
    }

    public PostalAddress(String street, String city, String state, 
        String zipcode)
    {
        this("", street, city, state, zipcode);
    }

    public String asString()
    {
        DecimalFormat format = new DecimalFormat("00000");
        String address = (m_apartment.isEmpty() ? ""
            : (m_apartment + "\n")) + m_street + "\n" + m_city + ", " + 
            m_state + "  " + format.format(m_zipcode);
        return (address);
    }
}
