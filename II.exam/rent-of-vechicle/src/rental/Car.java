package rental;

public class Car extends Vehicle {
    Brand brand;
    String model;

    @Override
    void displayInfo() {
        System.out.println(this);;
    }

    public Car() {

    }

    public Car(Brand brand, String model, String plateNumber, double rentPrice) {
        this.brand = brand;
        this.model = model;
        this.rentPrice = rentPrice;
        this.plateNumber = plateNumber;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String getPlateNumber() {
        return super.getPlateNumber();
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", model='" + model + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", rental cost for 1 day: " + super.calculateRentalCost(1) + " } ";
    }
}
