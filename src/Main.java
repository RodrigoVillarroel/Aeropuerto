import Models.Airplane;
import Models.Employe;
import Models.Person;
import Models.Seat;

public class Main {

    // =========================== PROPERTIES ===================================
    /*enum workStation {
        TécnicoAdministrativo,
        Despachador de vuelos.
        Agente de Servicios Aeropuertarios.
        Técnico de Operaciones Aeropuertarias.
        Azafata, auxiliar de cabina o tripulante de cabina.
                Piloto.    }*/
    public static void main(String[] args) {
        Person p1 = new Person(123,"Rodrigo Villarroel","sadas 1223");
        Person p2 = new Person(675,"Marcos Avila","tutyut 76876");
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        Employe e = new Employe("PILOTO","AS12",15486,"Nico Roldan","Colon 1001");
        System.out.println("e = " + e);

        Seat s = new Seat("Premium");
        //s.addPerson(p);
        System.out.println("s = " + s);



        Airplane a = new Airplane(1,"FlyEmirates",250,"Disponible");
        System.out.println("a = " + a);

        a.getCrew().add(e);
        a.getSeats().add(s);

        System.out.println("a = " + a);

        s.addPerson(p1);

        System.out.println("a = " + a);

        s.addPerson(p2);

        System.out.println("a = " + a);
    }
    
}
