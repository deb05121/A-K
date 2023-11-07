package rental;

public class Main {
    public static void main(String[] args) {
        Car myCarA = new Car(Brand.BMW, "TD500", "SDF-123", 300);
        Car myCarB = new Car(Brand.MERCEDES, "XL4500", "ADF-123", 400);
        Car myCarC = new Car(Brand.BMW, "M5500", "CDF-123", 500);
        Car myCarD = new Car(Brand.TRABANT, "T5", "MDF-123", 50);
        double rentalPrice = myCarA.calculateRentalCost(10);
        System.out.print("Rentprice of BMW /Model: " + myCarA.getModel() + "/ for 10 days: ");
        System.out.println(rentalPrice);
        RentalSystem rentalSystem = new RentalSystem();
        rentalSystem.addCar(myCarA);
        rentalSystem.addCar(myCarB);
        rentalSystem.addCar(myCarC);
        rentalSystem.addCar(myCarD);
        System.out.println("\nList of rentable cars: ");
        rentalSystem.displayAvailableCars();
        String plateNr = "CDF-123";
        Car c = rentalSystem.findCarByPlateNumber(plateNr);
        System.out.println("\nFind car with platenumber: " + plateNr);
        c.displayInfo();
    }
}
