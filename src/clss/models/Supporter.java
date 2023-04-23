package clss.models;

public class Supporter extends Person 
{
    private String techArea; /** Area de especializacion **/    

    /** BUILDERS **/
    public Supporter() 
    {

    }
    public Supporter(String lname, String fname, int age, String country, String techArea) 
    {
        super(lname, fname, age, country);
        this.techArea = techArea;
    }
    public Supporter(String lname, String fname, int age, String country, Supporter s)
    {
        super(lname, fname, age, country);
        this.techArea= s.techArea;
    }

    /** GETTERS & SETTERS **/
    public String getTechArea() {
        return this.techArea;
    }
    public void setTechArea(String techArea) {
        this.techArea = techArea;
    }

    /** OTHERS **/
    @Override
    public boolean focusing(int f) {
        return (f==1)? true : false;
    }
    
    @Override
    public boolean travelling(int t) {
        return (t==1)? true : false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Supporter)) {
            return false;
        }
        Supporter s = (Supporter) o;
        return age == s.age;
    }

    @Override
    public String toString()
    {
        return "\n\t>>"+getClass().getSimpleName()+
               super.toString()+
               "\n>Especializacion: "+techArea+".";
    }
}
 /** Posiblemente el Soporte tecnico tenga mas metodos y mas areas de especializacion**/