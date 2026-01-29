package by.warlock.vehicles;

import by.warlock.*;
import by.warlock.interfaces.*;

public class Car extends Vehicle implements Breakable, Refuelled, Acceleratable {
    private int fuel;
    private final int fuelConsumption;

    public Car(String model, int speed, int fuel, int fuelConsumption) {
        super(model, speed);
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public int accelerate() {
        double acceleration = Math.random();

        if(acceleration < 0.3) {
            fuel -= (int) (acceleration * 10);
            return (int) acceleration * 10;
        }
        return 0;
    }

    @Override
    public boolean isBroken() {
        return Math.random() < 0.45;
    }

    @Override
    public void refuel() {
        fuel = 50;
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
        x += speed + accelerate();
        fuel -= fuelConsumption;
    }

    @Override
    public String toString() {
        return "Автомобиль " + super.toString() +
                " прошел дистанцию " + x +
                " со скоростью " + speed;
    }
}
