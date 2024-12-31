public class Motorcycle extends Vehicle {
    private String typeOfMotorcycle;

    public Motorcycle(String vehicleId, String make, String model, int year, double rentalPrice, String typeOfMotorcycle) {
        super(vehicleId, make, model, year, rentalPrice);
        this.typeOfMotorcycle = typeOfMotorcycle;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " - " + typeOfMotorcycle + " motorcycle";
    }
}