package pl.programator.car.rent.gui;

import pl.programator.car.rent.model.Car;
import pl.programator.car.rent.repositories.CarRepository;

import java.util.Scanner;

public class GUI {
    CarRepository carRepository = new CarRepository();

    public void showMainMenu() {
        System.out.println("1. Lista dostepnych aut");
        System.out.println("2. Wypozycz");
        System.out.println("3. Exit");

        Scanner mojScanner = new Scanner(System.in);
        String choose = mojScanner.nextLine();

        switch (choose) {
            case "1":
                Car[] cars = carRepository.getAvailableCars();
                for (Car currentCar : cars) {
                    currentCar.printCar();
                }
                showMainMenu();
                break;
            case "2":
                System.out.println("Podaj marke: ");
                Scanner mojScanner2 = new Scanner(System.in);
                String brand = mojScanner2.nextLine();
                carRepository.rentCar(brand);

                showMainMenu();
                break;
            case "3":
                System.exit(0);
                break;

                default:
                    System.out.println("Nie wiem co ty gadasz !!");
                    showMainMenu();
                    break;
        }
    }
}
