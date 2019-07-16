
// 가방을 갖고 있는 관람객 클래스
public class Audience {

  private Bag bag;

  public Audience(Bag bag){
    this.bag = bag;
  }

  public Long buy(Ticket ticket){
    if(bag.hasInvitation()){
      bag.setTicket(ticket);
      return 0L;
    } else {
      bag.setTicket(ticket);
      bag.minusCash(ticket.getPrice());
      return ticket.getPrice();
    }
  }
}
