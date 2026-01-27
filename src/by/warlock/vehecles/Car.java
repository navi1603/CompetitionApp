package by.warlock.vehecles;

import by.warlock.*;
import by.warlock.interfaces.*;

public class Car extends Vehicle implements Breakable, Refuelled, Mileagable, Accelerating, Handleable {

    public Car(String model, int speed) {
        super(model, speed);
    }

    @Override
    public void accelerate() {

    }

    @Override
    public boolean isBroken() {
        return false;
    }

    @Override
    public void handle() {

    }

    @Override
    public void mileage() {

    }

    @Override
    public void refuel() {

    }
}
