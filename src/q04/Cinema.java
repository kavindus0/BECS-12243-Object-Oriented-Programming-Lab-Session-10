package q04;

public class Cinema {
    
    private Ticket[] tickets;
    private int ticketCount;

    public Cinema(int capacity) {
        tickets = new Ticket[capacity];
        ticketCount = 0;
    }

    public void bookTicket(Ticket ticket) {
        if (ticketCount < tickets.length) {
            tickets[ticketCount++] = ticket;
            System.out.println("Ticket booked successfully");
        } else {
            System.out.println("Cinema is full");
        }
    }

    public void displayAllTickets() {
        for (int i = 0; i < ticketCount; i++) {
            System.out.println(tickets[i]);
        }
    }
}
