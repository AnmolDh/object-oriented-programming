public class Main {
    public static void main(String[] args) {
        HotelBooking hb = new HotelBooking();
        HotelBooking hb2 = new HotelBooking("hell", "lux", 3);
        HotelBooking hb3 = new HotelBooking(hb2);

        System.out.println(hb.getGuestName());
        System.out.println(hb2.getGuestName());
        System.out.println(hb3.getGuestName());
    }
}