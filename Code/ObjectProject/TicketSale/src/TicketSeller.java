public class TicketSeller {

  private TicketOffice ticketOffice;

  public TicketSeller(TicketOffice ticketOffice){
    this.ticketOffice = ticketOffice;
  }

  public TicketOffice getTicketOffice() {
    return ticketOffice;
  }

  public void sellTo(Audience audience){
    if (audience.getBag().hasInvitation()) {
      // 초대장을 가지고 있다면??
      Ticket ticket = ticketOffice.getTicket();
      audience.getBag().setTicket(ticket);
    } else {
      // 초대장을 가지고 있지 않다면?
      Ticket ticket = ticketOffice.getTicket();
      audience.getBag().minusCash(ticket.getPrice());
      ticketOffice.plusAmount(ticket.getPrice());
      audience.getBag().setTicket(ticket);
    }
  }
  // 이렇게 되면 Theater에서 audiance와 ticketOffice에 모두 접근했으나 이제
  // ticketSeller에서만 audiance와 ticketOffice에 접근한다.

}
