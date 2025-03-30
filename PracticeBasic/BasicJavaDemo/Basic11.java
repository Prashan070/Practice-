package PracticeBasic.BasicJavaDemo;

public enum Basic11 {
    BOOKEd,
    WL,
    RLWL,
    RAC;
   private static final String Des="prashan";
}

class Ticket {

    Long ticketNumber;
    Basic11 ticketstatus;

    public Ticket(Long ticketNumber, Basic11 ticketstatus) {
        this.ticketNumber = ticketNumber;
        this.ticketstatus = ticketstatus;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber=" + ticketNumber +
                ", ticketstatus=" + ticketstatus +
                '}';
    }
}
class booking{


    public static void main(String[] args) {

        Ticket ticket = new Ticket(111111L, Basic11.WL);
        System.out.println(ticket);

    }
}