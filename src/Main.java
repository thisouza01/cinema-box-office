public class Main {

    public static void main(String[] args){
        Ticket ticket1 = new Ticket(100, "Avatar 2", false);
        HalfTicket ticket2 = new HalfTicket(100, "Avatar 2", false);
        FamilyTicket ticket3 = new FamilyTicket(100, "Avatar 2", false,4);

        System.out.println(ticket1.getPrice());
        System.out.println(ticket2.getPrice());
        System.out.println(ticket3.getPrice());
    }
}
