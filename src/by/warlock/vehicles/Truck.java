package by.warlock.vehicles;

import by.warlock.Vehicle;
import by.warlock.interfaces.Breakable;
import by.warlock.interfaces.Loadable;
import by.warlock.interfaces.Mileagable;
import by.warlock.interfaces.Refuelled;

public class Truck extends Vehicle implements Breakable, Refuelled, Loadable, Mileagable {
    private int fuel;
    private final int fuelConsumption;
    private int odometer;

    public Truck(String model, int speed, int fuel, int fuelConsumption) {
        super(model, speed);
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
        this.odometer = 0;
    }

    @Override
    public boolean isBroken() {
        return Math.random() < 0.35;
    }

    @Override
    public void load() {
        speed -= (int) (speed * 35 / 100);
    }

    @Override
    public boolean mileage() {
        return odometer <= 1500;
    }

    @Override
    public void refuel() {
        this.fuel = 100;
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
        if (mileage()) {
            x += speed;
            odometer += speed;
            fuel -= fuelConsumption;
        }
    }

    @Override
    public String toString() {
        return "Грузовик " + super.toString();
    }
}
