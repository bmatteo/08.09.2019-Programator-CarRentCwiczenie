package pl.programator.car.rent.model;

public class Car {
    private String brand;
    private String model;
    private double price;
    private boolean rent;

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.rent = false;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isRent() {
        return this.rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public void printCar() {
        System.out.println("Car = brand: " + this.brand + " model: " + this.model);
    }
}
