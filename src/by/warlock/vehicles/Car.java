package by.warlock.vehicles;

import by.warlock.Vehicle;
import by.warlock.interfaces.Breakable;
import by.warlock.interfaces.Refuelled;

public class Car extends Vehicle implements Breakable, Refuelled {
    private int fuel;
    private final int fuelConsumption;

    public Car(String model, int speed, int fuel, int fuelConsumption) {
        super(model, speed);
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public boolean isBroken() {
        return Math.random() < 0.35;
    }

    @Override
    public void refuel() {
        fuel = 50;
    }

    @Override
    public void move() {
        if (fuel < 1) {
            refuel();
            return;
        }
        if (isBroken()) {
            return;
        }
        x += speed;
        fuel -= fuelConsumption;
    }

    @Override
    public String toString() {
        return "Автомобиль " + super.toString();
    }
}
