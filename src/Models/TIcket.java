package Models;

public class TIcket {
    // =========================== PROPERTIES ===================================
        private int identifier;
        private Flight flight;
        private Seat seat;
    // ========================== CONSTRUCTORS ==================================

    public TIcket(int identifier, Flight flight, Seat seat) {
        setIdentifier(identifier);
        setFlight(flight);
        setSeat(seat);
    }
// ======================= GETTERS & SETTERS ================================

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    // ============================= METHODS ====================================
    // ============================ OVERRIDES ===================================
    // ============================ TO STRING ===================================


    @Override
    public String toString() {
        return "\nTICKET[" +
                "\nIdentifier:" + getIdentifier() +
                ", \nFlight:" + getFlight() +
                ", \nSeat:" + getSeat() +
                ']';
    }
}
