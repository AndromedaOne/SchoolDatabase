package People.SupportingClasses;
public class Name {
    
    private String m_first;
    private String m_middle;
    private String m_last;
    private NameSuffix m_suffix;

    public Name(String first, String middle, String last, NameSuffix suffix)
    {
        m_first = first;
        m_middle = middle;
        m_last = last;
        m_suffix = suffix;
    }

    public Name(String first, String middle, String last)
    {
        this(first, middle, last, NameSuffix.None);
    }

    public Name(String first, String last)
    {
        this(first, "", last, NameSuffix.None);
    }

    public String getFirstName()
    {
        return(m_first);
    }

    public String getMiddleName()
    {
        return(m_middle);
    }

    public String getLastName()
    {
        return(m_last);
    }

    public NameSuffix getNameSuffix()
    {
        return(m_suffix);
    }

    public String toString()
    {
        String name = m_first + " " + 
        (m_middle.isEmpty() ? "" : (m_middle + " ")) + m_last +
        (m_suffix == NameSuffix.None ? "" : (", " + m_suffix.name()));
        return(name);
    }
}
