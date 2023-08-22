package Models;

import java.util.ArrayList;

public class Hangar {
    // =========================== PROPERTIES ===================================
    private int identifying;
    private ArrayList<Airplane> airplanes;

    // ========================== CONSTRUCTORS ==================================

    public Hangar(int identifying, ArrayList<Airplane> airplanes) {
        setAirplanes(airplanes);
        setIdentifying(identifying);
    }

    public Hangar(int identifying) {
        this.identifying = identifying;
        setAirplanes(new ArrayList<Airplane>());
    }

    public Hangar() {
    }
    // ======================= GETTERS & SETTERS ================================

    public int getIdentifying() {
        return identifying;
    }

    public void setIdentifying(int identifying) {
        this.identifying = identifying;
    }

    public ArrayList<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(ArrayList<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    // ============================= METHODS ====================================
    // ============================ OVERRIDES ===================================
    // ============================ TO STRING ===================================


    @Override
    public String toString() {
        return "\nHANGAR[" +
                "\nIdentifying:" + getIdentifying() +
                ", \nAirplanes:" + getAirplanes() +
                ']';
    }
}
