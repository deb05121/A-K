package rental;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(Brand.BMW, "TB500","SDF-123", 300);
        myCar.calculateRentalCost(10);

    }
}
