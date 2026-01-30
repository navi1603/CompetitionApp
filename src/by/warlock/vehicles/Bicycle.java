package by.warlock.vehicles;

import by.warlock.Vehicle;
import by.warlock.interfaces.Breakable;

public class Bicycle extends Vehicle implements Breakable {

    public Bicycle(String model, int speed) {
        super(model, speed);
    }

    @Override
    public boolean isBroken() {
        return Math.random() < 0.10;
    }

    @Override
    public void move() {
        if (isBroken()) {
            return;
        }
        x += speed;
    }

    @Override
    public String toString() {
        return "Велосипед " + super.toString();
    }
}
