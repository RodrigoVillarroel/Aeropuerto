package Models;

public class Seat {
    // =========================== PROPERTIES ===================================

    private int number;
    private static int contNumber = 1;
    private SeatClass seatClass;
    private String status;
    private Person person;


    // ========================== CONSTRUCTORS ==================================

    public Seat(SeatClass seatClass) {
        setNumber();
        setKlass(seatClass);
        setStatus("LIBRE");
    }
    public Seat() {}

    // ======================= GETTERS & SETTERS ================================
    public int getNumber() {return number;}
    public void setNumber() {this.number = getContNumber(); contNumber++;}
    public static int getContNumber() {return contNumber;}
    public SeatClass getKlass() {return seatClass;}
    public void setKlass(SeatClass seatClass) {this.seatClass = seatClass;}
    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}
    public Person getPerson() {return person;}
    public void setPerson(Person person) {this.person = person;}

    // ============================= METHODS ====================================
    public void addPerson(Person person){
        if(getStatus()=="LIBRE"){
            setPerson(person);
            setStatus("OCUPADO");
        }
    }
    // ============================ OVERRIDES ===================================
    // ============================ TO STRING ===================================


    @Override
    public String toString() {
        return "\nSEAT[" +
                "\nNumber:" + getNumber() +
                ", \nClass:'" + getKlass() + '\'' +
                ", \nStatus:'" + getStatus() + '\'' +
                ", \nPerson:'" + getPerson() + '\'' +
                ']';
    }
}


