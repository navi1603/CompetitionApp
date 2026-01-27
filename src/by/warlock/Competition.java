package by.warlock;

public class Competition {
    private int distance;
    private Vehicle[] vehicles;

    public Competition(int distance) {
        this.distance = distance;
    }

    public Vehicle race (Vehicle[] vehicles) {
        Vehicle winner  = null;
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            if(vehicle.getX() == distance) {
                winner = vehicle;
            }
        }
        return winner;
    }
}
