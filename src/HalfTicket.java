public class HalfTicket extends Ticket{

    public HalfTicket(double price,
                      String filmName,
                      boolean isSubtitled) {
        super(price, filmName, isSubtitled);
    }

    @Override
    public double getPrice() {
        return (super.getPrice() / 2);
    }
}
