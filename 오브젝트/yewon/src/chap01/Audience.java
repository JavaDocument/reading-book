package chap01;

public class Audience {

    private Bag bag;

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
