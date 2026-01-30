package by.warlock.vehicles;

import by.warlock.Vehicle;
import by.warlock.interfaces.Acceleratable;
import by.warlock.interfaces.Breakable;
import by.warlock.interfaces.Refuelled;

public class Bike extends Vehicle implements Breakable, Acceleratable, Refuelled {
    private int fuel;
    private final int fuelConsumption;

    public Bike(String model, int speed, int fuel, int fuelConsumption) {
        super(model, speed);
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public int accelerate() {
        double acceleration = Math.random();
        if (acceleration < 0.3) {
            fuel -= (int) (acceleration * 10);
            return (int) acceleration * 20;
        }
        return 0;
    }

    @Override
    public boolean isBroken() {
        return Math.random() < 0.20;
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
        x += speed + accelerate();
        fuel -= fuelConsumption;
    }

    @Override
    public String toString() {
        return "Мотоцикл " + super.toString();
    }
}
