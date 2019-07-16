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

  // 객체의 여부를 확인 할 때는 null과의 비교를 한다.
  public boolean hasInvitation() {
    return invitation != null;
  }

  public boolean hasTicket() {
    return ticket != null;
  }

  public void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }

  public void plusCash(long cash) {
    this.cash += cash;
  }

  public void minusCash(long cash) {
    this.cash -= cash;
  }

  public long getCash() {
    return cash;
  }
}
