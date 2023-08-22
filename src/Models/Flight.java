package Models;

import java.util.ArrayList;
import java.util.Date;

public class Flight {
    // =========================== PROPERTIES ===================================
    private int identifier;
    private String origin;
    private String destination;
    private String status;
    private Airplane airplane;
    private Date dateAndTime;
    private ArrayList<Employe> crew;
    // ========================== CONSTRUCTORS ==================================
    public Flight(int identifier, String origin, String destination, String status, Airplane airplane, Date dateAndTime) {
        setIdentifier(identifier);
        setOrigin(origin);
        setDestination(destination);
        setStatus(status);
        setAirplane(airplane);
        setDateAndTime(dateAndTime);
        setCrew(new ArrayList<Employe>());
    }

    public Flight() {
    }

    // ======================= GETTERS & SETTERS ================================
    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public ArrayList<Employe> getCrew() {return crew;}

    public void setCrew(ArrayList<Employe> crew) {this.crew = crew;}
// ============================= METHODS ====================================
    // ============================ OVERRIDES ===================================
    // ============================ TO STRING ===================================

    @Override
    public String toString() {
        return "\nFLIGHT[" +
                "\nIdentifier:" + getIdentifier() +
                ", \nOrigin:'" + getOrigin() + '\'' +
                ", \nDestination:'" + getDestination() + '\'' +
                ", \nStatus:'" + getStatus() + '\'' +
                ", \nAirplane:" + getAirplane() +
                ", \nCrew:" + getCrew() +
                ", \nDateAndTime:" + getDateAndTime() +
                ']';
    }
}
