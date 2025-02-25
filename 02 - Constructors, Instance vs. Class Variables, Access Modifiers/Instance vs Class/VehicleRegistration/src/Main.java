public class Main {
    public static void main(String[] args) {
        Vehicle.setRegistrationFee(19022.99);

        Vehicle v1 = new Vehicle("hitler", "audi r6");

        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(29321.70);

        v1.displayVehicleDetails();
        
    }
}