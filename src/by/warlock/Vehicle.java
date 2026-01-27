package by.warlock;

public abstract class Vehicle {
    private final String  model;
    private final int speed;
    protected int x;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
        this.x = 0;
    }

    public void move() {
        this.x += speed;
    }
}
