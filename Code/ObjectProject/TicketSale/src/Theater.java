public class Theater {

  private TicketSeller ticketSeller;

  public Theater (TicketSeller ticketSeller){
    this.ticketSeller = ticketSeller;
  }

  public void enter(Audience audience){
    if(audience.getBag().hasInvitation()){
      // 초대장을 가지고 있다면??
      Ticket ticket = ticketSeller.getTicketOffice().getTicket();
      audience.getBag().setTicket(ticket);
    } else{
      // 초대장을 가지고 있지 않다면?
      Ticket ticket = ticketSeller.getTicketOffice().getTicket();
      audience.getBag().minusCash(ticket.getPrice());
      audience.getBag().setTicket(ticket);
    }
  }
}
