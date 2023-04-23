package clss;

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
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    /** OTHERS **/
    public abstract boolean focusing(int e);
    public abstract boolean travelling(int e);


}
