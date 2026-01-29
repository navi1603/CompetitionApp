package by.warlock;

public abstract class Vehicle {
    private final String  model;
    protected int speed;
    protected int x;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
        this.x = 0;
    }

    public abstract void move();

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return  model;
    }
}
