package by.warlock.vehecles;

import by.warlock.*;
import by.warlock.interfaces.*;

public class Car extends Vehicle implements Breakable, Refuelled, Mileagable, Acceleratable {
    private int fuel;

    public Car(String model, int speed, int fuel) {
        super(model, speed);
        this.fuel = fuel;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public boolean isBroken() {
        return Math.random() < 0.75;
    }

    @Override
    public void mileage() {

    }

    @Override
    public void refuel() {
        this.fuel++;
    }

    @Override
    public void move() {
        if (this.fuel < 1) {
            refuel();
            return;
        }
        super.move();
    }
}
