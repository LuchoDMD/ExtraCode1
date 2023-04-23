package clss;

public class Player extends Person
{
    private String nick,rol;
    private int vict; /**Victorias*/

    /**Builders*/
    public Player()
    {

    }
    public Player(String lname, String fname, int age, String country, String nick, String rol, int vict)
    {
        super(lname, fname, age, country);
        this.nick = nick;
        this.rol = rol;
        this.vict = vict;
    }
    public Player(String lname, String fname, int age, String country, Player p)
    {
        super(lname, fname, age, country);
        this.nick=p.nick;

    }

    @Override
    public boolean focusing(int f) {
        return (f==1)? true : false;
    }

    @Override
    public boolean travelling(int t) {
        return (t==1)? true : false;
    }
}
