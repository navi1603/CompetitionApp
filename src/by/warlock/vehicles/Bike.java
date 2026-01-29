package by.warlock.vehicles;

import by.warlock.Vehicle;
import by.warlock.interfaces.Acceleratable;
import by.warlock.interfaces.Breakable;
import by.warlock.interfaces.Refuelled;

public class Bike extends Vehicle implements Breakable, Acceleratable, Refuelled {
    private int fuel;
    private final int fuelConsumption;
    public Bike(String model, int speed,  int fuel, int fuelConsumption) {
        super(model, speed);
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public boolean isBroken() {
        return Math.random() < 0.35;
    }

    @Override
    public void refuel() {

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
        accelerate();
        x += speed;
        fuel -= fuelConsumption;
    }
}
