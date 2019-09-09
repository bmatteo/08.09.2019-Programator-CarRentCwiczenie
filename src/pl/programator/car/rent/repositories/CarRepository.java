package pl.programator.car.rent.repositories;

import pl.programator.car.rent.model.Car;

public class CarRepository {
    private Car[] carsDB = new Car[5];

    public CarRepository() {
        Car c1 = new Car("BMW", "3", 200.00);
        Car c2 = new Car("Audi", "A4", 200.00);
        Car c3 = new Car("Honda", "Civic", 200.00);
        Car c4 = new Car("Toyota", "Corolla", 200.00);
        Car c5 = new Car("Mercedes", "ML", 200.00);

        this.carsDB[0] = c1;
        this.carsDB[1] = c2;
        this.carsDB[2] = c3;
        this.carsDB[3] = c4;
        this.carsDB[4] = c5;
    }

    public Car getCarByBrand(String brand) {
        for(int i = 0; i < carsDB.length; i++) {
            if(this.carsDB[i].getBrand() == brand) {
                return this.carsDB[i];
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

    public Car[] getAvailableCars() {
        Car[] availableCars = new Car[this.carsDB.length];
        int i = 0;
        for (Car currentCar : this.carsDB) {
            if(!currentCar.isRent()) {
                availableCars[i++] = currentCar;
            }
        }

        return availableCars;
    }


}
