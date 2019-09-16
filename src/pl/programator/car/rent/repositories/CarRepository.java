package pl.programator.car.rent.repositories;

import pl.programator.car.rent.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private List<Car> carsDB = new ArrayList<>();

    public CarRepository() {
        Car c1 = new Car("BMW", "3", 200.00);
        Car c2 = new Car("Audi", "A4", 200.00);
        Car c3 = new Car("Honda", "Civic", 200.00);
        Car c4 = new Car("Toyota", "Corolla", 200.00);
        Car c5 = new Car("Mercedes", "ML", 200.00);

        carsDB.add(c1);
        carsDB.add(c2);
        carsDB.add(c3);
        carsDB.add(c4);
        carsDB.add(c5);
    }

    public Car getCarByBrand(String brand) {
        for(int i = 0; i < carsDB.size(); i++) {
            if(this.carsDB.get(i).getBrand() == brand) {
                return this.carsDB.get(i);
            }
        }

        return null;
    }

    public void rentCar(String brand) {
        for (Car currentCar : this.carsDB) {
            if(currentCar.getBrand().equals(brand)) {
                currentCar.setRent(true);
                return;
            }
        }
    }

    public List<Car> getAvailableCars() {
        List<Car> availableCars = new ArrayList<>();
        for (Car currentCar : this.carsDB) {
            if(!currentCar.isRent()) {
                availableCars.add(currentCar);
            }
        }

        return availableCars;
    }


}
