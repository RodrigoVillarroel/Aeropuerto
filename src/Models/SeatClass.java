package Models;

public class SeatClass {
    // =========================== PROPERTIES ===================================
    private String name;
    private int price;

    // ========================== CONSTRUCTORS ==================================
    public SeatClass(String name, int price) {
        setName(name);
        setPrice(price);
    }
    public SeatClass() {
    }
    // ====================== GETTERS & SETTERS ================================

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // ============================= METHODS ====================================
    // ============================ OVERRIDES ===================================
    // ============================ TO STRING ===================================


    @Override
    public String toString() {
        return "\nSEATCLASS[" +
                "\nName:'" + getName() + '\'' +
                ", \nPrice:" + getPrice() +
                ']';
    }
}
