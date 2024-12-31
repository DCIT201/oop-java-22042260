
public class Rental {
    private String rentalId;
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;

    public Rental(String rentalId, Vehicle vehicle, Customer customer, int rentalDays) {
        this.rentalId = rentalId;
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
    }

    public double getTotalCost() {
        return vehicle.getRentalPrice() * rentalDays;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }


}
