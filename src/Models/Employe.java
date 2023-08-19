package Models;

public class Employe extends Person {

    private String workStation;
    private String identifierNumber;

    public Employe(String workStation, String identifierNumber,int dni, String fullName, String address) {
        super(dni,fullName,address);
        this.workStation = workStation;
        this.identifierNumber = identifierNumber;

    }



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


}