package by.warlock.vehecles;

import by.warlock.Vehicle;
import by.warlock.interfaces.Acceleratable;
import by.warlock.interfaces.Breakable;
import by.warlock.interfaces.Mileagable;
import by.warlock.interfaces.Refuelled;

public class Bike extends Vehicle implements Breakable, Acceleratable, Refuelled, Mileagable {
    public Bike(String model, int speed) {
        super(model, speed);
    }

    @Override
    public void accelerate() {

    }

    @Override
    public boolean isBroken() {
        return Math.random() < 0.35;
    }

    @Override
    public void mileage() {

    }

    @Override
    public void refuel() {

    }
}
