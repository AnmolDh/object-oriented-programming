public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double rentalPrice;

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCarModel() {
        return carModel;
    }
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
    public int getRentalDays() {
        return rentalDays;
    }
    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }
    public double getRentalPrice() {
        return rentalPrice;
    }
    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public CarRental(String customerName, String carModel, int rentalDays, double rentalPrice) {
        setCustomerName(customerName);
        setCarModel(carModel);
        setRentalDays(rentalDays);
        setRentalPrice(rentalPrice);
    }

    public double totalPrice() {
        return rentalPrice * rentalDays;
    }
}
