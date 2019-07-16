import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {

  private long ticketPrice;
  private List<Ticket> tickets = new ArrayList<>();


  public TicketOffice(long ticketPrice, List<Ticket> tickets){
    this.ticketPrice = ticketPrice;
    this.tickets.addAll(tickets);
  }

  public Ticket getTicket() {
    return tickets.remove(0);
  }

  public List<Ticket> getTickets() {
    return tickets;
  }
}
