package clss;

import java.util.Vector;

import clss.models.Player;
import clss.models.Supporter;
import clss.models.Trainer;

public class Team 
{
    private Trainer trainer;
    private Vector<Player> players;
    private Vector<Supporter> supports;

    public Team()
    {
        this.players= new Vector<>(4, 1);
        this.supports= new Vector<>(3, 1);
    }
    
    /** ADDING **/
    public void addTrainer(Trainer t)
    {
        this.trainer= new Trainer(t.getLname(), t.getFname(), t.getAge(), t.getCountry(), t);
    }
    public void addPlayer(Player p)
    {
        players.add(p);
    }
    public void addSupport(Supporter s)
    {
        supports.add(s);
    }
    
    /** REMOVING **/
    public void removeTrainer()
    {
        trainer= new Trainer();
    }
    public void removePlayer(String nick)
    {
        for(Player p : players)
        {
            if(p.getNick()==nick)
            {
                players.remove(players.indexOf(p));
            }
        }
    }
    public void removeSupporter(String lname, String fname, String techArea)
    {
        for(Supporter s : supports)
        {
            if((s.getTechArea()==techArea)&&(s.getLname()==lname)&&(s.getFname()==fname))
            {
                supports.remove(supports.indexOf(s));
            }
        }
    }
    /** SHOWING **/
    public String showTrainer()
    {
        return ">>"+trainer.getClass().getSimpleName()+": "+trainer.getLname()+" "+trainer.getFname()+".";
    }
    public String showPlayers()
    {
        String msg=players.get(0).getClass().getSimpleName()+"s: ";
        for (Player p : players) 
        {
            msg=msg+"\n "+p.getNick()+" - "+p.getAge()+" años - "+p.getCountry();
        }
        return msg;
    }
    public String showTeamFull()
    {
        String msg="";
        msg=msg+trainer.toString();
        for(Player p : players)
        {
            msg+="\n"+p.toString();
        }
        for(Supporter s : supports)
        {
            msg+="\n"+s.toString();
        }
        return msg;
    }
    //Solo existen para mostrar la informacion acotada. Excepto el ultimo.

    /** Jugar Partida: Si ganan, las victorias de jugadores incrementa en uno en su defecto, mostrar mensaje de  
     * elminados de la partida **/
    

}

/** Clase envoltorio de las Player(4) Trainer(1) Supporter(3), por ahora se diagrama asi
 *  posiblemente en un futuro haya al menos 2 jugadores suplentes y un entrenador suplente 
 *  Extra: Ya que hablamos de un equipo que participa de un torneo podriamos almacenar en este
 *  el nombre del equipo. **/   
