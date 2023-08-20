package Models;

public class Seat {
    // =========================== PROPERTIES ===================================

    private int number;
    private static int contNumber = 1;
    private String klass;
    private String status;
    private Person person;


    // ========================== CONSTRUCTORS ==================================

    public Seat(String klass) {
        setNumber();
        setKlass(klass);
        setStatus("LIBRE");
    }
    public Seat() {}

    // ======================= GETTERS & SETTERS ================================
    public int getNumber() {return number;}
    public void setNumber() {this.number = getContNumber(); contNumber++;}
    public static int getContNumber() {return contNumber;}
    public String getKlass() {return klass;}
    public void setKlass(String klass) {this.klass = klass;}
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
        return "Seat{" +
                "number=" + getNumber() +
                ", klass='" + getKlass() + '\'' +
                ", status='" + getStatus() + '\'' +
                ", person='" + getPerson() + '\'' +
                '}';
    }
}


