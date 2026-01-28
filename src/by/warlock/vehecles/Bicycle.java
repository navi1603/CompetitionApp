package by.warlock.vehecles;

import by.warlock.interfaces.Breakable;
import by.warlock.Vehicle;

public class Bicycle extends Vehicle implements Breakable {

    public Bicycle(String model, int speed) {
        int bicycleSpeed = 40;
        if(speed <= 40){
            bicycleSpeed = speed;
        }
        super(model, bicycleSpeed);
    }

    @Override
    public boolean isBroken() {
        return Math.random() < 0.25;
    }
}
