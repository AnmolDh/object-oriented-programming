public class Main {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket("Random", 199.0);
        movieTicket.setPrice(159.99);

        movieTicket.bookTicket();

        movieTicket.display();
    }
}