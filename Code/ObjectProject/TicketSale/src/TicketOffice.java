import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {

  private Long amount;
//  private long ticketPrice;
  private List<Ticket> tickets = new ArrayList<>();


  public TicketOffice(long amount, List<Ticket> tickets){
    this.amount = amount;
    this.tickets.addAll(tickets);
  }

  public Ticket getTicket() {
    return tickets.remove(0);
  }

  public List<Ticket> getTickets() {
    return tickets;
  }

  public void plusAmount(Long amount){
    this.amount += amount;
  }

}
