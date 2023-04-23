package clss;

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

}
