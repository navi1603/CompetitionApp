package by.warlock.vehicles;

import by.warlock.Vehicle;
import by.warlock.interfaces.*;

public class Truck extends Vehicle implements Breakable, Refuelled, Loadable, Mileagable {
    private int fuel;
    private final int fuelConsumption;
    private final int odometer;

    public Truck(String model, int speed, int odometer, int fuel, int fuelConsumption) {
        super(model, speed);
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
        this.odometer = odometer;
    }

    @Override
    public boolean isBroken() {
        return Math.random() < 0.65;
    }

    @Override
    public void load() {
        speed -= (int) (speed * 0.35);
    }

    @Override
    public boolean mileage() {
        return odometer < x;
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
            fuel -= fuelConsumption;
        }
    }

    @Override
    public String toString() {
        return "Грузовик " + super.toString() +
                " прошел дистанцию " + x +
                " со скоростью " + speed;
    }
}
