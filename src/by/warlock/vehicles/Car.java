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
    public void accelerate() {
        double acceleration = Math.random();
        this.speed += (acceleration < 0.3) ? (int) (acceleration * 10) : speed;
        fuel -= (int) (acceleration * 10);
    }

    @Override
    public boolean isBroken() {
        return Math.random() < 0.75;
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
        accelerate();
        x += speed;
        fuel -= fuelConsumption;
    }

    @Override
    public String toString() {
        return "Автомобиль " + super.toString() +
                " прошел дистанцию " + x +
                " со скоростью " + speed;
    }
}
