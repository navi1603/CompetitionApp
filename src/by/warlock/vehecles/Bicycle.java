package by.warlock.vehecles;

import by.warlock.interfaces.Breakable;
import by.warlock.Vehicle;

public class Bicycle extends Vehicle implements Breakable {

    public Bicycle(String model, int speed) {
        super(model, speed);
    }

    @Override
    public boolean isBroken() {
        return Math.random() < 0.85;
    }
}
