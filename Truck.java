public class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String vehicleId, String make, String model, int year, double rentalPrice, double payloadCapacity) {
        super(vehicleId, make, model, year, rentalPrice);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " - " + payloadCapacity + " lbs capacity";
    }
}