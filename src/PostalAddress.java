import java.text.DecimalFormat;

public class PostalAddress {
    private String m_apartment;
    private String m_street;
    private String m_city;
    private String m_state;
    private int m_zipcode;

    public PostalAddress(String apartment, String street, String city, 
    String state, int zipcode)
    {
        m_apartment = apartment;
        m_street = street;
        m_city = city;
        m_state = state;
        m_zipcode = zipcode;
    }

    public PostalAddress(String street, String city, String state, int zipcode)
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
