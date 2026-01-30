package by.warlock;

import by.warlock.vehicles.Bicycle;
import by.warlock.vehicles.Bike;
import by.warlock.vehicles.Car;
import by.warlock.vehicles.Truck;

public class Main {
    public static void main(String[] args) {
        Competition competition = new Competition(1000);

        Car car = new Car("Lada", 60, 50, 10);
        Bicycle bicycle = new Bicycle("Aist", 40);
        Truck truck = new Truck("MAZ", 85, 100, 20);
        truck.load();
        Bike bike = new Bike("Honda", 50, 20, 3);

        Vehicle[] vehicles = new Vehicle[]{truck, car, bicycle, bike};
        Vehicle winner = competition.race(vehicles);
        System.out.println("Победитель соревнований №1! \n" + winner);

        for (Vehicle vehicle : vehicles) {
            vehicle.resetX();
        }
        winner = competition.race(vehicles);
        System.out.println("Победитель соревнований №2! \n" + winner);

    }
}
