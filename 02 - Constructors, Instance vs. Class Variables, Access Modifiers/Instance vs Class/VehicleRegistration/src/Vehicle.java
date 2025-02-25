public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee;

    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public static double getRegistrationFee() {
        return registrationFee;
    }
    public static void setRegistrationFee(double registrationFee) {
        Vehicle.registrationFee = registrationFee;
    }

    public Vehicle(String ownerName, String vehicleType) {
        setOwnerName(ownerName);
        setVehicleType(vehicleType);
    }

    public void displayVehicleDetails(){
        System.out.println("Owner: " + getOwnerName());
        System.out.println("Vehicle Type: " + getVehicleType());
        System.out.println("Registration Fee: " + getRegistrationFee());
    }

    public static void updateRegistrationFee(double newRegistrationFee){
        setRegistrationFee(newRegistrationFee);
    }
}
