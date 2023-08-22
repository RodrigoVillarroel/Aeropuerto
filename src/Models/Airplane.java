package Models;

import java.util.ArrayList;

public class Airplane {
    // =========================== PROPERTIES ===================================
    private int identifying;
    //private static int identifyingCont = 1;
    private String aeroline;
    private int capacity;
    private String status;
    private ArrayList<Seat> seats;

    // ========================== CONSTRUCTORS ==================================

    public Airplane(int identifying, String aeroline, int capacity, String status) {
        setCapacity(capacity);
        setAeroline(aeroline);
        setIdentifying(identifying);
        setStatus(status);
        setSeats(new ArrayList<Seat>());
    }

    public Airplane(int identifying, String aeroline, int capacity, String status, ArrayList<Seat> seats) {
        setCapacity(capacity);
        setAeroline(aeroline);
        setIdentifying(identifying);
        setStatus(status);
        setSeats(seats);
    }
    public Airplane() {
    }

    // ======================= GETTERS & SETTERS ================================

    public int getIdentifying() {
        return identifying;
    }

    public void setIdentifying(int identifying) {
        this.identifying = identifying;
    }

    public String getAeroline() {
        return aeroline;
    }

    public void setAeroline(String aeroline) {
        this.aeroline = aeroline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    // ============================= METHODS ====================================
    // ============================ OVERRIDES ===================================
    // ============================ TO STRING ===================================


    @Override
    public String toString() {
        return "\nAIRPLANE[" +
                "\nIdentifying:" + getIdentifying() +
                ", \nAeroline:'" + getAeroline() + '\'' +
                ", \nCapacity:" + getCapacity() +
                ", \nStatus:'" + getStatus() + '\'' +
                ", \nSeats:" + getSeats() +
                ']';
    }
}
