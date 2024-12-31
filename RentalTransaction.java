

import java.time.LocalDate;
public class RentalTransaction {
    private String transactionId;
    private Rental rental;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalCost;

    public RentalTransaction(String transactionId, Rental rental, LocalDate startDate, LocalDate endDate) {
        this.transactionId = transactionId;
        this.rental = rental;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalCost = rental.getTotalCost();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Rental getRental() {
        return rental;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String getTransactionDetails() {
        return "Transaction ID: " + transactionId + ", " +
                "Start Date: " + startDate + ", " +
                "End Date: " + endDate + ", " +
                "Total Cost: $" + totalCost;
    }

    public void processReturn() {
        Vehicle vehicle = rental.getVehicle();
        if (vehicle.returnVehicle()) {
            System.out.println("Vehicle returned successfully.");
        } else {
            System.out.println("Return failed: Vehicle not rented.");
        }
    }



}
