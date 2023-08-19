public class Person {
    private int dni;
    private String fullName;
    private String addres;

    public Person(int dni, String fullName, String addres) {
        setDni(dni);
        setFullName(fullName);
	setAddres(addres);
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
	return this.addres;
    }

    public void setAddres(String addres) {
	this.addres = addres;
   }

}