package by.warlock;

public class Competition {
    private int distance;

    public Competition(int distance) {
        this.distance = distance;
    }

    public Vehicle race (Vehicle[] vehicles) {
        Vehicle winner  = null;
        while(winner == null) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.x <= distance) {
                    vehicle.move();
                } else {
                    winner = vehicle;
                }
            }
        }
        return winner;
    }
}
