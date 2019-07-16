public class TicketSeller {

  private TicketOffice ticketOffice;

  public TicketSeller(TicketOffice ticketOffice) {
    this.ticketOffice = ticketOffice;
  }

  public TicketOffice getTicketOffice() {
    return ticketOffice;
  }

  public void sellTo(Audience audience) {
    ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    // 기존의 TicketSeller가 Audience의 Bag에 접근하지 않고,
    // 그 권한을 모두 Audience의 buy메소드에 줌으로써
    // TicketSeller와 Bag의 결합도가 낮아졌다.
  }
}
