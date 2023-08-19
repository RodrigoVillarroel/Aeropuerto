package Models;

public class Person {
    private int dni;
    private String fullName;
    private String address;

    public Person(int dni, String fullName, String address) {
        setDni(dni);
        setFullName(fullName);
	    setAddress(address);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
	return this.address;
    }

    public void setAddress(String address) {
	this.address = address;
   }


    @Override
    public String toString() {
        return "Person{" +
                "dni=" + getDni() +
                ", fullName='" + getFullName() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }
}