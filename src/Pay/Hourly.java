package Pay;

public class Hourly extends Pay {

    private double m_hourlyPay;

    public Hourly(Double hourlyPay)
    {
        m_hourlyPay = hourlyPay;
    }

    @Override
    public Double calcYearlyPay() {
        // assume 40 hr week
        return(40 * 52 * m_hourlyPay);
    }

    @Override
    public String getClassification() {
        return(this.getClass().getSimpleName());
    }

    @Override
    public String asString() {
        return("Hourly Pay: $" + m_hourlyPay);
    }
    
}
