package People;

public class Teacher extends Person {

    @Override
    public String asString() {
       String teacher = getPersonAsString() ;
       return(teacher);
    }

    @Override
    public String getClassification() {
        return(this.getClass().getSimpleName());
    }
    
}
