package clss.models;

public class Trainer extends Person
{
    private int exp; /** Años de experiencia*/

    /** BUILDERS **/
    public Trainer()
    {

    }
    public Trainer(String lname, String fname, int age, String country, int exp)
    {
        super(lname, fname, age, country);
        this.exp = exp;
    }
    public Trainer(String lname, String fname, int age, String country, Trainer t)
    {
        super(lname, fname, age, country);
        this.age = t.age;
    }

    /** GETTERS & SETTERS **/
    public int getExp() 
    {
        return this.exp;
    }
    public void setExp(int exp) 
    {
        this.exp = exp;
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
        if (!(o instanceof Trainer)) {
            return false;
        }
        Trainer trainer = (Trainer) o;
        return exp == trainer.exp;
    }
    
    @Override
    public String toString()
    {
        return  "\n\t>>"+getClass().getSimpleName()+
                super.toString()+
                "\nExperiencia: "+exp+" años.";
    }
}

/** DETERMINAR SI DAR INDICACIONES ES UNA VARIABLE O UN METODO u usar ambos**/