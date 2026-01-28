package by.warlock.vehecles;

import by.warlock.Vehicle;
import by.warlock.interfaces.*;

public class Truck extends Vehicle implements Breakable, Acceleratable, Loadable, Mileagable, Refuelled {

    public Truck(String model, int speed) {
        super(model, speed);
    }

    @Override
    public void accelerate() {

    }

    @Override
    public boolean isBroken() {
        return Math.random() < 0.65;
    }

    @Override
    public void load() {

    }

    @Override
    public void mileage() {

    }

    @Override
    public void refuel() {

    }
}
