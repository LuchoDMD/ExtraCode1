package clss.models;

public class Player extends Person
{
    private String nick,rol;
    private int wins; /**Victorias*/

    /** BUILDERS **/
    public Player()
    {

    }
    public Player(String lname, String fname, int age, String country, String nick, String rol)
    {
        super(lname, fname, age, country);
        this.nick = nick;
        this.rol = rol;
        this.wins = 0;
    }
    public Player(String lname, String fname, int age, String country, Player p)
    {
        super(lname, fname, age, country);
        this.nick=p.nick;
        this.rol=p.rol;
    }

    /** GETTERS & SETTERS **/

    public String getNick() {
        return this.nick;
    }
    public int getWins() {
        return this.wins;
    }
    public String getRol() {
        return this.rol;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public void setWins(int wins) {
        this.wins = wins;
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
        if (!(o instanceof Player)) {
            return false;
        }
        Player p = (Player) o;
        return p.wins == wins;
    }

    @Override
    public String toString()
    {
        return "\n\t>>"+getClass().getSimpleName()+
               "\n>Nick: "+nick+
               ".\n>Posicion: "+rol+
               ".\n\t>>Informacion Personal<<"+
               super.toString();
    }  
}
