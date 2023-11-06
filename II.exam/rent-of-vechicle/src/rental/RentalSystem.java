package rental;

import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    List<Car> availableCars;

    public RentalSystem() {
        this.availableCars = new ArrayList<>();
    }

    void addCar(Car car){
        availableCars.add(car);
    }
    void displayAvailableCars(){
        System.out.println(availableCars);
    }
    Car findCarByPlateNumber(String plateNumber){
        for (Car c : availableCars ) {
            if(c.getPlateNumber().equals(plateNumber)){
                return c;
            }
        }
        return null;
    }
}
