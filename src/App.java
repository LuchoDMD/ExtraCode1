import java.util.Scanner;

import clss.Team;
import clss.models.Player;
import clss.models.Supporter;
import clss.models.Trainer;

public class App 
{
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args)
    {
        Team team = new Team(); int opcion=-1; 
        String msg="\n1-Agregar Entrenador.\n2-Agregar Jugador.\n3-Agregar Soporte.\n4-Visualizar.\n5-Jugar\n0-Salir";
        System.out.println(msg);
        while(opcion!=0)
        {
            switch(opcion)
            {
                case 1:
                    agregarEntrenador(team);
                    break;
                case 2:
                    agregarJugador(team);
                    break;
                case 3:
                    agregarSoporte(team);
                    break;
                case 4:

            }
        }
    }
    public static void agregarEntrenador(Team team)
        {
            System.out.printf("Apellido: ");     String lname=sc.nextLine();
            System.out.printf("Nombre: ");       String fname=sc.nextLine();
            System.out.printf("Edad: ");         int age= sc.nextInt();
            System.out.printf("Pais: ");         String country=sc.nextLine();
            System.out.printf("Experiencia: ");  int exp= sc.nextInt();
            Trainer t=new Trainer(lname, fname, age, country, exp);
            team.addTrainer(t);
        }
        public static void agregarJugador(Team team)
        {
            System.out.printf("\nApellido: ");     String lname=sc.nextLine();
            System.out.printf("\nNombre: ");       String fname=sc.nextLine();
            System.out.printf("\nEdad: ");         int age= sc.nextInt();
            System.out.printf("\nPais: ");         String country=sc.nextLine();
            System.out.printf("\nApodo: ");        String nick=sc.nextLine();
            System.out.printf("\nRol: ");          String rol=sc.nextLine();
            Player p= new Player(lname, fname, age, country, nick, rol);
            team.addPlayer(p);
        }
        public static void agregarSoporte(Team team)
        {
            System.out.printf("\nApellido: ");      String lname=sc.nextLine();
            System.out.printf("\nNombre: ");        String fname=sc.nextLine();
            System.out.printf("\nEdad: ");          int age= sc.nextInt();
            System.out.printf("\nPais: ");          String country=sc.nextLine();
            System.out.printf("\nEspecialidad: ");  String techArea=sc.nextLine();
            Supporter s= new Supporter(lname, fname, age, country, techArea);
            team.addSupport(s);
        }
        public static void jugarPartida()
        {
            /** usar el metodo de participar en la partida de Trainer y Player **/
        }
}

/* Con un par de modificaciones ya nombradas en cada clase y algunos metodos staticos en el main
 * podrias tener un Alta Baja y Modificacion de Equipos para un torneo de fornite.
*/