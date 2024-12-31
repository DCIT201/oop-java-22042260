

    public abstract class Vehicle {
        private String vehicleId;
        private String make;
        private String model;
        private int year;
        private double rentalPrice;
        private double baseRentalRate;
        private boolean isRented;

        public Vehicle(String vehicleId, String make, String model, int year, double rentalPrice) {
            this.vehicleId = vehicleId;
            this.make = make;
            this.model = model;
            this.year = year;
            this.rentalPrice = rentalPrice;
            this.baseRentalRate = baseRentalRate;
            this.isRented = false;
        }

        public boolean rent() {
            if (!isRented) {
                isRented = true;
                return true;
            }
            return false;
        }

        public boolean returnVehicle() {
            if (isRented) {
                isRented = false;
                return true;
            }
            return false;
        }

        public String getInfo() {
            return year + " " + make + " " + model + " - $" + rentalPrice + "/day";
        }

        public boolean isRented() {
            return isRented;
        }

        public double getRentalPrice() {
            return rentalPrice;
        }

        public String getVehicleId() {
            return vehicleId;
        }
    }
 //Derived Classes: Car, Truck, Motorcycle







