package q04;

public class Ticket {
    
    private Movie movie;
    private String seatNumber;
    private double price;

    public Ticket(Movie movie, String seatNumber, double price) {
        this.movie = movie;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public String toString() {
        return "Movie: " + movie.getTitle() + ", Seat: " + seatNumber + ", Price: Rs." + price;
    }
}
