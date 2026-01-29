package by.warlock;

import by.warlock.vehicles.Bicycle;
import by.warlock.vehicles.Car;
import by.warlock.vehicles.Truck;

public class Main {
    public static void main(String[] args) {
        Competition competition = new Competition(1000);

        Car car = new Car("Lada", 60, 50, 10);
        Bicycle bicycle = new Bicycle("Aist", 30);
        Truck truck = new Truck("MAZ", 60, 1000, 100, 20);

        Vehicle []  vehicles = new Vehicle[] {car, bicycle, truck};
        Vehicle winner = competition.race(vehicles);
        System.out.println(winner);
    }
}
