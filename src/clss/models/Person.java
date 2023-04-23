package clss.models;

public abstract class Person
{
    /** Podria tener un ID */
    protected String lname, fname;
    protected int age;
    protected String country;

    /** BUILDERS **/
    public Person()
    {

    }
    public Person(String lname, String fname, int age, String country)
    {
        this.lname=lname;
        this.fname=fname;
        this.age=age;
        this.country=country;
    }

    /** GETTERS & SETTERS **/
    public String getLname() {
        return lname;
    }
    public String getFname() {
        return fname;
    }
    public int getAge() {
        return age;
    }
    public String getCountry() {
        return country;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    /** OTHERS **/
    public abstract boolean focusing(int e);
    public abstract boolean travelling(int e);



    @Override
    public String toString()
    {
        return "\n>Apellido/Nombre: "+lname+" "+fname+
               ".\n>Edad: "+age+
               ".\n>Nacionalidad: "+country+".";
    }


}
