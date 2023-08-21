import Models.*;

import java.util.ArrayList;
import java.util.Date;

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
        Person p1 = new Person(39809917,"Rodrigo Villarroel","F. Juan Cetz 1951");
        Person p2 = new Person(40254891,"Marcos Avila","Luro 7686");
        System.out.println("p1 = " + p1+ "\n======================================");
        System.out.println("p2 = " + p2+ "\n======================================");

        Employe e = new Employe("PILOTO","AS12",42549916,"Nico Roldan","Colon 1001");
        System.out.println("e = " + e+ "\n======================================");

        SeatClass primeraClase = new SeatClass("Primera Clase",10000);
        SeatClass turista = new SeatClass(" Turista",5000);

        ArrayList<SeatClass> seatClasses = new ArrayList<>();
        seatClasses.add(primeraClase);
        seatClasses.add(turista);

        Seat s = new Seat(primeraClase);
        //s.addPerson(p1);
        System.out.println("s = " + s+ "\n======================================");



        Airplane a = new Airplane(1,"FlyEmirates",250,"Disponible");
        System.out.println("a = " + a+ "\n======================================");

        a.getCrew().add(e);
        a.getSeats().add(s);

        System.out.println("a = " + a+ "\n======================================");

        s.addPerson(p1);

        System.out.println("a = " + a+ "\n======================================");

        s.addPerson(p2);

        System.out.println("a = " + a+ "\n======================================");

        Flight f1 = new Flight(1,"Mar del Plata, BsAs, Argentina","Rio de Janeiro,Brasil","Demorado",a,new Date());
        System.out.println("f1 = " + f1);
        
        TIcket t1 = new TIcket(1,f1,s);

        System.out.println("t1 = " + t1+ "\n======================================");

        System.out.println("\n======================================");
        
    }
    
}
