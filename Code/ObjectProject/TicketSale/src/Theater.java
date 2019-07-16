public class Theater {

  private TicketSeller ticketSeller;

  public Theater(TicketSeller ticketSeller) {
    this.ticketSeller = ticketSeller;
  }

  public void enter(Audience audience) {
    ticketSeller.sellTo(audience);
    //   원래 enter에서 audiance와 ticketOffice에 접근하여 메소드를 수행하였지만
    // 이제 기존의 method는 ticketSeller에 숨기고 theater에서는 ticketSeller의 sellTO 메소드만을 사용한다.

  }
}
