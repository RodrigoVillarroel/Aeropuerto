package Models;

import com.sun.security.ntlm.Client;

import java.util.ArrayList;

public class Airport {
    // =========================== PROPERTIES ===================================
    private int identifying;
    private ArrayList<Hangar> hangars;
    private ArrayList<Flight> flights;
    private ArrayList<Employe> employes;
    private ArrayList<Person> clients;
    private String statusLandingTrack;
    // ========================== CONSTRUCTORS ==================================

    public Airport(int identifying) {
        setIdentifying(identifying);
        setClients(new ArrayList<Person>());
        setEmployes(new ArrayList<Employe>());
        setHangars(new ArrayList<Hangar>());
        setStatusLandingTrack("LIBRE");
        setFlights(new ArrayList<Flight>());
    }

    public Airport(int identifying, ArrayList<Hangar> hangars, ArrayList<Flight> flights,
                   ArrayList<Employe> employes, ArrayList<Person> clients, String statusLandingTrack) {
        setIdentifying(identifying);
        setClients(clients);
        setEmployes(employes);
        setHangars(hangars);
        setStatusLandingTrack(statusLandingTrack);
        setFlights(flights);
    }

    // ======================= GETTERS & SETTERS ================================
    public int getIdentifying() {
        return identifying;
    }

    public void setIdentifying(int identifying) {
        this.identifying = identifying;
    }

    public ArrayList<Hangar> getHangars() {
        return hangars;
    }

    public void setHangars(ArrayList<Hangar> hangars) {
        this.hangars = hangars;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    public ArrayList<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(ArrayList<Employe> employes) {
        this.employes = employes;
    }

    public ArrayList<Person> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Person> clients) {
        this.clients = clients;
    }

    public String getStatusLandingTrack() {
        return statusLandingTrack;
    }

    public void setStatusLandingTrack(String statusLandingTrack) {
        this.statusLandingTrack = statusLandingTrack;
    }

    // ============================= METHODS ====================================
    // ============================ OVERRIDES ===================================
    // ============================ TO STRING ===================================


    @Override
    public String toString() {
        return "\bAIRPORT[" +
                "\nIdentifying:" + getIdentifying() +
                ", \nHangars:" + getHangars() +
                ", \nFlights:" + getFlights() +
                ", \nEmployes:" + getEmployes() +
                ", \nClients:" + getClients() +
                ", \nStatusLandingTrack:'" + getStatusLandingTrack() + '\'' +
                ']';
    }
}
