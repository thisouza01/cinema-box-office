public class FamilyTicket extends Ticket{

    private final int numberOfPeople;

    public FamilyTicket(double price,
                        String filmName,
                        boolean isSubtitled,
                        int numberOfPeople) {
        super(price, filmName, isSubtitled);

        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public double getPrice() {
        if (numberOfPeople < 3){
            return (super.getPrice() * 3);
        } else {
            return ((super.getPrice() * 3) * 0.95);
        }
    }
}
