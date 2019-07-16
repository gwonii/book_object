import java.util.ArrayList;
import java.util.List;

public class TicketSaleExample {

  public static void main(String[] args){


    List<Ticket> tickets = new ArrayList<>();

    for(int i = 0; i < 10; i++){
      Ticket ticket = new Ticket(1000);
      tickets.add(ticket);
    }

    TicketOffice ticketOffice = new TicketOffice(1000,tickets);
    TicketSeller ticketSeller = new TicketSeller(ticketOffice);
    Theater theater = new Theater(ticketSeller);

    Bag bag = new Bag(5000);
    Audience audience = new Audience(bag);


    Invitation invitation = new Invitation();
    Bag bag2 = new Bag(invitation,2000);
    Audience audience2 = new Audience(bag2);

    theater.enter(audience);
    theater.enter(audience2);

    int ticketNum = 0;
    for(Ticket tic : ticketOffice.getTickets()){
      ticketNum++;
    }

    System.out.println("남은 티켓 수 : " + ticketNum + "개" );
  }

}
