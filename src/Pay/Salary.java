package Pay;

public class Salary extends Pay {

    private Double m_salary;

    public Salary(Double salary) {
        m_salary = salary;
    }
    @Override
    public Double calcYearlyPay() {
        return(m_salary);
    }

    @Override
    public String getClassification() {
        return(this.getClass().getSimpleName());
    }

    @Override
    public String asString() {
        return("Salary: " + m_salary);
    }
    
}
