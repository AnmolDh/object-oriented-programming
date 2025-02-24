public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking(){
        this.guestName = "";
        this.roomType = "";
        this.nights = 0;
    }

    public HotelBooking(String guestName, String roomType, int nights){
        setGuestName(guestName);
        setRoomType(roomType);
        setNights(nights);
    }

    public HotelBooking(HotelBooking hotelBooking){
        setGuestName(hotelBooking.getGuestName());
        setRoomType(hotelBooking.getRoomType());
        setNights(hotelBooking.getNights());
    }

    public String getGuestName() {
        return guestName;
    }
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }
    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public int getNights() {
        return nights;
    }
    public void setNights(int nights) {
        this.nights = nights;
    }
}
