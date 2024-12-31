public class Car extends Vehicle {
    private int numDoors;

    public Car(String vehicleId, String make, String model, int year, double rentalPrice, int numDoors) {
        super(vehicleId, make, model, year, rentalPrice);
        this.numDoors = numDoors;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " - " + numDoors + " doors";
    }
}