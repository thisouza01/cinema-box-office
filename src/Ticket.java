public class Ticket {
    private double price;
    private String filmName;
    private boolean isSubtitled;

    // constructor
    public Ticket(double price, String filmName, boolean isSubtitled){
        this.price = price;
        this.filmName = filmName;
        this.isSubtitled = isSubtitled;
    }

    public double getPrice() {
        return price;
    }
}
