public class Bag {

  private long cash;
  private Invitation invitation;
  private Ticket ticket;


  // 생성자
  // 초기에 설정해 줄 값들은 1. 초대장의 여부 2. 현재 갖고 있는 현금
  // 티켓은 입장할 때 사야하기 때문에 초기에 설정해 줄 필요가 없다.
  public Bag(long cash) {
    this.cash = cash;
  }

  public Bag(Invitation invitation, long cash) {
    this.invitation = invitation;
    this.cash = cash;
  }

  public Long hold(Ticket ticket){
    if(hasInvitation()){
      setTicket(ticket);
      return 0L;
    } else {
      setTicket(ticket);
      minusCash(ticket.getPrice());
      return ticket.getPrice();
    }
  }

  // 객체의 여부를 확인 할 때는 null과의 비교를 한다.
  private boolean hasInvitation() {
    return invitation != null;
  }

  private boolean hasTicket() {
    return ticket != null;
  }

  private void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }

  private void minusCash(long cash) {
    this.cash -= cash;
  }

  public long getCash() {
    return cash;
  }
}
