import Models.*;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //********** AEROLINEAS **************************************************************************

        String[] aerolines = {"Singapore Airlines","Qatar Airways","All Nippon Airways","Emirates,Japan Airlines",
                                "Turkish Airlines","Air France","Cathay Pacific"};
        //********** PRUEBAS *****************************************************************************

        //-------- INSTANCIAS DE PERSONAS ----------------------------------------------------------------
        Person p1 = new Person(39809917,"Rodrigo Villarroel","F. Juan Cetz 1951");
        Person p2 = new Person(40254891,"Marcos Avila","Luro 7686");
        Person p3 = new Person(48479865,"Alejandra Perez","Libertad 5959");
        Person p4 = new Person(84151355,"Juan Gomez","Constitucion 10158");
        Person p5 = new Person(35498154,"Sofia Lopez","J.B.Justo 3549");
        Person p6 = new Person(84965323,"Lucas Rodriguez","Edison 5138");
        Person p7 = new Person(15648651,"Facundo Crespo","España 4451");

        System.out.println("p1 = " + p1+ "\n======================================");
        System.out.println("p2 = " + p2+ "\n======================================");
        System.out.println("p3 = " + p3+ "\n======================================");
        System.out.println("p4 = " + p4+ "\n======================================");
        System.out.println("p5 = " + p5+ "\n======================================");
        System.out.println("p6 = " + p6+ "\n======================================");
        System.out.println("p7 = " + p7+ "\n======================================");

        //-------- INSTANCIAS DE EMPLEADOS ---------------------------------------------------------------
        Employe e1 = new Employe("PILOTO","A-P_1",42549916,"Nicolas Roldan","Colon 1001");
        Employe e2 = new Employe("COPILOTO","A-C_13",56168913,"Pedro Sosa","Francia 9823");
        Employe e3 = new Employe("AZAFATA","A-Z_14",31589495,"Lucia Ulloa","Salta 154");
        Employe e4 = new Employe("AZAFATA","A-Z_15",42849815,"Natalia Jerez","Belgrano 6258");
        Employe e5 = new Employe("SEGURIDAD","A-S_12",391956156,"Oscar Risso","Balcarse 8462");
        Employe e6 = new Employe(p6,"PILOTO","A-P_50");

        System.out.println("e1 = " + e1 + "\n======================================");
        System.out.println("e2 = " + e2 + "\n======================================");
        System.out.println("e3 = " + e3 + "\n======================================");
        System.out.println("e4 = " + e4 + "\n======================================");
        System.out.println("e5 = " + e5 + "\n======================================");
        System.out.println("e6 = " + e6 + "\n======================================");

        //-------- INSTANCIAS DE CLASES DE ASIENTOS ------------------------------------------------------------------------------------------
        SeatClass primeraClase = new SeatClass("Primera Clase",10000);
        SeatClass ejecutiva = new SeatClass(" Ejecutiva",5000);
        SeatClass economicaPremium = new SeatClass(" EconomicaPremium",4000);
        SeatClass economica = new SeatClass(" Economica",3000);

        /*ArrayList<SeatClass> seatClasses = new ArrayList<SeatClass>();
        seatClasses.add(primeraClase);
        seatClasses.add(ejecutiva);
        seatClasses.add(economicaPremium);
        seatClasses.add(economica);*/

        //-------- INSTANCIAS DE ASIENTOS -------------------------------------------------------------------------------
        Seat s1 = new Seat(primeraClase);
        Seat s2 = new Seat(primeraClase);
        Seat s3 = new Seat(primeraClase);
        Seat s4 = new Seat(primeraClase);
        Seat s5 = new Seat(ejecutiva);
        Seat s6 = new Seat(ejecutiva);
        Seat s7 = new Seat(ejecutiva);
        Seat s8 = new Seat(ejecutiva);
        Seat s9 = new Seat(ejecutiva);
        Seat s10 = new Seat(ejecutiva);
        Seat s11 = new Seat(economicaPremium);
        Seat s12 = new Seat(economicaPremium);
        Seat s13 = new Seat(economica);
        Seat s14 = new Seat(economica);

        //-------- AGREGAR PASAJEROS A ASIENTOS ------------------------------------------------------------------------
        s1.addPerson(p1);
        s2.addPerson(p2);
        s5.addPerson(p3);
        s6.addPerson(p4);
        s11.addPerson(p5);
        s14.addPerson(p7);

        //-------- INSTANCIAS DE AVIONES --------------------------------------------------------------------------------
        Airplane a1 = new Airplane(1,aerolines[2],250,"Disponible");
        Airplane a2 = new Airplane(2,aerolines[1],350,"Disponible");


        System.out.println("a1 = " + a1 + "\n======================================");
        System.out.println("a2 = " + a2 + "\n======================================");

        //---------- INSTANCIAS DE VUELOS ------------------------------------------------------------------------------
        Flight f1 = new Flight(1,"Mar del Plata, BsAs, Argentina","Rio de Janeiro, Brasil","Demorado",a1,new Date());
        Flight f2 = new Flight(2,"Madrid, España","Washingtong, USA","Demorado",a2,new Date());

        System.out.println("f1 = " + f1 + "\n======================================");
        System.out.println("f2 = " + f2 + "\n======================================");

        //---------- AGREGADO DE FLOTA AL VUELO ------------------------------------------------------------------------
        f1.getCrew().add(e1);
        f1.getCrew().add(e2);
        f1.getCrew().add(e3);
        f1.getCrew().add(e4);
        f1.getCrew().add(e5);

        System.out.println("f1 = " + f1+ "\n======================================");


        //--------- INSTANCIAS DE BOLETOS DE AVION ---------------------------------------------------------------------
        TIcket t1 = new TIcket(1,f1,s1);
        TIcket t2 = new TIcket(2,f1,s2);
        TIcket t3 = new TIcket(3,f1,s5);
        TIcket t4 = new TIcket(4,f1,s6);
        TIcket t5 = new TIcket(5,f1,s11);
        TIcket t6 = new TIcket(6,f1,s14);

        System.out.println("t1 = " + t1+ "\n======================================");
        System.out.println("t2 = " + t2+ "\n======================================");
        System.out.println("t3 = " + t3+ "\n======================================");
        System.out.println("t4 = " + t4+ "\n======================================");
        System.out.println("t5 = " + t5+ "\n======================================");
        System.out.println("t6 = " + t6+ "\n======================================");

        //---------- INSTANCIAS DE HANGARES ----------------------------------------------------------------------------
        Hangar h1 = new Hangar(1);
        h1.getAirplanes().add(a1);
        h1.getAirplanes().add(a2);

        System.out.println("h1 = " + h1 +"\n======================================");

        //---------- INSTANCIAS DE AEROPUERTOS -------------------------------------------------------------------------
        Airport airport = new Airport(1);

        System.out.println("airport  = " + airport +"\n======================================");

        
    }
    
}
