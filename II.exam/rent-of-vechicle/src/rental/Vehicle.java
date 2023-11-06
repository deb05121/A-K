package rental;

public abstract class Vehicle {
    String plateNumber;
    double rentPrice;
    abstract void displayInfo();

    double calculateRentalCost(int days) {
        return rentPrice * days;
    }

    public String getPlateNumber() {
        return plateNumber;
    }
}
