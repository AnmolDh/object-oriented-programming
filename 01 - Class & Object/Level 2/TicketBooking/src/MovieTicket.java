public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
    }

    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void bookTicket() {
        int chNo = (int)(Math.random() * 26) + 65;
        char ch = (char)chNo;
        int no = (int)(Math.random() * 21) + 1;
        this.seatNumber = String.valueOf(ch) +  String.valueOf(no);
    }

    public void display() {
        System.out.println("Movie: " + movieName + ", Seat: " + seatNumber + ", Price: " + price);
    }
}
