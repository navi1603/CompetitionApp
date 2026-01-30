package by.warlock;

public abstract class Vehicle {
    private final String model;
    protected int speed;
    protected int x;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
        resetX();
    }

    public abstract void move();

    public void resetX() {
        this.x = 0;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return model;
    }
}
