package by.warlock;

public abstract class Vehicle {
    private String  model;
    private int speed;
    private int x;


    public void move() {
        this.x += speed;
    }
}
