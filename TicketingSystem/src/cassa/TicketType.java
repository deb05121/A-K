package cassa;

public enum TicketType {
    SEAT( 1000),
    VIP( 2000),
    STANDING_TICKET( 500);

    private final int price;

    TicketType( int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
