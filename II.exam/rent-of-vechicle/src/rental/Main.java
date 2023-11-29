package rental;

public class Main {
    public static void main(String[] args) {
        Car CarA = new Car(Brand.BMW, "TD500", "SDF-123", 300);
        Car CarB = new Car(Brand.MERCEDES, "XL4500", "ADF-123", 400);
        Car CarE = new Car(Brand.MERCEDES, "X2500", "ADF-123", 350);
        Car CarC = new Car(Brand.BMW, "M5500", "CDF-123", 500);
        Car CarD = new Car(Brand.TRABANT, "T5", "MDF-123", 50);
        double rentalPrice = CarA.calculateRentalCost(10);
        System.out.print("Rentprice of BMW /Model: " + CarA.getModel() + "/ for 10 days: ");
        System.out.println(rentalPrice);
        RentalSystem rentalSystem = new RentalSystem();
        rentalSystem.addCar(CarA);
        rentalSystem.addCar(CarB);
        rentalSystem.addCar(CarC);
        rentalSystem.addCar(CarD);
        System.out.println("\nList of rentable cars: ");
        rentalSystem.displayAvailableCars();
        String plateNr = "CDF-123";
        Car c = rentalSystem.findCarByPlateNumber(plateNr);
        System.out.println("\nFind car with platenumber: " + plateNr);
        c.displayInfo();
    }
}
