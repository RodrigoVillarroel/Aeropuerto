package Models;

public class Employe extends Person {
    // =========================== PROPERTIES ===================================
    private String workStation;
    private String identifierNumber;

    // ========================== CONSTRUCTORS ==================================
    public Employe(String workStation, String identifierNumber,int dni, String fullName, String address) {
        super(dni,fullName,address);
        setWorkStation(workStation);
        setIdentifierNumber(identifierNumber);

    }

    public Employe(Person person, String workStation, String identifierNumber) {
        super(person.getDni(), person.getFullName(), person.getAddress());
        setWorkStation(workStation);
        setIdentifierNumber(identifierNumber);
    }
    // ======================= GETTERS & SETTERS ================================

    public String getWorkStation() {
        return workStation;
    }

    public void setWorkStation(String workStation) {
        this.workStation = workStation;
    }

    public String getIdentifierNumber() {
        return identifierNumber;
    }

    public void setIdentifierNumber(String identifierNumber) {
        this.identifierNumber = identifierNumber;
    }

    // ============================= METHODS ====================================
    // ============================ OVERRIDES ===================================
    // ============================ TO STRING ===================================
    @Override
    public String toString() {
        return "\nEMPLOYE[" +
                " \nWorkStation:'" + getWorkStation() + '\'' +
                ", \nIdentifierNumber:'" + getIdentifierNumber().concat(super.toString()) + '\'' +
                ']';
    }
}