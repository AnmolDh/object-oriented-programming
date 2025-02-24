public class Main {
    public static void main(String[] args) {
        CarRental carRental = new CarRental("hitler", "saddamHussain", 7, 3000.0);
        System.out.println(carRental.totalPrice());
    }
}