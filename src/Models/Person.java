public class Person {
    private int dni;
    private String fullName;

    public Person(int dni, String fullName) {
        setDni(dni);
        setFullName(fullName);
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
}